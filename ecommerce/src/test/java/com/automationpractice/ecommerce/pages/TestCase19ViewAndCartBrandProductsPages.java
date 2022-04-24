package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase19ViewAndCartBrandProductsPages extends BasePage{
    public TestCase19ViewAndCartBrandProductsPages(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".nav.navbar-nav > li:nth-of-type(2) > a")
    public WebElement productsButton;
    public WebElement getProductsButton(){
        return productsButton;
    }

    @FindBy(css=".nav.nav-pills.nav-stacked > li:nth-of-type(1) > a")
    public WebElement poloBrand;
    public WebElement getPoloBrand(){
        return poloBrand;
    }

    @FindBy(css=".text-center.title")
    public WebElement brandPoloProduct;
    public WebElement getBrandPoloProduct(){
        return brandPoloProduct;
    }

    @FindBy(css="li:nth-of-type(8) > a")
    public WebElement bibaBrandButton;
    public WebElement getBibaBrandButton(){
        return bibaBrandButton;
    }




}
