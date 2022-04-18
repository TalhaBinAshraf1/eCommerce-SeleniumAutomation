package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase7VerifyTestCasesPage_Page;
import com.automationpractice.ecommerce.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase7VerifyTestCasesPage extends BaseClass{

    @Test
    public void testCase7VerifyTestCasesPage(){

        TestCase7VerifyTestCasesPage_Page tc7vtcpp =new TestCase7VerifyTestCasesPage_Page(driver);

//       TC -  4. Click on 'Test Cases' button
        if (tc7vtcpp.getTestCasesButton().isDisplayed())
        {
            String testCasesText= tc7vtcpp.getTestCasesButton().getText();
            System.out.println(testCasesText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.TEST_CASE_TEXT,testCasesText);
            tc7vtcpp.getTestCasesButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//       TC -  5. Verify user is navigated to test cases page successfully

        String testCasesPageLink = driver.getCurrentUrl();
        System.out.println("Given "+testCasesPageLink);
        Assert.assertEquals(testCasesPageLink, Data.TEST_CASE_PAGE_LINK);
        System.out.println("Test Cases Page URL is validate");
        sleepTest(1000);



    }

}
