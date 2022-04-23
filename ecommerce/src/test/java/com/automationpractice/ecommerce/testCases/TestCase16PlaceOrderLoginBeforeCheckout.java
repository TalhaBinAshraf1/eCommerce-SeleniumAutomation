package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase16PlaceOrderLoginBeforeCheckoutPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase16PlaceOrderLoginBeforeCheckout extends BaseClass{

    @Test
    public void testCase16PlaceOrderLoginBeforeCheckoutPages(){

        TestCase16PlaceOrderLoginBeforeCheckoutPages tc16cpolbcp =new TestCase16PlaceOrderLoginBeforeCheckoutPages(driver);

//      TC _ 4. Click 'Signup / Login' button

        tc16cpolbcp.getSignupLoginButton().isDisplayed();
        tc16cpolbcp.getSignupLoginButton().click();
        sleepTest(1000);

//      TC _ 5. Fill all details in Signup and create account

        //Url Validation
        String loginURL = driver.getCurrentUrl();
        System.out.println("Given "+loginURL);
        Assert.assertEquals(loginURL , Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("login URL is validate");

        //      Enter correct email address and password

        tc16cpolbcp.getEmailAddressInputField().sendKeys(Data.DEMO_EMAIL);
        tc16cpolbcp.getPasswordInputField().sendKeys(Data.DEMO_PASSWORD);

        //     Click 'login' button
        tc16cpolbcp.getLoginButton().click();

//      TC _ 7. Verify ' Logged in as username' at top

        if (tc16cpolbcp.getLoggedInAsUsernameText().isDisplayed())
        {
            String loggedInAsUserText= tc16cpolbcp.getLoggedInAsUsernameText().getText();
            System.out.println(loggedInAsUserText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGGED_IN_AS_USER_TEXT,loggedInAsUserText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

//      TC _ 8. Add products to cart

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

        if(tc16cpolbcp.getViewProductButton().isDisplayed()){
            String viewProductButtonText= tc16cpolbcp.getViewProductButton().getText();
            Assert.assertEquals(Data.VIEW_PRODUCT_BUTTON_TEXT,viewProductButtonText);
            System.out.println( "✔" + viewProductButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc16cpolbcp.getViewProductButton().click();
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

        tc16cpolbcp.getQuantityInputField().isDisplayed();
        tc16cpolbcp.getQuantityInputField().clear();
        tc16cpolbcp.getQuantityInputField().sendKeys("4");
        sleepTest(1000);

//      TC _ 9. Click 'Cart' button

        tc16cpolbcp.getAddToCartButton().isDisplayed();
        tc16cpolbcp.getAddToCartButton().click();
        sleepTest(10000);

        if(tc16cpolbcp.getViewCartButton().isDisplayed()){
            String viewCartButtonText= tc16cpolbcp.getViewCartButton().getText();
            Assert.assertEquals(Data.VIEW_CART_BUTTON_TEXT,viewCartButtonText);
            System.out.println( "✔" + viewCartButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc16cpolbcp.getViewCartButton().click();
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


        tc16cpolbcp.getQuantityField().isDisplayed();
        String quantityNumber = tc16cpolbcp.getQuantityField().getText();
        System.out.printf(quantityNumber);
        sleepTest(2000);


//      TC _ 11. Click Proceed To Checkout

        tc16cpolbcp.getProceedToCheckout().isDisplayed();
        tc16cpolbcp.getProceedToCheckout().click();
        sleepTest( 1000);

//      TC _ 12. Verify Address Details and Review Your Order

        Assert.assertEquals(tc16cpolbcp.getFullName().getText(),Data.DELIVERY_INFORMATION_NAME);
        Assert.assertEquals(tc16cpolbcp.getComapnyName().getText(),Data.DELIVERY_INFORMATION_COMPANY);
        Assert.assertEquals(tc16cpolbcp.getAdress1().getText(),Data.DELIVERY_INFORMATION_ADDRESS1);
        Assert.assertEquals(tc16cpolbcp.getAdress2().getText(),Data.DELIVERY_INFORMATION_ADDRESS2);
        Assert.assertEquals(tc16cpolbcp.getStateCityZipcode().getText(),Data.DELIVERY_INFORMATION_STATE_CITY_ZIPCODE);
        Assert.assertEquals(tc16cpolbcp.getCountry().getText(),Data.DELIVERY_INFORMATION_COUNTRY);
        Assert.assertEquals(tc16cpolbcp.getPhoneNumber().getText(),Data.DELIVERY_INFORMATION_MOBILE_NUMBER);
        sleepTest(2000);

//      TC _ 13. Enter description in comment text area and click 'Place Order'

        tc16cpolbcp.getCommentInputField().isDisplayed();
        tc16cpolbcp.getCommentInputField().sendKeys(Data.DEMO_TEXT);
        tc16cpolbcp.getPlaceOrderButton().click();
        sleepTest(2000);

//      TC _ 14. Enter payment details: Name on Card, Card Number, CVC, Expiration date

        tc16cpolbcp.getNameOnCardInputField().isDisplayed();
        tc16cpolbcp.getNameOnCardInputField().sendKeys(Data.NAME_ON_CARD);
        sleepTest(1000);

        tc16cpolbcp.getCardNumberInputField().isDisplayed();
        tc16cpolbcp.getCardNumberInputField().sendKeys(Data.CARD_NUMBER);
        sleepTest(1000);

        tc16cpolbcp.getCvcInputField().isDisplayed();
        tc16cpolbcp.getCvcInputField().sendKeys(Data.CVC);
        sleepTest(1000);

        tc16cpolbcp.getExpirationMMInputField().isDisplayed();
        tc16cpolbcp.getExpirationMMInputField().sendKeys(Data.EXPIRATION_MM);
        sleepTest(1000);

        tc16cpolbcp.getExpirationYYYYInputField().isDisplayed();
        tc16cpolbcp.getExpirationYYYYInputField().sendKeys(Data.EXPIRATION_YYYY);
        sleepTest(1000);

//      TC _ 15. Click 'Pay and Confirm Order' button

        tc16cpolbcp.getPayAndConfirmOrderButton().isDisplayed();
        tc16cpolbcp.getPayAndConfirmOrderButton().click();
        sleepTest(1000);

//      TC _ 16. Verify success message 'Your order has been placed successfully!'

        tc16cpolbcp.getCongratualationMessage().isDisplayed();
        Assert.assertEquals(tc16cpolbcp.getCongratualationMessage().getText(),Data.CONGRATULATION_MESSAGE);
        sleepTest(2000);




    }
}
