package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionality extends BaseClass{

    @Test
    public void testCase26VerifyScrollUpWithout_Arrow_buttonAndScrollDownFunctionalityPages(){

        TestCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityPages tc26vsuwabasd = new TestCase26VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionalityPages(driver);

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

        if (tc26vsuwabasd.getSubscriptionText().isDisplayed())
        {
            String subscriptionsText = tc26vsuwabasd.getSubscriptionText().getText();
            System.out.println(subscriptionsText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(subscriptionsText,Data.SUBSCRIPTION_TEXT);
            sleepTest(1000);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

//     Enter email address in input and click arrow button

        if (tc26vsuwabasd.getEmailInputField().isDisplayed())
        {
            String emailInputField = tc26vsuwabasd.getEmailInputField().getText();
            System.out.println(emailInputField  + Data.POSITIVE_MASSAGE);
            tc26vsuwabasd.getEmailInputField().sendKeys(Data.DEMO_EMAIL_ADDRESS);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


//     TC - 6. Scroll up page to top


        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", tc26vsuwabasd.getAutomationExerciseImage());

        tc26vsuwabasd.getUpArrowButton().isDisplayed();
        tc26vsuwabasd.getUpArrowButton().click();
        sleepTest(2000);

//     TC - 7 Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen

        tc26vsuwabasd.getAutomationExerciseImage().isDisplayed();
        tc26vsuwabasd.getFullFledgedPracticeWebsite().isDisplayed();


        if (tc26vsuwabasd.getSubscriptionText().isDisplayed())
        {
            String fullFledgedPracticeWebsiteText = tc26vsuwabasd.getFullFledgedPracticeWebsite().getText();
            System.out.println(fullFledgedPracticeWebsiteText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(fullFledgedPracticeWebsiteText,Data.FULL_FLEDGED_PRACTICE_WEBSITE_FOR_AUTOMATION_EXERCISE_TEXT);
            sleepTest(1000);
        }else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }


    }
}
