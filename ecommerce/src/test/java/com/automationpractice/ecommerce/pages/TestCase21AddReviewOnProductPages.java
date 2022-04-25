package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase21AddReviewOnProductPages extends BasePage{
    public TestCase21AddReviewOnProductPages(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".nav.navbar-nav > li:nth-of-type(2) > a")
    public WebElement productsButton;
    public WebElement getProductsButton(){
        return productsButton;
    }

    @FindBy(css="div:nth-of-type(7) > .product-image-wrapper > .choose > .nav.nav-justified.nav-pills  a")
    public WebElement viewProductButton;
    public WebElement getViewProductButton(){
        return viewProductButton;
    }

    @FindBy(css=".nav.nav-tabs  a")
    public WebElement writeYourReviewText;
    public WebElement getWriteYourReviewText(){
        return writeYourReviewText;
    }

    @FindBy(css="input#name")
    public WebElement nameInputField;
    public WebElement getNameInputField(){
        return nameInputField;
    }

    @FindBy(css="input#email")
    public WebElement emailInputField;
    public WebElement getEmailInputField(){
        return emailInputField;
    }

    @FindBy(css="textarea#review")
    public WebElement addReviewInputField;
    public WebElement getAddReviewInputField(){
        return addReviewInputField;
    }

    @FindBy(css="button#button-review")
    public WebElement submitButton;
    public WebElement getSubmitButton(){
        return submitButton;
    }
}
