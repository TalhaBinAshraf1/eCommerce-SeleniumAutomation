package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase2LoginUserWithCorrectEmailAndPasswordPage extends BasePage {
    public TestCase2LoginUserWithCorrectEmailAndPasswordPage(WebDriver driver) {
        super(driver);
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

    @FindBy(css = "li:nth-of-type(10) > a")
    public WebElement loggedInAsUsernameText;
    public WebElement getLoggedInAsUsernameText() {
        return loggedInAsUsernameText;
    }

    @FindBy(css = ".nav.navbar-nav > li:nth-of-type(5) > a")
    public WebElement deleteAccountButton;
    public WebElement getDeleteAccountButton() {
        return deleteAccountButton;
    }

    @FindBy(css = ".btn.btn-primary")
    public WebElement deleteButton;
    public WebElement getDeleteButton() {
        return deleteButton;
    }

}
