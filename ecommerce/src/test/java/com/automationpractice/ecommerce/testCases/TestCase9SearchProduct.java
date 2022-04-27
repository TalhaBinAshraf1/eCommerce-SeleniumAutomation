package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase9SearchProductPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase9SearchProduct extends BaseClass{

    @Test
    public void testCase9SearchProduct(){

        TestCase9SearchProductPages tc9spp =new TestCase9SearchProductPages(driver);

//     TC - 4. Click on 'Products' button

        if (tc9spp.getProductsButton().isDisplayed())
        {
            String productsButtonText= tc9spp.getProductsButton().getText();
            System.out.println(productsButtonText + Data.POSITIVE_MASSAGE);
            Assert.assertTrue(true,productsButtonText);
            tc9spp.getProductsButton().click();
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

        if (tc9spp.getAllProductText().isDisplayed())
        {
            String allProductText = tc9spp.getAllProductText().getText();
            System.out.println(allProductText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(allProductText,Data.ALL_PRODUCTS_TEXT);
            sleepTest(1000);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

//      TC  -  6. Enter product name in search input and click search button

        tc9spp.getSearchProductinputField().isDisplayed();
        tc9spp.getSearchProductinputField().sendKeys(Data.PRODUCTS_NAME);
        tc9spp.getSearchButton().click();
        sleepTest(10000);


//      TC  -  7. Verify 'SEARCHED PRODUCTS' is visible
        tc9spp.getSearchedProduct().isDisplayed();

        if (tc9spp.getSearchedProduct().isDisplayed())
        {
            String searchedProduct = tc9spp.getSearchedProduct().getText();
            System.out.println(searchedProduct + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(searchedProduct,Data.PRODUCTS_NAME);
            sleepTest(1000);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        sleepTest(1000);

    }
}
