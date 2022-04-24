package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestCase18ViewCategoryProductsPages extends BasePage{
    public TestCase18ViewCategoryProductsPages(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="div > .panel-heading > .panel-title")
    public WebElement catagoryElemntsList;
    public WebElement getCatagoryElemntsList(){
        return catagoryElemntsList;
    }

    @FindBy(css="div#accordian > div:nth-of-type(1)  h4 > a")
    public WebElement womenCategory;
    public WebElement getWomenCategory(){
        return womenCategory;
    }

    @FindBy(xpath="/html//div[@id='accordian']//a[@href='#Men']")
    public WebElement menCategory;
    public WebElement getMenCategory(){
        return menCategory;
    }

    @FindBy(css="div#Women  ul > li:nth-of-type(1) > a")
    public WebElement dress;
    public WebElement getDress(){
        return dress;
    }

    @FindBy(css=".text-center.title")
    public WebElement womenDressProductText;
    public WebElement getWomenDressProductText(){
        return womenDressProductText;
    }

    @FindBy(css=".text-center.title")
    public WebElement menTshirtsProduct;
    public WebElement getMenTshirtsProduct(){
        return menTshirtsProduct;
    }

    @FindBy(css="div#Men  ul > li:nth-of-type(1) > a")
    public WebElement tshirtsbutton;
    public WebElement getTshirtsbutton(){
        return tshirtsbutton;
    }



}
