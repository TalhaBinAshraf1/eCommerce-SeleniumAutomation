package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionality extends  BaseClass {

    @Test
    public void testCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionality() {

        TestCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPages tc25vsu = new TestCase25VerifyScrollUpUsingArrowButtonAndScrollDownFunctionalityPages(driver);

//     TC - 4 Scroll down page to bottom

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
        }
            //     TC - 5 Verify 'SUBSCRIPTION' is visible

            //   Verify text 'SUBSCRIPTION'

            if (tc25vsu.getSubscriptionText().isDisplayed())
            {
                String subscriptionsText = tc25vsu.getSubscriptionText().getText();
                System.out.println(subscriptionsText + Data.POSITIVE_MASSAGE);
                Assert.assertEquals(subscriptionsText,Data.SUBSCRIPTION_TEXT);
                sleepTest(1000);
            }else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }

//     Enter email address in input and click arrow button

            if (tc25vsu.getEmailInputField().isDisplayed())
            {
                String emailInputField = tc25vsu.getEmailInputField().getText();
                System.out.println(emailInputField  + Data.POSITIVE_MASSAGE);
                tc25vsu.getEmailInputField().sendKeys(Data.DEMO_EMAIL_ADDRESS);
            }
            else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }
            sleepTest(2000);


//     TC - 6 Click on arrow at bottom right side to move upward

            tc25vsu.getUpArrowButton().isDisplayed();
            tc25vsu.getUpArrowButton().click();
            sleepTest(2000);

//     TC - 7 Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

            tc25vsu.getAutomationExerciseImage().isDisplayed();
            tc25vsu.getFullFledgedPracticeWebsite().isDisplayed();


            if (tc25vsu.getSubscriptionText().isDisplayed())
            {
                String fullFledgedPracticeWebsiteText = tc25vsu.getFullFledgedPracticeWebsite().getText();
                System.out.println(fullFledgedPracticeWebsiteText + Data.POSITIVE_MASSAGE);
                Assert.assertEquals(fullFledgedPracticeWebsiteText,Data.FULL_FLEDGED_PRACTICE_WEBSITE_FOR_AUTOMATION_EXERCISE_TEXT);
                sleepTest(1000);
            }else {
                System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
            }




    }

}
