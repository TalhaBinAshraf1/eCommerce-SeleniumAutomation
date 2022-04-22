package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase13VerifyProductQuantityInCartPages  extends BasePage{
    public TestCase13VerifyProductQuantityInCartPages(WebDriver driver) {
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




}
