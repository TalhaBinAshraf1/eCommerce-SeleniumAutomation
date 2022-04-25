package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase20SearchProductsAndVerifyCartAfterLoginPages extends BasePage{
    public TestCase20SearchProductsAndVerifyCartAfterLoginPages(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".nav.navbar-nav > li:nth-of-type(2) > a")
    public WebElement productsButton;
    public WebElement getProductsButton(){
        return productsButton;
    }

    @FindBy(css=".text-center.title")
    public WebElement allProductText;
    public WebElement getAllProductText(){
        return allProductText;
    }

    @FindBy(css="#search_product")
    public WebElement searchProductinputField;
    public WebElement getSearchProductinputField(){
        return searchProductinputField;
    }

    @FindBy(css="button#submit_search")
    public WebElement searchButton;
    public WebElement getSearchButton(){
        return searchButton;
    }

    @FindBy(css=".productinfo.text-center > p")
    public WebElement searchedProduct;
    public WebElement getSearchedProduct(){
        return searchedProduct;
    }

    @FindBy(css="div > .product-image-wrapper > .single-products > .product-overlay > .overlay-content > .add-to-cart.btn.btn-default")
    public WebElement addToCartButton;
    public WebElement getAddToCartButton(){
        return addToCartButton;
    }

    @FindBy(css="div:nth-of-type(2) > .product-image-wrapper > .single-products > .productinfo.text-center")
    public WebElement firstProduct;
    public WebElement getFirstProduct(){
        return firstProduct;
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

    @FindBy(css=".nav.navbar-nav > li:nth-of-type(4) > a")
    public WebElement signupLoginButton;
    public WebElement getSignupLoginButton(){
        return signupLoginButton;
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

    @FindBy(css = ".nav.navbar-nav > li:nth-of-type(3) > a")
    public WebElement cartbutton;
    public WebElement getCartbutton() {
        return cartbutton;
    }


}
