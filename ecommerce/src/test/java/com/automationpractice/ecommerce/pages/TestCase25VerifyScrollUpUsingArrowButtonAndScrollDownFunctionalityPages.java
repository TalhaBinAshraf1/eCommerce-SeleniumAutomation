package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPages extends BasePage {
    public TestCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPages(WebDriver driver) {
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

    @FindBy(css="a#scrollUp")
    public WebElement upArrowButton;
    public WebElement getUpArrowButton(){
        return upArrowButton;
    }

    @FindBy(css="img[alt='Website for automation practice']")
    public WebElement automationExerciseImage;
    public WebElement getAutomationExerciseImage(){
        return automationExerciseImage;
    }

    @FindBy(css=".carousel-inner > div:nth-of-type(2) > div:nth-of-type(1) > h2")
    public WebElement fullFledgedPracticeWebsite;
    public WebElement getFullFledgedPracticeWebsite(){
        return fullFledgedPracticeWebsite;
    }


}
