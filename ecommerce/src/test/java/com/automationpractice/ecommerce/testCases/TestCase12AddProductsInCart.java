package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase12AddProductsInCartPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase12AddProductsInCart extends BaseClass {
    @Test
    public void testCase12AddProductsInCart(){

        TestCase12AddProductsInCartPages tc12apicp =new TestCase12AddProductsInCartPages(driver);

//      TC - 4. Click 'Products' button

        if (tc12apicp.getProductsButton().isDisplayed())
        {
            String productsButtonText= tc12apicp.getProductsButton().getText();
            System.out.println(productsButtonText + Data.POSITIVE_MASSAGE);
            Assert.assertTrue(true,productsButtonText);
            tc12apicp.getProductsButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

//      TC - 5. Hover over first product and click 'Add to cart'
        Actions actionOne = new Actions(driver);
        actionOne.moveToElement(tc12apicp.getFirstProduct()).perform();
        sleepTest(2000);
        tc12apicp.getAddToCartButton().isDisplayed();
        sleepTest(2000);
        tc12apicp.getAddToCartButton().click();
        sleepTest(2000);


//      TC - 6. Click 'Continue Shopping' button
        if(tc12apicp.getContinueShoppingButton().isDisplayed()){
            String continueShoppingButtonText= tc12apicp.getContinueShoppingButton().getText();
            Assert.assertEquals(Data.CONTINUE_SHOPING_BUTTON_TEXT,continueShoppingButtonText);
            System.out.println( "✔" + continueShoppingButtonText + "✔" + Data.IS_VISIBLE);
            tc12apicp.getContinueShoppingButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


//        driver.navigate().refresh();

//      TC - 7. Hover over second product and click 'Add to cart'
        Actions actionTWO = new Actions(driver);
        actionTWO.moveToElement(tc12apicp.getSecondProduct()).perform();
        sleepTest(2000);
        tc12apicp.getSecondProductAddtoCart().isDisplayed();
        sleepTest(2000);
        tc12apicp.getSecondProductAddtoCart().click();
        sleepTest(2000);


//      TC - 8. Click 'View Cart' button
        if(tc12apicp.getViewCartButton().isDisplayed()){
            String viewCartButtonText= tc12apicp.getViewCartButton().getText();
            Assert.assertEquals(Data.VIEW_CART_BUTTON_TEXT,viewCartButtonText);
            System.out.println( "✔" + viewCartButtonText + "✔" + Data.IS_VISIBLE);
            sleepTest(1000);
            tc12apicp.getViewCartButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);
//      TC - 9. Verify both products are added to Cart

        tc12apicp.getBlueTop().isDisplayed();
        String blueTop  = tc12apicp.getBlueTop().getText();
        Assert.assertEquals(blueTop,"Blue Top");

        tc12apicp.getMenTshirt().isDisplayed();
        String menTshirt  = tc12apicp.getMenTshirt().getText();
        Assert.assertEquals(menTshirt,"Men Tshirt");


    }
}
