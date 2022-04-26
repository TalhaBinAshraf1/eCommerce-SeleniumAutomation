package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestCase24DownloadInvoiceAfterPurchaseOrderPages extends BasePage{
    public TestCase24DownloadInvoiceAfterPurchaseOrderPages(WebDriver driver) {
        super(driver);
    }



    @FindBy(css="[href='\\/login']")
    public WebElement signInButton1;
    public WebElement getSignInButton1(){
        return signInButton1;
    }

    @FindBy(css="div.container div.row div.col-sm-4:nth-child(3) div.signup-form > h2:nth-child(1)")
    public WebElement newUserSignupText;
    public WebElement getNewUserSignupText(){
        return newUserSignupText;
    }

    @FindBy(css="form[method='post'] > input[name='name']")
    public WebElement nameInputFieldInSignUpForm;
    public WebElement getNameInputFieldInSignUpForm() {
        return nameInputFieldInSignUpForm;
    }

    @FindBy(css = ".signup-form > form[method='post'] > input[name='email']")
    public WebElement emailInputFieldInSignUpForm;
    public WebElement getEmailInputFieldInSignUpForm() {
        return emailInputFieldInSignUpForm;
    }

    @FindBy(css = ".signup-form > form[method='post'] > .btn.btn-default")
    public WebElement signupButton;
    public WebElement getSignupButton() {
        return signupButton;
    }

    @FindBy(css = ".login-form > .text-center.title > b")
    public WebElement enterAccountInformation;
    public WebElement getEnterAccountInformation() {
        return enterAccountInformation;
    }

    @FindBy(css = "input#password")
    public WebElement passwordInputField;
    public WebElement getPasswordInputField() {
        return passwordInputField;
    }

    @FindBy(css = "select#days")
    public WebElement dayDropdown;
    public WebElement getDayDropdown() {
        return dayDropdown;
    }

    public WebElement getElement(By locator){
        return  driver.findElement(locator);
    }
    public void  dropDownSelect(By locator,String dropDownText ){
        Select select =new Select(getElement(locator));
        select.selectByVisibleText(dropDownText);
        Assert.assertEquals(dropDownText,dropDownText);
    }

    @FindBy(css = "input#newsletter")
    public WebElement newsletterCheckbox;
    public WebElement getNewsletterCheckbox() {
        return newsletterCheckbox;
    }

    @FindBy(css = "input#optin")
    public WebElement receiveSpecialOfferCheckbox;
    public WebElement getReceiveSpecialOfferCheckbox() {
        return receiveSpecialOfferCheckbox;
    }

    @FindBy(css = "#first_name")
    public WebElement firstNameInputField;
    public WebElement getFirstNameInputField() {
        return firstNameInputField;
    }

    @FindBy(css = "input#last_name")
    public WebElement lastNameInputField;
    public WebElement getLastNameInputField() {
        return lastNameInputField;
    }

    @FindBy(css = "input#company")
    public WebElement companyNameInputField;
    public WebElement getCompanyNameInputField() {
        return companyNameInputField;
    }

    @FindBy(css = "input[name='address1']")
    public WebElement adress1InputField;
    public WebElement getAdress1InputField() {
        return adress1InputField;
    }

    @FindBy(css = "input[name='address2']")
    public WebElement adress2InputField;
    public WebElement getAdress2InputField() {
        return adress2InputField;
    }

    @FindBy(css = "input#state")
    public WebElement stateInputField;
    public WebElement getStateInputField() {
        return stateInputField;
    }

    @FindBy(css = "input#city")
    public WebElement cityInputField;
    public WebElement getCityInputField() {
        return cityInputField;
    }

    @FindBy(css = "input#zipcode")
    public WebElement zipCodeInputField;
    public WebElement getZipCodeInputField() {
        return zipCodeInputField;
    }

    @FindBy(css = "input#mobile_number")
    public WebElement mobileNumberInputField;
    public WebElement getMobileNumberInputField() {
        return mobileNumberInputField;
    }

    @FindBy(css = "section#form > .container form[method='post'] > .btn.btn-default")
    public WebElement createAccountButton;
    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    @FindBy(css = ".text-center.title > b")
    public WebElement accountCreatedText;
    public WebElement getAccountCreatedText() {
        return accountCreatedText;
    }

    @FindBy(css = ".btn.btn-primary")
    public WebElement continueButton;
    public WebElement getContinueButton() {
        return continueButton;
    }

    @FindBy(css = "li:nth-of-type(9) > a")
    public WebElement loggedInAsUsernameText;
    public WebElement getLoggedInAsUsernameText() {
        return loggedInAsUsernameText;
    }

    @FindBy(css = ".nav.navbar-nav > li:nth-of-type(5) > a")
    public WebElement deleteAccountButton;
    public WebElement getDeleteAccountButton() {
        return deleteAccountButton;
    }

    @FindBy(css = ".button-form > .btn.btn-danger")
    public WebElement deleteButton;
    public WebElement getDeleteButton() {
        return deleteButton;
    }



    @FindBy(css="div:nth-of-type(2) > .product-image-wrapper > .choose > .nav.nav-justified.nav-pills  a")
    public WebElement viewProductButton;
    public WebElement getViewProductButton(){
        return viewProductButton;
    }

    @FindBy(css="input#quantity")
    public WebElement quantityInputField;
    public WebElement getQuantityInputField(){
        return quantityInputField;
    }

    @FindBy(css=".btn.btn-default.cart")
    public WebElement addToCartButton;
    public WebElement getAddToCartButton(){
        return addToCartButton;
    }

    @FindBy(css=".modal-body > p:nth-of-type(2)")
    public WebElement viewCartButton;
    public WebElement getViewCartButton(){
        return viewCartButton;
    }

    @FindBy(xpath="//tr[@id='product-1']//button[@class='disabled']")
    public WebElement quantityField;
    public WebElement getQuantityField(){
        return quantityField;
    }

    @FindBy(css=".btn.btn-default.check_out")
    public WebElement proceedToCheckout;
    public WebElement getProceedToCheckout(){
        return proceedToCheckout;
    }

    @FindBy(css=".modal-body u")
    public WebElement registerLoginButton;
    public WebElement getRegisterLoginButton(){
        return registerLoginButton;
    }

    @FindBy(css="[href='\\/login']")
    public WebElement signInButton;
    public WebElement getSignInButton(){
        return signInButton;
    }

    @FindBy(css=".login-form > h2")
    public WebElement loginToYourAccountText;
    public WebElement getLoginToYourAccountText(){
        return loginToYourAccountText;
    }

    @FindBy(css=".login-form > form[method='post'] > input[name='email']")
    public WebElement emailAddressInputField;
    public WebElement getEmailAddressInputField(){
        return emailAddressInputField;
    }


    @FindBy(css=".login-form > form[method='post'] > .btn.btn-default")
    public WebElement loginButton;
    public WebElement getLoginButton(){
        return loginButton;
    }

//    @FindBy(css = "li:nth-of-type(9) > a")
//    public WebElement loggedInAsUsernameText;
//    public WebElement getLoggedInAsUsernameText() {
//        return loggedInAsUsernameText;
//    }

    @FindBy(css = ".nav.navbar-nav > li:nth-of-type(3) > a")
    public WebElement cartButton;
    public WebElement getCartButton() {
        return cartButton;
    }


    @FindBy(css = "ul#address_delivery > .address_firstname.address_lastname")
    public WebElement fullName;
    public WebElement getFullName() {
        return fullName;
    }

    @FindBy(css = "ul#address_delivery > li:nth-of-type(3)")
    public WebElement comapnyName;
    public WebElement getComapnyName() {
        return comapnyName;
    }

    @FindBy(css = "ul#address_delivery > li:nth-of-type(4)")
    public WebElement adress1;
    public WebElement getAdress1() {
        return adress1;
    }

    @FindBy(css = "ul#address_delivery > li:nth-of-type(5)")
    public WebElement adress2;
    public WebElement getAdress2() {
        return adress2;
    }

    @FindBy(css = "#address_delivery .address_state_name")
    public WebElement stateCityZipcode;
    public WebElement getStateCityZipcode() {
        return stateCityZipcode;
    }

    @FindBy(css = "ul#address_delivery > .address_country_name")
    public WebElement country;
    public WebElement getCountry () {
        return country;
    }


    @FindBy(css = "ul#address_delivery > .address_phone")
    public WebElement phoneNumber;
    public WebElement getPhoneNumber () {
        return phoneNumber;
    }

    @FindBy(css = "div#ordermsg > textarea[name='message']")
    public WebElement commentInputField;
    public WebElement getCommentInputField () {
        return commentInputField;
    }

    @FindBy(css = ".btn.btn-default.check_out")
    public WebElement placeOrderButton;
    public WebElement getPlaceOrderButton () {
        return placeOrderButton;
    }

    @FindBy(css = "input[name='name_on_card']")
    public WebElement nameOnCardInputField;
    public WebElement getNameOnCardInputField () {
        return nameOnCardInputField;
    }

    @FindBy(css = "input[name='card_number']")
    public WebElement cardNumberInputField;
    public WebElement getCardNumberInputField () {
        return cardNumberInputField;
    }

    @FindBy(css = "input[name='cvc']")
    public WebElement cvcInputField;
    public WebElement getCvcInputField () {
        return cvcInputField;
    }

    @FindBy(css = "input[name='expiry_month']")
    public WebElement expirationMMInputField;
    public WebElement getExpirationMMInputField () {
        return expirationMMInputField;
    }

    @FindBy(css = "input[name='expiry_year']")
    public WebElement expirationYYYYInputField;
    public WebElement getExpirationYYYYInputField () {
        return expirationYYYYInputField;
    }


    @FindBy(css = "button#submit")
    public WebElement payAndConfirmOrderButton;
    public WebElement getPayAndConfirmOrderButton () {
        return payAndConfirmOrderButton;
    }

    @FindBy(css = "section#form > .container p")
    public WebElement congratualationMessage;
    public WebElement getCongratualationMessage () {
        return congratualationMessage;
    }

    @FindBy(css = ".btn.btn-default.check_out")
    public WebElement downloadInvoiceButton;
    public WebElement getDownloadInvoiceButton () {
        return downloadInvoiceButton;
    }

    @FindBy(css = ".btn.btn-primary")
    public WebElement continueButton1;
    public WebElement getContinueButton1 () {
        return continueButton1;
    }



}
