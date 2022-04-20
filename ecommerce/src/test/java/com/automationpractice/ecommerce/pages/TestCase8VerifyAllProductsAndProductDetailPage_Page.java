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

    @FindBy(css="div:nth-of-type(2) > .product-image-wrapper > .choose > .nav.nav-justified.nav-pills")
    public WebElement viewProduct;
    public WebElement getViewProduct(){
        return viewProduct;
    }

    @FindBy(css=".product-information > h2")
    public WebElement productName;
    public WebElement getProductName(){
        return productName;
    }

    @FindBy(css=".product-information > p:nth-of-type(1)")
    public WebElement categoryOfPrduct;
    public WebElement getCategoryOfPrduct(){
        return categoryOfPrduct;
    }

    @FindBy(css=".product-information span:nth-child(5) span")
    public WebElement productPrice;
    public WebElement getProductPrice(){
        return productPrice;
    }

    @FindBy(css=".product-information > p:nth-of-type(2)")
    public WebElement productAvailability;
    public WebElement getProductAvailability(){
        return productAvailability;
    }

    @FindBy(css=".product-information > p:nth-of-type(2)")
    public WebElement productCondition;
    public WebElement getProductCondition(){
        return productCondition;
    }

    @FindBy(css=".product-information > p:nth-of-type(4)")
    public WebElement productBrand;
    public WebElement getProductBrand(){
        return productBrand;
    }


}
