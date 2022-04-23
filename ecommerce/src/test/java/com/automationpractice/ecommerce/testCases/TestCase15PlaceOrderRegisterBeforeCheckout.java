package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase15PlaceOrderRegisterBeforeCheckoutPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase15PlaceOrderRegisterBeforeCheckout extends BaseClass {

    @Test

    public void testCase15PlaceOrderRegisterBeforeCheckoutPages(){

        TestCase15PlaceOrderRegisterBeforeCheckoutPages tc15porpcp = new TestCase15PlaceOrderRegisterBeforeCheckoutPages(driver);



//      TC _ 4. Click 'Signup / Login' button

        tc15porpcp.getSignupLoginButton().isDisplayed();
        tc15porpcp.getSignupLoginButton().click();
        sleepTest(1000);

//      TC _ 5. Fill all details in Signup and create account

        //Url Validation
        String loginURL = driver.getCurrentUrl();
        System.out.println("Given "+loginURL);
        Assert.assertEquals(loginURL , Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("login URL is validate");

        if (tc15porpcp.getLoginToYourAccountText().isDisplayed())
        {
            String loginToYourText= tc15porpcp.getLoginToYourAccountText().getText();
            System.out.println(loginToYourText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGIN_TO_YOUR_ACCoUNT_TEXT,loginToYourText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //      Enter correct email address and password

        tc15porpcp.getEmailAddressInputField().sendKeys(Data.DEMO_EMAIL);
        tc15porpcp.getPasswordInputField().sendKeys(Data.DEMO_PASSWORD);

        //     Click 'login' button
        tc15porpcp.getLoginButton().click();

//      TC _ 7. Verify ' Logged in as username' at top

        if (tc15porpcp.getLoggedInAsUsernameText().isDisplayed())
        {
            String loggedInAsUserText= tc15porpcp.getLoggedInAsUsernameText().getText();
            System.out.println(loggedInAsUserText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGGED_IN_AS_USER_TEXT,loggedInAsUserText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

//      TC _ 8. Add products to cart

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

        if(tc15porpcp.getViewProductButton().isDisplayed()){
            String viewProductButtonText= tc15porpcp.getViewProductButton().getText();
            Assert.assertEquals(Data.VIEW_PRODUCT_BUTTON_TEXT,viewProductButtonText);
            System.out.println( "✔" + viewProductButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc15porpcp.getViewProductButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        String firstProductsPageLink = driver.getCurrentUrl();
        System.out.println("Given "+firstProductsPageLink);
        Assert.assertEquals(firstProductsPageLink, Data.FIRST_PRODUCT_PAGE_URL);
        System.out.println("Product Page URL is validate");
        sleepTest(1000);

        tc15porpcp.getQuantityInputField().isDisplayed();
        tc15porpcp.getQuantityInputField().clear();
        tc15porpcp.getQuantityInputField().sendKeys("4");
        sleepTest(1000);

//      TC _ 9. Click 'Cart' button

        tc15porpcp.getAddToCartButton().isDisplayed();
        tc15porpcp.getAddToCartButton().click();
        sleepTest(10000);

        if(tc15porpcp.getViewCartButton().isDisplayed()){
            String viewCartButtonText= tc15porpcp.getViewCartButton().getText();
            Assert.assertEquals(Data.VIEW_CART_BUTTON_TEXT,viewCartButtonText);
            System.out.println( "✔" + viewCartButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc15porpcp.getViewCartButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//      TC _ 10. Verify that cart page is displayed

        String viewCartPageLink = driver.getCurrentUrl();
        System.out.println("Given "+viewCartPageLink);
        Assert.assertEquals(viewCartPageLink, Data.VIEW_CART_PAGE_URL);
        System.out.println("Product Page URL is validate");
        sleepTest(1000);


        tc15porpcp.getQuantityField().isDisplayed();
        String quantityNumber = tc15porpcp.getQuantityField().getText();
        System.out.printf(quantityNumber);
        sleepTest(2000);


//      TC _ 11. Click Proceed To Checkout

        tc15porpcp.getProceedToCheckout().isDisplayed();
        tc15porpcp.getProceedToCheckout().click();
        sleepTest( 1000);

//      TC _ 12. Verify Address Details and Review Your Order

        Assert.assertEquals(tc15porpcp.getFullName().getText(),Data.DELIVERY_INFORMATION_NAME);
        Assert.assertEquals(tc15porpcp.getComapnyName().getText(),Data.DELIVERY_INFORMATION_COMPANY);
        Assert.assertEquals(tc15porpcp.getAdress1().getText(),Data.DELIVERY_INFORMATION_ADDRESS1);
        Assert.assertEquals(tc15porpcp.getAdress2().getText(),Data.DELIVERY_INFORMATION_ADDRESS2);
        Assert.assertEquals(tc15porpcp.getStateCityZipcode().getText(),Data.DELIVERY_INFORMATION_STATE_CITY_ZIPCODE);
        Assert.assertEquals(tc15porpcp.getCountry().getText(),Data.DELIVERY_INFORMATION_COUNTRY);
        Assert.assertEquals(tc15porpcp.getPhoneNumber().getText(),Data.DELIVERY_INFORMATION_MOBILE_NUMBER);
        sleepTest(2000);

//      TC _ 13. Enter description in comment text area and click 'Place Order'

        tc15porpcp.getCommentInputField().isDisplayed();
        tc15porpcp.getCommentInputField().sendKeys(Data.DEMO_TEXT);
        tc15porpcp.getPlaceOrderButton().click();
        sleepTest(2000);

//      TC _ 14. Enter payment details: Name on Card, Card Number, CVC, Expiration date

        tc15porpcp.getNameOnCardInputField().isDisplayed();
        tc15porpcp.getNameOnCardInputField().sendKeys(Data.NAME_ON_CARD);
        sleepTest(1000);

        tc15porpcp.getCardNumberInputField().isDisplayed();
        tc15porpcp.getCardNumberInputField().sendKeys(Data.CARD_NUMBER);
        sleepTest(1000);

        tc15porpcp.getCvcInputField().isDisplayed();
        tc15porpcp.getCvcInputField().sendKeys(Data.CVC);
        sleepTest(1000);

        tc15porpcp.getExpirationMMInputField().isDisplayed();
        tc15porpcp.getExpirationMMInputField().sendKeys(Data.EXPIRATION_MM);
        sleepTest(1000);

        tc15porpcp.getExpirationYYYYInputField().isDisplayed();
        tc15porpcp.getExpirationYYYYInputField().sendKeys(Data.EXPIRATION_YYYY);
        sleepTest(1000);

//      TC _ 15. Click 'Pay and Confirm Order' button

        tc15porpcp.getPayAndConfirmOrderButton().isDisplayed();
        tc15porpcp.getPayAndConfirmOrderButton().click();
        sleepTest(1000);

//      TC _ 16. Verify success message 'Your order has been placed successfully!'

        tc15porpcp.getCongratualationMessage().isDisplayed();
        Assert.assertEquals(tc15porpcp.getCongratualationMessage().getText(),Data.CONGRATULATION_MESSAGE);
        sleepTest(2000);




    }
}
