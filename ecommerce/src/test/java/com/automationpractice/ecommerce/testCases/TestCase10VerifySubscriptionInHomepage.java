package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase10VerifySubscriptionInHomepagePages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase10VerifySubscriptionInHomepage extends BaseClass{
    @Test
    public void testCase10VerifySubscriptionInHomepage(){

        TestCase10VerifySubscriptionInHomepagePages tc10vsihp = new TestCase10VerifySubscriptionInHomepagePages(driver);

//      TC-  4. Scroll down to footer

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

//      TC-  5. Verify text 'SUBSCRIPTION'

            if (tc10vsihp.getSubscriptionText().isDisplayed())
            {
                String subscriptionsText = tc10vsihp.getSubscriptionText().getText();
                System.out.println(subscriptionsText + Data.POSITIVE_MASSAGE);
                Assert.assertEquals(subscriptionsText,Data.SUBSCRIPTION_TEXT);
                sleepTest(1000);
            }else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }

//      TC-  6. Enter email address in input and click arrow button
            if (tc10vsihp.getEmailInputField().isDisplayed())
            {
                String emailInputField = tc10vsihp.getEmailInputField().getText();
                System.out.println(emailInputField  + Data.POSITIVE_MASSAGE);
                tc10vsihp.getEmailInputField().sendKeys(Data.DEMO_EMAIL_ADDRESS);
                tc10vsihp.getArrowButton().click();
            }
            else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }
            sleepTest(2000);

//      TC-  7. Verify success message 'You have been successfully subscribed!' is visible

            String alert = driver.switchTo().alert().getText();
            System.out.println(alert);
            sleepTest(1000);
            Assert.assertEquals(alert,"You have been successfully subscribed!");
            sleepTest(2000);


        }
    }
}
