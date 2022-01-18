package com.automationpractice.ecommerce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class First extends BasePage {
    public First(WebDriver driver) {
        super(driver);
    }

    @FindBy(css=".header_user_info [rel]")
    public WebElement signInButton;
    public WebElement getSignInButton(){
        return signInButton;
    }

}
