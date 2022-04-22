package com.automationpractice.ecommerce.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase12AddProductsInCartPages extends BasePage{

    public TestCase12AddProductsInCartPages(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".nav.navbar-nav > li:nth-of-type(2) > a")
    public WebElement productsButton;
    public WebElement getProductsButton(){
        return productsButton;
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

    @FindBy(css=".features_items > div:nth-of-type(3)")
    public WebElement secondProduct;
    public WebElement getSecondProduct(){
        return secondProduct;
    }

    @FindBy(css="div:nth-of-type(3) .overlay-content > .add-to-cart.btn.btn-default")
    public WebElement secondProductAddtoCart;
    public WebElement getSecondProductAddtoCart(){
        return secondProductAddtoCart;
    }


    @FindBy(css=".btn.btn-block.btn-success.close-modal")
    public WebElement continueShoppingButton;
    public WebElement getContinueShoppingButton(){
        return continueShoppingButton;
    }

    @FindBy(css=".modal-body > p:nth-of-type(2)")
    public WebElement viewCartButton;
    public WebElement getViewCartButton(){
        return viewCartButton;
    }

    @FindBy(css="tr:nth-of-type(2)  h4 > a")
    public WebElement menTshirt;
    public WebElement getMenTshirt(){
        return menTshirt;
    }

    @FindBy(css="tr:nth-of-type(1)  h4 > a")
    public WebElement blueTop;
    public WebElement getBlueTop(){
        return blueTop;
    }


}
