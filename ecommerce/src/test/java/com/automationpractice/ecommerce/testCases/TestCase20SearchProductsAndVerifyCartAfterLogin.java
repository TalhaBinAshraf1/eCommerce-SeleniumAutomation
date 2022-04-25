package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase20SearchProductsAndVerifyCartAfterLoginPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase20SearchProductsAndVerifyCartAfterLogin extends BaseClass{

    @Test
    public void testCase20SearchProductsAndVerifyCartAfterLoginPages(){

        TestCase20SearchProductsAndVerifyCartAfterLoginPages tc20spavcalp = new TestCase20SearchProductsAndVerifyCartAfterLoginPages(driver);

//     TC - 3. Click on 'Products' button

        if (tc20spavcalp.getProductsButton().isDisplayed())
        {
            String productsButtonText= tc20spavcalp.getProductsButton().getText();
            System.out.println(productsButtonText + Data.POSITIVE_MASSAGE);
            Assert.assertTrue(true,productsButtonText);
            tc20spavcalp.getProductsButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


//     TC - 4. Verify user is navigated to ALL PRODUCTS page successfully

        String productPageUrl = driver.getCurrentUrl();
        System.out.println("Given "+productPageUrl);
        Assert.assertEquals(productPageUrl, Data.PRODUCTS_PAGE_LINK);
        System.out.println("URL is validate");
        sleepTest(1000);

//     TC - 5. Enter product name in search input and click search button

        tc20spavcalp.getSearchProductinputField().isDisplayed();
        tc20spavcalp.getSearchProductinputField().sendKeys(Data.PRODUCTS_NAME);
        tc20spavcalp.getSearchButton().click();
        sleepTest(10000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

        if (tc20spavcalp.getAllProductText().isDisplayed())
        {
            String searchedProductText = tc20spavcalp.getAllProductText().getText();
            System.out.println(searchedProductText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(searchedProductText,Data.SEARCHED_PRODUCTS_TEXT);
            sleepTest(1000);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


//     TC - 6. Verify 'SEARCHED PRODUCTS' is visible

        tc20spavcalp.getSearchedProduct().isDisplayed();

        if (tc20spavcalp.getSearchedProduct().isDisplayed())
        {
            String searchedProduct = tc20spavcalp.getSearchedProduct().getText();
            System.out.println(searchedProduct + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(searchedProduct,Data.PRODUCTS_NAME);
            sleepTest(1000);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

        sleepTest(3000);

//     TC - 8. Add those products to cart

        Actions actionOne = new Actions(driver);
        actionOne.moveToElement(tc20spavcalp.getFirstProduct()).perform();
        sleepTest(2000);
        tc20spavcalp.getAddToCartButton().isDisplayed();
        sleepTest(2000);
        tc20spavcalp.getAddToCartButton().click();
        sleepTest(2000);

        if(tc20spavcalp.getViewCartButton().isDisplayed()){
            String viewCartButtonText= tc20spavcalp.getViewCartButton().getText();
            Assert.assertEquals(Data.VIEW_CART_BUTTON_TEXT,viewCartButtonText);
            System.out.println( "✔" + viewCartButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc20spavcalp.getViewCartButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//     TC - 9. Click 'Cart' button and verify that products are visible in cart
        String viewCartPageLink = driver.getCurrentUrl();
        System.out.println("Given "+viewCartPageLink);
        Assert.assertEquals(viewCartPageLink, Data.VIEW_CART_PAGE_URL);
        System.out.println("Product Page URL is validate");
        sleepTest(1000);

        tc20spavcalp.getQuantityField().isDisplayed();
        String quantityNumber = tc20spavcalp.getQuantityField().getText();
        System.out.printf(quantityNumber);
        Assert.assertEquals(quantityNumber,"1");
        sleepTest(2000);

//     TC - 10. Click 'Signup / Login' button and submit login details
        tc20spavcalp.getSignupLoginButton().isDisplayed();
        tc20spavcalp.getSignupLoginButton().click();

        //Url Validation
        String loginURL = driver.getCurrentUrl();
        System.out.println("Given "+loginURL);
        Assert.assertEquals(loginURL , Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("login URL is validate");

        if (tc20spavcalp.getLoginToYourAccountText().isDisplayed())
        {
            String loginToYourText= tc20spavcalp.getLoginToYourAccountText().getText();
            System.out.println(loginToYourText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGIN_TO_YOUR_ACCoUNT_TEXT,loginToYourText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //      Enter correct email address and password

        tc20spavcalp.getEmailAddressInputField().sendKeys(Data.DEMO_EMAIL);
        tc20spavcalp.getPasswordInputField().sendKeys(Data.DEMO_PASSWORD);

        //     Click 'login' button
        tc20spavcalp.getLoginButton().click();

//     TC - 11. Again, go to Cart page
        tc20spavcalp.getCartbutton().isDisplayed();
        tc20spavcalp.getCartbutton().click();

//     TC - 12. Verify that those products are visible in cart after login as well


        Assert.assertEquals(viewCartPageLink, Data.VIEW_CART_PAGE_URL);
        System.out.println("Product Page URL is validate");
        sleepTest(1000);

        tc20spavcalp.getQuantityField().isDisplayed();
        String blueTopQuantityNumber = tc20spavcalp.getQuantityField().getText();
        System.out.printf(blueTopQuantityNumber);
        sleepTest(2000);

    }
}
