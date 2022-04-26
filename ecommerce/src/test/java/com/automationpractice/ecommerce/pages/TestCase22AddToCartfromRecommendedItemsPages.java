package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase22AddToCartfromRecommendedItemsPages extends BasePage{
    public TestCase22AddToCartfromRecommendedItemsPages(WebDriver driver) {
        super(driver);
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

    @FindBy(css=".recommended_items > .text-center.title")
    public WebElement recomandedItemsText;
    public WebElement getRecomandedItemsText(){
        return recomandedItemsText;
    }

}
