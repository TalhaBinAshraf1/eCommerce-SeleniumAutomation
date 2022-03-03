package com.automationpractice.ecommerce.pages;

import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestCase1RegisterUserPage extends BasePage {
    public TestCase1RegisterUserPage(WebDriver driver) {
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


}
