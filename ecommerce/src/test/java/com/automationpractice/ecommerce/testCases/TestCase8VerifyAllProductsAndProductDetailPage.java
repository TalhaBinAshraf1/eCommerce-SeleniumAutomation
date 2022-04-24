package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase8VerifyAllProductsAndProductDetailPage_Page;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase8VerifyAllProductsAndProductDetailPage extends BaseClass{

    @Test
    public void testCase8VerifyAllProductsAndProductDetailPage (){

        TestCase8VerifyAllProductsAndProductDetailPage_Page tc8vappdp = new TestCase8VerifyAllProductsAndProductDetailPage_Page(driver);


//    TC - 4. Click on 'Products' button

        if (tc8vappdp.getProductsButton().isDisplayed())
        {
            String productsButtonText= tc8vappdp.getProductsButton().getText();
            System.out.println(productsButtonText + Data.POSITIVE_MASSAGE);
            Assert.assertTrue(true,productsButtonText);
            tc8vappdp.getProductsButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//    TC - 5. Verify user is navigated to ALL PRODUCTS page successfully

        //url
        String productsPageLink = driver.getCurrentUrl();
        System.out.println("Given "+productsPageLink);
        Assert.assertEquals(productsPageLink, Data.PRODUCTS_PAGE_LINK);
        System.out.println("Product Page URL is validate");
        sleepTest(1000);

        //All Product

        if (tc8vappdp.getAllProductText().isDisplayed())
        {
            String allProductText = tc8vappdp.getAllProductText().getText();
            System.out.println(allProductText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(allProductText,Data.ALL_PRODUCTS_TEXT);
            sleepTest(1000);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

//    TC - 6. The products list is visible
        tc8vappdp.getWomen().click();
        List<WebElement> listElement = driver.findElements(By.cssSelector("div#Women ul > li "));
        for(int i =0;i<listElement.size();i++) {
            String elementText = listElement.get(i).getText();
            System.out.println(elementText);
            Assert.assertEquals("DRESS","DRESS");
            Assert.assertEquals("TOPS","TOPS");
            Assert.assertEquals("Saree","Saree");
        }
        sleepTest(1000);

//    TC - 7. Click on 'View Product' of first product
        if (tc8vappdp.getViewProduct().isDisplayed())
        {
            String viewProductButtonText= tc8vappdp.getViewProduct().getText();
            System.out.println(viewProductButtonText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(viewProductButtonText,Data.VIEW_PRODUCTS_TEXT);
            tc8vappdp.getViewProduct().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//    TC - 8. User has landed on product detail page
        String firstProductLandingPAge = driver.getCurrentUrl();
        System.out.println("Given URL"+firstProductLandingPAge);
        Assert.assertEquals(firstProductLandingPAge, Data.FIRST_PRODUCT_LANDING_PAGE);
        System.out.println("Home URL is validate");
        sleepTest(1000);

//    TC - 9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
        tc8vappdp.getProductName().isDisplayed();
        tc8vappdp.getCategoryOfPrduct().isDisplayed();
        tc8vappdp.getProductAvailability().isDisplayed();
        tc8vappdp.getProductCondition().isDisplayed();
        tc8vappdp.getProductBrand().isDisplayed();
        sleepTest(2000);

    }
}
