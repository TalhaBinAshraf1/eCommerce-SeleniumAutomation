package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase11VerifySubscriptionInCartpagePages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase11VerifySubscriptionInCartpagePages_TC extends BaseClass {

    @Test
   public void testCase11VerifySubscriptionInCartpagePages_TC(){

        TestCase11VerifySubscriptionInCartpagePages tc11vsicpp =new TestCase11VerifySubscriptionInCartpagePages(driver);


        //TC - 4 Click 'Cart' button

        if(tc11vsicpp.getCartButton().isDisplayed()){
            String cartButtonText= tc11vsicpp.getCartButton().getText();
            Assert.assertEquals(Data.CART_BUTTON_TEXT,cartButtonText);
            System.out.println( "✔" + cartButtonText + "✔" + Data.IS_VISIBLE);
            tc11vsicpp.getCartButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        // TC-  5. Scroll down to footer

        //Infinite Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;

        long initialLength = (long) js.executeScript("return document.body.scrollHeight");

        while (true) {
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            sleepTest(3000);

            long currentLength = (long) js.executeScript("return document.body.scrollHeight");
            if (initialLength == currentLength) {
                break;
            }

            initialLength = currentLength;


//      TC-  6 Verify text 'SUBSCRIPTION'

            if (tc11vsicpp.getSubscriptionText().isDisplayed())
            {
                String subscriptionsText = tc11vsicpp.getSubscriptionText().getText();
                System.out.println(subscriptionsText + Data.POSITIVE_MASSAGE);
                Assert.assertEquals(subscriptionsText,Data.SUBSCRIPTION_TEXT);
                sleepTest(1000);
            }else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }

//      TC-  7. Enter email address in input and click arrow button
            if (tc11vsicpp.getEmailInputField().isDisplayed())
            {
                String emailInputField = tc11vsicpp.getEmailInputField().getText();
                System.out.println(emailInputField  + Data.POSITIVE_MASSAGE);
                tc11vsicpp.getEmailInputField().sendKeys(Data.DEMO_EMAIL_ADDRESS);
                tc11vsicpp.getArrowButton().click();
            }
            else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }
            sleepTest(2000);

//      TC-  8. Verify success message 'You have been successfully subscribed!' is visible

            String alert = driver.switchTo().alert().getText();
            System.out.println(alert);
            sleepTest(1000);
            Assert.assertEquals(alert,"You have been successfully subscribed!");
            sleepTest(2000);


        }


    }
}
