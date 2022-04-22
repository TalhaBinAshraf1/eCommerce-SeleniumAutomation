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



}
