package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase17RemoveProductsFromCartPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase17RemoveProductsFromCart extends BaseClass{

    @Test
    public void testCase17RemoveProductsFromCartPages (){

        TestCase17RemoveProductsFromCartPages tc17rpfcp =new TestCase17RemoveProductsFromCartPages(driver);

//      TC - 4. Add products to cart
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

        if(tc17rpfcp.getViewProductButton().isDisplayed()){
            String viewProductButtonText= tc17rpfcp.getViewProductButton().getText();
            Assert.assertEquals(Data.VIEW_PRODUCT_BUTTON_TEXT,viewProductButtonText);
            System.out.println( "✔" + viewProductButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc17rpfcp.getViewProductButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        String firstProductsPageLink = driver.getCurrentUrl();
        System.out.println("Given "+firstProductsPageLink);
        Assert.assertEquals(firstProductsPageLink, Data.FIRST_PRODUCT_PAGE_URL);
        System.out.println("Product Page URL is validate");
        sleepTest(1000);

        tc17rpfcp.getQuantityInputField().isDisplayed();
        tc17rpfcp.getQuantityInputField().clear();
        tc17rpfcp.getQuantityInputField().sendKeys("4");
        sleepTest(1000);

//      TC - 5. Click 'Cart' button

        tc17rpfcp.getAddToCartButton().isDisplayed();
        tc17rpfcp.getAddToCartButton().click();
        sleepTest(10000);

        if(tc17rpfcp.getViewCartButton().isDisplayed()){
            String viewCartButtonText= tc17rpfcp.getViewCartButton().getText();
            Assert.assertEquals(Data.VIEW_CART_BUTTON_TEXT,viewCartButtonText);
            System.out.println( "✔" + viewCartButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc17rpfcp.getViewCartButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//      TC - 6. Verify that cart page is displayed

        String viewCartPageLink = driver.getCurrentUrl();
        System.out.println("Given "+viewCartPageLink);
        Assert.assertEquals(viewCartPageLink, Data.VIEW_CART_PAGE_URL);
        System.out.println("Product Page URL is validate");
        sleepTest(1000);

        tc17rpfcp.getQuantityField().isDisplayed();
        String quantityNumber = tc17rpfcp.getQuantityField().getText();
        System.out.printf(quantityNumber);
        Assert.assertEquals(quantityNumber,"4");
        sleepTest(2000);

//      TC - 7. Click 'X' button corresponding to particular product
        tc17rpfcp.getCrossButton().isDisplayed();
        tc17rpfcp.getCrossButton().click();
        sleepTest( 2200);

//      TC - 8. Verify that product is removed from the cart

        driver.navigate().refresh();

        if (tc17rpfcp.getCartEmptyMessage().isDisplayed())
        {
            String cartEmptyMessage= tc17rpfcp.getCartEmptyMessage().getText();
            System.out.println(cartEmptyMessage + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.CART_EMPTY_MESSAGE,cartEmptyMessage);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

    }
}
