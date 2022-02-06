package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase1RegisterUserPage extends BasePage {
    public TestCase1RegisterUserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[href='\\/login']")
    public WebElement signInButton;
    public WebElement getSignInButton(){
        return signInButton;
    }

    @FindBy(css="#form > div > div > div:nth-child(3) > div > h2")
    public WebElement newUserSignupText;
    public WebElement getNewUserSignupText(){
        return signInButton;
    }



}
