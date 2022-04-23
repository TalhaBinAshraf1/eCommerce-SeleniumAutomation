package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase14PlaceOrderRegisterWhileCheckoutPages extends BasePage{
    public TestCase14PlaceOrderRegisterWhileCheckoutPages(WebDriver driver) {
        super(driver);
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

    @FindBy(css="form[method='post'] > input[name='password']")
    public WebElement passwordInputField;
    public WebElement getPasswordInputField(){
        return passwordInputField;
    }

    @FindBy(css=".login-form > form[method='post'] > .btn.btn-default")
    public WebElement loginButton;
    public WebElement getLoginButton(){
        return loginButton;
    }

    @FindBy(css = "li:nth-of-type(9) > a")
    public WebElement loggedInAsUsernameText;
    public WebElement getLoggedInAsUsernameText() {
        return loggedInAsUsernameText;
    }

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








}
