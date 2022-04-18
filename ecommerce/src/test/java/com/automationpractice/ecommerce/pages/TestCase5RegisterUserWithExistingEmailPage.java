package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase5RegisterUserWithExistingEmailPage extends BasePage {
    public TestCase5RegisterUserWithExistingEmailPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(css="[href='\\/login']")
    public WebElement signInButton;
    public WebElement getSignInButton(){
        return signInButton;
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

    @FindBy(css = ".signup-form > form[method='post'] > p")
    public WebElement emailAddressAlreadyExistText;
    public WebElement getEmailAddressAlreadyExistText() {
        return emailAddressAlreadyExistText;
    }


}
