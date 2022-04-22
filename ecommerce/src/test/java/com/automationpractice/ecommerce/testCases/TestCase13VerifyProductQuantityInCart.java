package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase13VerifyProductQuantityInCartPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase13VerifyProductQuantityInCart extends BaseClass{

    @Test
    public void testCase13VerifyProductQuantityInCartPages(){

        TestCase13VerifyProductQuantityInCartPages tc13vpqicp = new TestCase13VerifyProductQuantityInCartPages(driver);

//       TC - 4. Click 'View Product' for any product on home page

        //Scroll
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

        if(tc13vpqicp.getViewProductButton().isDisplayed()){
            String viewProductButtonText= tc13vpqicp.getViewProductButton().getText();
            Assert.assertEquals(Data.VIEW_PRODUCT_BUTTON_TEXT,viewProductButtonText);
            System.out.println( "✔" + viewProductButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc13vpqicp.getViewProductButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//       TC - 5. Verify product detail is opened

        String firstProductsPageLink = driver.getCurrentUrl();
        System.out.println("Given "+firstProductsPageLink);
        Assert.assertEquals(firstProductsPageLink, Data.FIRST_PRODUCT_PAGE_URL);
        System.out.println("Product Page URL is validate");
        sleepTest(1000);

//       TC - 6. Increase quantity to 4
        tc13vpqicp.getQuantityInputField().isDisplayed();
        tc13vpqicp.getQuantityInputField().clear();
        tc13vpqicp.getQuantityInputField().sendKeys("4");
        sleepTest(1000);

//       TC - 7. Click 'Add to cart' button
        tc13vpqicp.getAddToCartButton().isDisplayed();
        tc13vpqicp.getAddToCartButton().click();
        sleepTest(10000);

//       TC - 8. Click 'View Cart' button

        if(tc13vpqicp.getViewCartButton().isDisplayed()){
            String viewCartButtonText= tc13vpqicp.getViewCartButton().getText();
            Assert.assertEquals(Data.VIEW_CART_BUTTON_TEXT,viewCartButtonText);
            System.out.println( "✔" + viewCartButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc13vpqicp.getViewCartButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//       TC - 9. Verify that product is displayed in cart page with exact quantity

        String viewCartPageLink = driver.getCurrentUrl();
        System.out.println("Given "+viewCartPageLink);
        Assert.assertEquals(viewCartPageLink, Data.VIEW_CART_PAGE_URL);
        System.out.println("Product Page URL is validate");
        sleepTest(1000);

        tc13vpqicp.getQuantityField().isDisplayed();
        String quantityNumber = tc13vpqicp.getQuantityField().getText();
        System.out.printf(quantityNumber);
        Assert.assertEquals(quantityNumber,"4");
        sleepTest(2000);




    }
}
