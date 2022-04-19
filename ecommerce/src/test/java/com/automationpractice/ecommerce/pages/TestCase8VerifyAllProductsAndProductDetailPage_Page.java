package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase8VerifyAllProductsAndProductDetailPage_Page extends BasePage{
    public TestCase8VerifyAllProductsAndProductDetailPage_Page(WebDriver driver) {
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

    @FindBy(css="body > section:nth-child(21) > div > div > div.col-sm-9.padding-right > div > div")
    public WebElement allProductList;
    public WebElement getAllProductList(){
        return allProductList;
    }

    @FindBy(css="div:nth-of-type(1) > .panel-heading > .panel-title > a")
    public WebElement women;
    public WebElement getWomen(){
        return women;
    }


}
