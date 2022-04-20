package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase9SearchProductPages extends BasePage {
    public TestCase9SearchProductPages(WebDriver driver) {
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

}
