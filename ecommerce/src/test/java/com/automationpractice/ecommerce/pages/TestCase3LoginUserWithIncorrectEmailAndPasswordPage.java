package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase3LoginUserWithIncorrectEmailAndPasswordPage extends BasePage{
    public TestCase3LoginUserWithIncorrectEmailAndPasswordPage(WebDriver driver) {
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

    @FindBy(css = "li:nth-of-type(9) > a")
    public WebElement loggedInAsUsernameText;
    public WebElement getLoggedInAsUsernameText() {
        return loggedInAsUsernameText;
    }

    @FindBy(css = ".login-form > form[method='post'] > p")
    public WebElement yourEmailOrPasswordIsIncorrectText;
    public WebElement getYourEmailOrPasswordIsIncorrectText() {
        return yourEmailOrPasswordIsIncorrectText;
    }

}
