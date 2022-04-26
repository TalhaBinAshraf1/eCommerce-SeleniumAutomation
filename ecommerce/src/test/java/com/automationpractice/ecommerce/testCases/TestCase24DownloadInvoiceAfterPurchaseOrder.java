package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase24DownloadInvoiceAfterPurchaseOrderPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase24DownloadInvoiceAfterPurchaseOrder extends  BaseClass{

    @Test

    public void testCase24DownloadInvoiceAfterPurchaseOrderPages(){

        TestCase24DownloadInvoiceAfterPurchaseOrderPages tc24diapop =new TestCase24DownloadInvoiceAfterPurchaseOrderPages(driver);

// TC-4 Click on 'Signup / Login' button
        tc24diapop.getSignInButton().click();
        System.out.println("Sign in Button Clicked");


        //     TC - 5. Fill all details in Signup and create account

        //Login URL Validation / Verify that home page is visible successfully
        String loginURL = driver.getCurrentUrl();
        System.out.println("Given "+loginURL);
        Assert.assertEquals(loginURL , Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("login URL is validate");


        //Verify 'New User Signup!' is visible
        if (tc24diapop.getNewUserSignupText().isDisplayed())
        {
            String newUserSignupText= tc24diapop.getNewUserSignupText().getText();
            System.out.println(newUserSignupText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.NEW_USER_SIGNUP_TEXT,newUserSignupText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Enter name and email address
        if (tc24diapop.getNameInputFieldInSignUpForm().isDisplayed())
        {
            tc24diapop.getNameInputFieldInSignUpForm().sendKeys(Data.DEMO_USER_NAME_2);
        }
        else {
            System.out.println(tc24diapop.getNameInputFieldInSignUpForm() + Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        if (tc24diapop.getEmailInputFieldInSignUpForm().isDisplayed())
        {
            tc24diapop.getEmailInputFieldInSignUpForm().sendKeys(Data.DEMO_EMAIL_2);
        }
        else {
            System.out.println(tc24diapop.getEmailInputFieldInSignUpForm() + Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //'Signup' button

        if(tc24diapop.getSignupButton().isDisplayed()){
            String signupButtonText= tc24diapop.getSignupButton().getText();
            Assert.assertEquals(Data.SIGNUP_BUTTON_TEXT,signupButtonText);
            System.out.println( "✔" + signupButtonText + "✔" + Data.IS_VISIBLE);
            tc24diapop.getSignupButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // Verify that 'ENTER ACCOUNT INFORMATION' is visible
        if (tc24diapop.getEnterAccountInformation().isDisplayed())
        {
            String enterAccountInformationText= tc24diapop.getEnterAccountInformation().getText();
            System.out.println(enterAccountInformationText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.ENTER_ACCOUNT_INFORMATION,enterAccountInformationText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Title Mr Mrs radio button validation
        WebElement mr= driver.findElement(By.cssSelector("div:nth-of-type(1) > .top > .radio  input[name='title']"));
        WebElement mrs= driver.findElement(By.cssSelector("div:nth-of-type(2) > .top > .radio  input[name='title']"));
        if(mr.isDisplayed()){
            mr.click();
            mr.isSelected();
            System.out.println("Mr is selected");
        }else {
            System.out.println("Mr not Selected ");
        }
        sleepTest(2000);

        if(mrs.isDisplayed()){
            mrs.click();
            mrs.isSelected();
            System.out.println("Mrs is selected");
        }else {
            System.out.println("Mrs not Selected ");
        }
        sleepTest(2000);

        //  Verify that 'Password Input Field' is visible
        if (tc24diapop.getPasswordInputField().isDisplayed())
        {
            tc24diapop.getPasswordInputField().sendKeys(Data.DEMO_PASSWORD_2);
            System.out.println("Password Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

        // Fill details: Title, Name, Email, Password, Date of birth

        By day = By.cssSelector("select#days");
        By month =By.cssSelector("select#months");
        By year = By.cssSelector("select#years");

        tc24diapop.dropDownSelect(day , "10");
        tc24diapop.dropDownSelect(day,"28");

        tc24diapop.dropDownSelect(month,"March");
        tc24diapop.dropDownSelect(month,"April");
        tc24diapop.dropDownSelect(month,"May");
        tc24diapop.dropDownSelect(month,"August");
        tc24diapop.dropDownSelect(month,"November");

        tc24diapop.dropDownSelect(year,"2021");
        tc24diapop.dropDownSelect(year,"2020");
        tc24diapop.dropDownSelect(year,"2019");
        tc24diapop.dropDownSelect(year,"2018");
        tc24diapop.dropDownSelect(year,"2017");
        tc24diapop.dropDownSelect(year,"2016");
        tc24diapop.dropDownSelect(year,"2015");
        tc24diapop.dropDownSelect(year,"2014");
        tc24diapop.dropDownSelect(year,"2013");
        tc24diapop.dropDownSelect(year,"2012");
        tc24diapop.dropDownSelect(year,"2011");
        tc24diapop.dropDownSelect(year,"2014");
        tc24diapop.dropDownSelect(year,"2013");
        tc24diapop.dropDownSelect(year,"2012");
        tc24diapop.dropDownSelect(year,"2010");

        sleepTest(2000);


        // Select checkbox 'Sign up for our newsletter!'

        tc24diapop.getNewsletterCheckbox().click();
        if(tc24diapop.getNewsletterCheckbox().isSelected())
        {
            System.out.println(Data.POSITIVE_MASSAGE+ "Sign-Up Checkbox Selected");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest( 1000);

        // Select checkbox 'Receive special offers from our partners!'

        tc24diapop.getReceiveSpecialOfferCheckbox().click();
        if(tc24diapop.getReceiveSpecialOfferCheckbox().isSelected())
        {
            System.out.println(Data.POSITIVE_MASSAGE+ "Receive Checkbox Selected");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest( 1000);

        // Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

        //First Name
        if (tc24diapop.getFirstNameInputField().isDisplayed())
        {
            tc24diapop.getFirstNameInputField().sendKeys(Data.FIRST_NAME);
            System.out.println("First Name Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Last Name
        if (tc24diapop.getLastNameInputField().isDisplayed())
        {
            tc24diapop.getLastNameInputField().sendKeys(Data.LAST_NAME);
            System.out.println("last Name Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //Company Name
        if (tc24diapop.getCompanyNameInputField().isDisplayed())
        {
            tc24diapop.getCompanyNameInputField().sendKeys(Data.COMPANY);
            System.out.println("Company Name Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);



        //Address
        if (tc24diapop.getAdress1InputField().isDisplayed())
        {
            tc24diapop.getAdress1InputField().sendKeys(Data.ADDRESS);
            System.out.println("Adress Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //Address 2
        if (tc24diapop.getAdress2InputField().isDisplayed())
        {
            tc24diapop.getAdress2InputField().sendKeys(Data.ADDRESS2);
            System.out.println("Adress 2 Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Country DropDown

        By country = By.cssSelector("select#country");

        tc24diapop.dropDownSelect(country , "India");
        tc24diapop.dropDownSelect(country,"Canada");
        tc24diapop.dropDownSelect(country,"Australia");
        tc24diapop.dropDownSelect(country,"New Zealand");
        tc24diapop.dropDownSelect(country,"Singapore");
        tc24diapop.dropDownSelect(country,"United States");

        // State
        if (tc24diapop.getStateInputField().isDisplayed())
        {
            tc24diapop.getStateInputField().sendKeys(Data.STATE);
            System.out.println("State Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // City
        if (tc24diapop.getCityInputField().isDisplayed())
        {
            tc24diapop.getCityInputField().sendKeys(Data.CITY);
            System.out.println("City Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
        js.executeScript("window.scrollBy(0,300)");



        // Zipcode
        if (tc24diapop.getZipCodeInputField().isDisplayed())
        {
            tc24diapop.getZipCodeInputField().sendKeys(Data.ZIPCODE);
            System.out.println("Zipcode Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // Mobile Number
        if (tc24diapop.getMobileNumberInputField().isDisplayed())
        {
            tc24diapop.getMobileNumberInputField().sendKeys(Data.MOBILE_NUMBER);
            System.out.println("Mobile Number Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Click 'Create Account button'

        if(tc24diapop.getCreateAccountButton().isDisplayed()){
            String createAccountButtonText= tc24diapop.getCreateAccountButton().getText();
            Assert.assertEquals(Data.CREATE_BUTTON_TEXT,createAccountButtonText);
            System.out.println( "✔" + createAccountButtonText + "✔" + Data.IS_VISIBLE);
            tc24diapop.getCreateAccountButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //     TC - 6. Verify 'ACCOUNT CREATED!' and click 'Continue' button


        // Verify that 'ACCOUNT CREATED!' is visible
        if (tc24diapop.getAccountCreatedText().isDisplayed())
        {
            String accountCreatedText= tc24diapop.getAccountCreatedText().getText();
            System.out.println(accountCreatedText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.ACCOUNT_CREATED_TEXT,accountCreatedText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        // Click on Continue Button
        tc24diapop.getContinueButton().click();

        //TC - 7  Verify that 'Logged in as username' is visible
        if (tc24diapop.getLoggedInAsUsernameText().isDisplayed())
        {
            String loggedInAsUserText= tc24diapop.getLoggedInAsUsernameText().getText();
            System.out.println(loggedInAsUserText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGGED_IN_AS_USER_TEXT_2,loggedInAsUserText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


//     TC - 8. Add products to cart
        js.executeScript("window.scrollBy(0,500)");

        if(tc24diapop.getViewProductButton().isDisplayed()){
            String viewProductButtonText= tc24diapop.getViewProductButton().getText();
            Assert.assertEquals(Data.VIEW_PRODUCT_BUTTON_TEXT,viewProductButtonText);
            System.out.println( "✔" + viewProductButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc24diapop.getViewProductButton().click();
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

        tc24diapop.getQuantityInputField().isDisplayed();
        tc24diapop.getQuantityInputField().clear();
        tc24diapop.getQuantityInputField().sendKeys("4");
        sleepTest(1000);

//     TC - 9. Click 'Cart' button

        tc24diapop.getAddToCartButton().isDisplayed();
        tc24diapop.getAddToCartButton().click();
        sleepTest(10000);

        if(tc24diapop.getViewCartButton().isDisplayed()){
            String viewCartButtonText= tc24diapop.getViewCartButton().getText();
            Assert.assertEquals(Data.VIEW_CART_BUTTON_TEXT,viewCartButtonText);
            System.out.println( "✔" + viewCartButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc24diapop.getViewCartButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//     TC - 10. Verify that cart page is displayed

        String viewCartPageLink = driver.getCurrentUrl();
        System.out.println("Given "+viewCartPageLink);
        Assert.assertEquals(viewCartPageLink, Data.VIEW_CART_PAGE_URL);
        System.out.println("Product Page URL is validate");
        sleepTest(1000);

        tc24diapop.getQuantityField().isDisplayed();
        String quantityNumber = tc24diapop.getQuantityField().getText();
        System.out.printf(quantityNumber);
        Assert.assertEquals(quantityNumber,"4");
        sleepTest(2000);

//     TC - 11. Click Proceed To Checkout

        tc24diapop.getProceedToCheckout().isDisplayed();
        tc24diapop.getProceedToCheckout().click();
        sleepTest( 1000);



//     TC - 12. Verify that the delivery address is same address filled at the time registration of account

        Assert.assertEquals(tc24diapop.getFullName().getText(),Data.DELIVERY_INFORMATION_NAME);
        Assert.assertEquals(tc24diapop.getComapnyName().getText(),Data.DELIVERY_INFORMATION_COMPANY);
        Assert.assertEquals(tc24diapop.getAdress1().getText(),Data.DELIVERY_INFORMATION_ADDRESS1);
        Assert.assertEquals(tc24diapop.getAdress2().getText(),Data.DELIVERY_INFORMATION_ADDRESS2);
        Assert.assertEquals(tc24diapop.getStateCityZipcode().getText(),Data.DELIVERY_INFORMATION_STATE_CITY_ZIPCODE);
        Assert.assertEquals(tc24diapop.getCountry().getText(),Data.DELIVERY_INFORMATION_COUNTRY);
        Assert.assertEquals(tc24diapop.getPhoneNumber().getText(),Data.DELIVERY_INFORMATION_MOBILE_NUMBER);
        sleepTest(2000);

//     Enter description in comment text area and click 'Place Order'
        tc24diapop.getCommentInputField().isDisplayed();
        tc24diapop.getCommentInputField().sendKeys(Data.DEMO_TEXT);
        tc24diapop.getPlaceOrderButton().click();
        sleepTest(2000);


//     Enter payment details: Name on Card, Card Number, CVC, Expiration date
        tc24diapop.getNameOnCardInputField().isDisplayed();
        tc24diapop.getNameOnCardInputField().sendKeys(Data.NAME_ON_CARD);
        sleepTest(1000);

        tc24diapop.getCardNumberInputField().isDisplayed();
        tc24diapop.getCardNumberInputField().sendKeys(Data.CARD_NUMBER);
        sleepTest(1000);

        tc24diapop.getCvcInputField().isDisplayed();
        tc24diapop.getCvcInputField().sendKeys(Data.CVC);
        sleepTest(1000);

        tc24diapop.getExpirationMMInputField().isDisplayed();
        tc24diapop.getExpirationMMInputField().sendKeys(Data.EXPIRATION_MM);
        sleepTest(1000);

        tc24diapop.getExpirationYYYYInputField().isDisplayed();
        tc24diapop.getExpirationYYYYInputField().sendKeys(Data.EXPIRATION_YYYY);
        sleepTest(1000);

        // Click 'Pay and Confirm Order' button
        tc24diapop.getPayAndConfirmOrderButton().isDisplayed();
        tc24diapop.getPayAndConfirmOrderButton().click();
        sleepTest(1000);

//   Verify success message 'Your order has been placed successfully!
        tc24diapop.getCongratualationMessage().isDisplayed();
        Assert.assertEquals(tc24diapop.getCongratualationMessage().getText(),Data.CONGRATULATION_MESSAGE);
        sleepTest(2000);

//     TC - 19 Click 'Download Invoice' button and verify invoice is downloaded successfully.

        tc24diapop.getDownloadInvoiceButton().isDisplayed();
        tc24diapop.getDownloadInvoiceButton().click();

//     TC - 20 Click 'Continue' button

        tc24diapop.getContinueButton1().isDisplayed();
        tc24diapop.getContinueButton1().click();


//     TC - 21 Click 'Delete Account' button

        //Due to delete button unstable API ,it is not possible to test now . After the next devolopment it will solve.

//     TC - 22 Verify 'ACCOUNT DELETED!' and click 'Continue' button

        //Due to delete button unstable API ,it is not possible to test now . After the next devolopment it will solve.

    }
}
