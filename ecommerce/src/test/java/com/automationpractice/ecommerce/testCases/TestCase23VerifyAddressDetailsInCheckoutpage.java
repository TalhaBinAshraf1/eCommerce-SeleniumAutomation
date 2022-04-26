package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase23VerifyAddressDetailsInCheckoutpagePages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase23VerifyAddressDetailsInCheckoutpage extends BaseClass{
    @Test
    public void testCase23VerifyAddressDetailsInCheckoutpagePages(){

        TestCase23VerifyAddressDetailsInCheckoutpagePages tc23vadicp =new TestCase23VerifyAddressDetailsInCheckoutpagePages(driver);


// TC-4 Click on 'Signup / Login' button
        tc23vadicp.getSignInButton().click();
        System.out.println("Sign in Button Clicked");


        //     TC - 5. Fill all details in Signup and create account

        //Login URL Validation / Verify that home page is visible successfully
        String loginURL = driver.getCurrentUrl();
        System.out.println("Given "+loginURL);
        Assert.assertEquals(loginURL , Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("login URL is validate");


        //Verify 'New User Signup!' is visible
        if (tc23vadicp.getNewUserSignupText().isDisplayed())
        {
            String newUserSignupText= tc23vadicp.getNewUserSignupText().getText();
            System.out.println(newUserSignupText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.NEW_USER_SIGNUP_TEXT,newUserSignupText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Enter name and email address
        if (tc23vadicp.getNameInputFieldInSignUpForm().isDisplayed())
        {
            tc23vadicp.getNameInputFieldInSignUpForm().sendKeys(Data.DEMO_USER_NAME_1);
        }
        else {
            System.out.println(tc23vadicp.getNameInputFieldInSignUpForm() + Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        if (tc23vadicp.getEmailInputFieldInSignUpForm().isDisplayed())
        {
            tc23vadicp.getEmailInputFieldInSignUpForm().sendKeys(Data.DEMO_EMAIL_1);
        }
        else {
            System.out.println(tc23vadicp.getEmailInputFieldInSignUpForm() + Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //'Signup' button

        if(tc23vadicp.getSignupButton().isDisplayed()){
            String signupButtonText= tc23vadicp.getSignupButton().getText();
            Assert.assertEquals(Data.SIGNUP_BUTTON_TEXT,signupButtonText);
            System.out.println( "✔" + signupButtonText + "✔" + Data.IS_VISIBLE);
            tc23vadicp.getSignupButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // Verify that 'ENTER ACCOUNT INFORMATION' is visible
        if (tc23vadicp.getEnterAccountInformation().isDisplayed())
        {
            String enterAccountInformationText= tc23vadicp.getEnterAccountInformation().getText();
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
        if (tc23vadicp.getPasswordInputField().isDisplayed())
        {
            tc23vadicp.getPasswordInputField().sendKeys(Data.DEMO_PASSWORD_1);
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

        tc23vadicp.dropDownSelect(day , "10");
        tc23vadicp.dropDownSelect(day,"28");

        tc23vadicp.dropDownSelect(month,"March");
        tc23vadicp.dropDownSelect(month,"April");
        tc23vadicp.dropDownSelect(month,"May");
        tc23vadicp.dropDownSelect(month,"August");
        tc23vadicp.dropDownSelect(month,"November");

        tc23vadicp.dropDownSelect(year,"2021");
        tc23vadicp.dropDownSelect(year,"2020");
        tc23vadicp.dropDownSelect(year,"2019");
        tc23vadicp.dropDownSelect(year,"2018");
        tc23vadicp.dropDownSelect(year,"2017");
        tc23vadicp.dropDownSelect(year,"2016");
        tc23vadicp.dropDownSelect(year,"2015");
        tc23vadicp.dropDownSelect(year,"2014");
        tc23vadicp.dropDownSelect(year,"2013");
        tc23vadicp.dropDownSelect(year,"2012");
        tc23vadicp.dropDownSelect(year,"2011");
        tc23vadicp.dropDownSelect(year,"2014");
        tc23vadicp.dropDownSelect(year,"2013");
        tc23vadicp.dropDownSelect(year,"2012");
        tc23vadicp.dropDownSelect(year,"2010");

        sleepTest(2000);


        // Select checkbox 'Sign up for our newsletter!'

        tc23vadicp.getNewsletterCheckbox().click();
        if(tc23vadicp.getNewsletterCheckbox().isSelected())
        {
            System.out.println(Data.POSITIVE_MASSAGE+ "Sign-Up Checkbox Selected");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest( 1000);

        // Select checkbox 'Receive special offers from our partners!'

        tc23vadicp.getReceiveSpecialOfferCheckbox().click();
        if(tc23vadicp.getReceiveSpecialOfferCheckbox().isSelected())
        {
            System.out.println(Data.POSITIVE_MASSAGE+ "Receive Checkbox Selected");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest( 1000);

        // Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

        //First Name
        if (tc23vadicp.getFirstNameInputField().isDisplayed())
        {
            tc23vadicp.getFirstNameInputField().sendKeys(Data.FIRST_NAME);
            System.out.println("First Name Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Last Name
        if (tc23vadicp.getLastNameInputField().isDisplayed())
        {
            tc23vadicp.getLastNameInputField().sendKeys(Data.LAST_NAME);
            System.out.println("last Name Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //Company Name
        if (tc23vadicp.getCompanyNameInputField().isDisplayed())
        {
            tc23vadicp.getCompanyNameInputField().sendKeys(Data.COMPANY);
            System.out.println("Company Name Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);



        //Address
        if (tc23vadicp.getAdress1InputField().isDisplayed())
        {
            tc23vadicp.getAdress1InputField().sendKeys(Data.ADDRESS);
            System.out.println("Adress Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //Address 2
        if (tc23vadicp.getAdress2InputField().isDisplayed())
        {
            tc23vadicp.getAdress2InputField().sendKeys(Data.ADDRESS2);
            System.out.println("Adress 2 Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Country DropDown

        By country = By.cssSelector("select#country");

        tc23vadicp.dropDownSelect(country , "India");
        tc23vadicp.dropDownSelect(country,"Canada");
        tc23vadicp.dropDownSelect(country,"Australia");
        tc23vadicp.dropDownSelect(country,"New Zealand");
        tc23vadicp.dropDownSelect(country,"Singapore");
        tc23vadicp.dropDownSelect(country,"United States");

        // State
        if (tc23vadicp.getStateInputField().isDisplayed())
        {
            tc23vadicp.getStateInputField().sendKeys(Data.STATE);
            System.out.println("State Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // City
        if (tc23vadicp.getCityInputField().isDisplayed())
        {
            tc23vadicp.getCityInputField().sendKeys(Data.CITY);
            System.out.println("City Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
        js.executeScript("window.scrollBy(0,300)");



        // Zipcode
        if (tc23vadicp.getZipCodeInputField().isDisplayed())
        {
            tc23vadicp.getZipCodeInputField().sendKeys(Data.ZIPCODE);
            System.out.println("Zipcode Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        // Mobile Number
        if (tc23vadicp.getMobileNumberInputField().isDisplayed())
        {
            tc23vadicp.getMobileNumberInputField().sendKeys(Data.MOBILE_NUMBER);
            System.out.println("Mobile Number Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Click 'Create Account button'

        if(tc23vadicp.getCreateAccountButton().isDisplayed()){
            String createAccountButtonText= tc23vadicp.getCreateAccountButton().getText();
            Assert.assertEquals(Data.CREATE_BUTTON_TEXT,createAccountButtonText);
            System.out.println( "✔" + createAccountButtonText + "✔" + Data.IS_VISIBLE);
            tc23vadicp.getCreateAccountButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        //     TC - 6. Verify 'ACCOUNT CREATED!' and click 'Continue' button


        // Verify that 'ACCOUNT CREATED!' is visible
        if (tc23vadicp.getAccountCreatedText().isDisplayed())
        {
            String accountCreatedText= tc23vadicp.getAccountCreatedText().getText();
            System.out.println(accountCreatedText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.ACCOUNT_CREATED_TEXT,accountCreatedText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        // Click on Continue Button
        tc23vadicp.getContinueButton().click();

        //TC - 7  Verify that 'Logged in as username' is visible
        if (tc23vadicp.getLoggedInAsUsernameText().isDisplayed())
        {
            String loggedInAsUserText= tc23vadicp.getLoggedInAsUsernameText().getText();
            System.out.println(loggedInAsUserText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGGED_IN_AS_USER_TEXT_1,loggedInAsUserText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


//     TC - 8. Add products to cart
        js.executeScript("window.scrollBy(0,500)");

        if(tc23vadicp.getViewProductButton().isDisplayed()){
            String viewProductButtonText= tc23vadicp.getViewProductButton().getText();
            Assert.assertEquals(Data.VIEW_PRODUCT_BUTTON_TEXT,viewProductButtonText);
            System.out.println( "✔" + viewProductButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc23vadicp.getViewProductButton().click();
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

        tc23vadicp.getQuantityInputField().isDisplayed();
        tc23vadicp.getQuantityInputField().clear();
        tc23vadicp.getQuantityInputField().sendKeys("4");
        sleepTest(1000);

//     TC - 9. Click 'Cart' button

        tc23vadicp.getAddToCartButton().isDisplayed();
        tc23vadicp.getAddToCartButton().click();
        sleepTest(10000);

        if(tc23vadicp.getViewCartButton().isDisplayed()){
            String viewCartButtonText= tc23vadicp.getViewCartButton().getText();
            Assert.assertEquals(Data.VIEW_CART_BUTTON_TEXT,viewCartButtonText);
            System.out.println( "✔" + viewCartButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc23vadicp.getViewCartButton().click();
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

        tc23vadicp.getQuantityField().isDisplayed();
        String quantityNumber = tc23vadicp.getQuantityField().getText();
        System.out.printf(quantityNumber);
        Assert.assertEquals(quantityNumber,"4");
        sleepTest(2000);

//     TC - 11. Click Proceed To Checkout

        tc23vadicp.getProceedToCheckout().isDisplayed();
        tc23vadicp.getProceedToCheckout().click();
        sleepTest( 1000);



//     TC - 12. Verify that the delivery address is same address filled at the time registration of account

        Assert.assertEquals(tc23vadicp.getFullName().getText(),Data.DELIVERY_INFORMATION_NAME);
        Assert.assertEquals(tc23vadicp.getComapnyName().getText(),Data.DELIVERY_INFORMATION_COMPANY);
        Assert.assertEquals(tc23vadicp.getAdress1().getText(),Data.DELIVERY_INFORMATION_ADDRESS1);
        Assert.assertEquals(tc23vadicp.getAdress2().getText(),Data.DELIVERY_INFORMATION_ADDRESS2);
        Assert.assertEquals(tc23vadicp.getStateCityZipcode().getText(),Data.DELIVERY_INFORMATION_STATE_CITY_ZIPCODE);
        Assert.assertEquals(tc23vadicp.getCountry().getText(),Data.DELIVERY_INFORMATION_COUNTRY);
        Assert.assertEquals(tc23vadicp.getPhoneNumber().getText(),Data.DELIVERY_INFORMATION_MOBILE_NUMBER);
        sleepTest(2000);


//     TC - 14. Click 'Delete Account' button

        //Due to delete button unstable API ,it is not possible to test now . After the next devolopment it will solve.
//     TC - 15. Verify 'ACCOUNT DELETED!' and click 'Continue' button

        //Due to delete button unstable API ,it is not possible to test now . After the next devolopment it will solve.




    }
}
