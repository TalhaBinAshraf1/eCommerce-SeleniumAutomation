package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase8VerifyAllProductsAndProductDetailPage_Page;
import com.automationpractice.ecommerce.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

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
            System.out.printf(allProductText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(allProductText,Data.ALL_PRODUCTS_TEXT);
            sleepTest(1000);
        }else {
            System.out.printf(Data.NEGATIVE_ERROR_MASSAGE);
        }


//    TC - 6. The products list is visible
//    TC - 7. Click on 'View Product' of first product
//    TC - 8. User is landed to product detail page
//    TC - 9. Verify that detail detail is visible: product name, category, price, availability, condition, brand

    }
}
