package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase22AddToCartfromRecommendedItemsPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase22AddToCartFromRecommendedItems extends BaseClass {

    TestCase22AddToCartfromRecommendedItemsPages tc22atcfri = new TestCase22AddToCartfromRecommendedItemsPages(driver);

    @Test

    public void testCase22AddToCartFromRecommendedItems() {

//     TC - 3. Scroll to bottom of page

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
            sleepTest(2000);

//     TC - 4. Verify 'RECOMMENDED ITEMS' are visible

          // Verify text 'SUBSCRIPTION'

            if (tc22atcfri.getSubscriptionText().isDisplayed())
            {
                String subscriptionsText = tc22atcfri.getSubscriptionText().getText();
                System.out.println(subscriptionsText + Data.POSITIVE_MASSAGE);
                Assert.assertEquals(subscriptionsText,Data.SUBSCRIPTION_TEXT);
                sleepTest(1000);
            }else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }

//      Enter email address in input and click arrow button

            if (tc22atcfri.getEmailInputField().isDisplayed())
            {
                String emailInputField = tc22atcfri.getEmailInputField().getText();
                System.out.println(emailInputField  + Data.POSITIVE_MASSAGE);
                tc22atcfri.getEmailInputField().sendKeys(Data.DEMO_EMAIL_ADDRESS);
                tc22atcfri.getArrowButton().isDisplayed();
            }
            else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }
            sleepTest(2000);

//     TC - 5. Click on 'Add To Cart' on Recommended product

            if (tc22atcfri.getRecomandedItemsText().isDisplayed())
            {
                String recommendedItemsText = tc22atcfri.getRecomandedItemsText().getText();
                System.out.println(recommendedItemsText + Data.POSITIVE_MASSAGE);
                Assert.assertEquals(recommendedItemsText,Data.SUBSCRIPTION_TEXT);
                sleepTest(1000);
            }else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }


        }
    }
}
