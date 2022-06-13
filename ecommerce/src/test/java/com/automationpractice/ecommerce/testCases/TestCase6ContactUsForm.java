package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase6ContactUsFormPage;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6ContactUsForm extends BaseClass{

    @Test

    public void testCase6ContactUsForm(){
        TestCase6ContactUsFormPage tc6cufp = new TestCase6ContactUsFormPage(driver);

//    TC  - 4. Click on 'Contact Us' button

        tc6cufp.getContactusButton().click();
        sleepTest(1000);

        //    TC  - 5. Verify 'GET IN TOUCH' is visible

        if (tc6cufp.getGetInTouchText().isDisplayed())
        {
            String getInTouchText= tc6cufp.getGetInTouchText().getText();
            System.out.println(getInTouchText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.GET_IN_TOUCH,getInTouchText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//    TC  - 6. Enter name, email, subject and message

        //  Name
        if (tc6cufp.getNameInputField().isDisplayed())
        {
            tc6cufp.getNameInputField().sendKeys(Data.NAME);
            System.out.println("Name Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


      //  Email
        if (tc6cufp.getEmailInputField().isDisplayed())
        {
            tc6cufp.getEmailInputField().sendKeys(Data.EMAIL);
            System.out.println("Email Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,400)");

        //  Subject
        if (tc6cufp.getSubjectInputField().isDisplayed())
        {
            tc6cufp.getSubjectInputField().sendKeys(Data.SUBJECT);
            System.out.println("Subject Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


        // Message
        if (tc6cufp.getMessageInputField().isDisplayed())
        {
            tc6cufp.getMessageInputField().sendKeys(Data.MESSAGE);
            System.out.println("Message Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


//    TC  - 7. Upload file
       // tc6cufp.getChooseFileButton().click();
        tc6cufp.getChooseFileButton().sendKeys("E:\\Github\\SeleniumAutomationPractice\\ecommerce\\testData\\demoImage.png");
        js.executeScript("window.scrollBy(0,200)");

        sleepTest(3000);


//    TC  - 8. Click 'Submit' button

        tc6cufp.getSubmitbutton().click();
        sleepTest(1000);

//    TC  - 9. Click OK button
        driver.switchTo().alert().accept();
        sleepTest(2000);
//    TC  - 10. Verify success message 'Success! Your details have been submitted successfully.' is visible

        if (tc6cufp.getSucessMessageText().isDisplayed())
        {
            String successText= tc6cufp.getSucessMessageText().getText();
            System.out.println(successText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.SUCESS_MESSAGE,successText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(1000);

//    TC  - 11. Click 'Home' button and verify that landed to home page successfully

        tc6cufp.getHomeButton().click();
        sleepTest(1000);

        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is validate");
        sleepTest(1000);

    }

    }

