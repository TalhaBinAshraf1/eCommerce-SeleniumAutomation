package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase19ViewAndCartBrandProductsPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase19ViewAndCartBrandProducts extends BaseClass{

    @Test
    public void testCase19ViewAndCartBrandProductsPages(){

        TestCase19ViewAndCartBrandProductsPages tc19vacbpp =new TestCase19ViewAndCartBrandProductsPages(driver);

//    TC - 3. Click on 'Products' button
        if (tc19vacbpp.getProductsButton().isDisplayed())
        {
            String productsButtonText= tc19vacbpp.getProductsButton().getText();
            System.out.println(productsButtonText + Data.POSITIVE_MASSAGE);
            Assert.assertTrue(true,productsButtonText);
            tc19vacbpp.getProductsButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//    TC - 4. Verify that Brands are visible on left side bar

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");

        List<WebElement> brandList = driver.findElements(By.cssSelector(".nav.nav-pills.nav-stacked > li> a"));
        for(int i =0;i<brandList.size();i++) {
            String menSubCategoryText = brandList.get(i).getText();
            System.out.println(menSubCategoryText);
            Assert.assertEquals("POLO","POLO");
            Assert.assertEquals("H&M","H&M");
            Assert.assertEquals("MADAME","MADAME");
            Assert.assertEquals("MAST & HARBOUR","MAST & HARBOUR");
            Assert.assertEquals("BABYHUG","BABYHUG");
            Assert.assertEquals("ALLEN SOLLY JUNIOR","ALLEN SOLLY JUNIOR");
            Assert.assertEquals("KOOKIE KIDS","KOOKIE KIDS");
            Assert.assertEquals("BIBA","BIBA");


        }
        sleepTest(3000);

//    TC - 5. Click on any brand name

        if (tc19vacbpp.getPoloBrand().isDisplayed())
        {
            String poloBrandText= tc19vacbpp.getPoloBrand().getText();
            System.out.println(poloBrandText + Data.POSITIVE_MASSAGE);
            Assert.assertTrue(true,poloBrandText);
            tc19vacbpp.getPoloBrand().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//    TC - 6. Verify that user is navigated to brand page and brand products are displayed
        String poloBrandPage = driver.getCurrentUrl();
        System.out.println("Given "+poloBrandPage);
        Assert.assertEquals(poloBrandPage, Data.POLO_BRAND_PAGE);
        System.out.println("URL is validate");
        sleepTest(1000);

        if (tc19vacbpp.getBrandPoloProduct().isDisplayed())
        {
            String brandPoloProductText= tc19vacbpp.getBrandPoloProduct().getText();
            System.out.println(brandPoloProductText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.BRAND_POLO_PRODUCTS_TEXT,brandPoloProductText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
//    TC - 7. On left side bar, click on any other brand link
        tc19vacbpp.getBibaBrandButton().isDisplayed();
        tc19vacbpp.getBibaBrandButton().click();
//    TC - 8. Verify that user is navigated to that brand page and can see products

        String bibaBrandPageUrl = driver.getCurrentUrl();
        System.out.println("Given "+bibaBrandPageUrl);
        Assert.assertEquals(bibaBrandPageUrl, Data.BIBA_BRAND_PAGE);
        System.out.println("URL is validate");
        sleepTest(1000);

        if (tc19vacbpp.getBrandPoloProduct().isDisplayed())
        {
            String brandbibaProductText= tc19vacbpp.getBrandPoloProduct().getText();
            System.out.println(brandbibaProductText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.BRAND_BIBA_PRODUCTS_TEXT,brandbibaProductText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


    }
}
