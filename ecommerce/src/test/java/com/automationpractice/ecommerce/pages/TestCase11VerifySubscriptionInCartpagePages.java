package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase11VerifySubscriptionInCartpagePages extends BasePage {

    public TestCase11VerifySubscriptionInCartpagePages(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".nav.navbar-nav > li:nth-of-type(3) > a")
    public WebElement cartButton;
    public WebElement getCartButton(){
        return cartButton;
    }


    @FindBy(css=".single-widget h2")
    public WebElement subscriptionText;
    public WebElement getSubscriptionText(){
        return subscriptionText;
    }

    @FindBy(css="input#susbscribe_email")
    public WebElement emailInputField;
    public WebElement getEmailInputField(){
        return emailInputField;
    }

    @FindBy(css="button#subscribe")
    public WebElement arrowButton;
    public WebElement getArrowButton(){
        return arrowButton;
    }

}
