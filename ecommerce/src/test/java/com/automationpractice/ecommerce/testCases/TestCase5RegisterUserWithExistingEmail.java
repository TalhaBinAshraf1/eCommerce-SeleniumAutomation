package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase5RegisterUserWithExistingEmailPage;
import com.automationpractice.ecommerce.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase5RegisterUserWithExistingEmail extends BaseClass{

    @Test
    public void testCase5RegisterUserWithExistingEmail(){

        TestCase5RegisterUserWithExistingEmailPage tc5ruweep = new TestCase5RegisterUserWithExistingEmailPage(driver);


        //TC-4 Click on 'Signup / Login' button
        tc5ruweep.getSignInButton().click();
        System.out.println("Sign in Button Clicked");

        //TC-5  Login URL Validation / Verify that home page is visible successfully
        String loginURL = driver.getCurrentUrl();
        System.out.println("Given "+loginURL);
        Assert.assertEquals(loginURL , Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("login URL is validate");


        //TC-6 Verify 'New User Signup!' is visible
        if (tc5ruweep.getNewUserSignupText().isDisplayed())
        {
            String newUserSignupText= tc5ruweep.getNewUserSignupText().getText();
            System.out.println(newUserSignupText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.NEW_USER_SIGNUP_TEXT,newUserSignupText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //TC -7 Enter name and email address
        if (tc5ruweep.getNameInputFieldInSignUpForm().isDisplayed())
        {
            tc5ruweep.getNameInputFieldInSignUpForm().sendKeys(Data.DEMO_USER_NAME);
        }
        else {
            System.out.println(tc5ruweep.getNameInputFieldInSignUpForm() + Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        if (tc5ruweep.getEmailInputFieldInSignUpForm().isDisplayed())
        {
            tc5ruweep.getEmailInputFieldInSignUpForm().sendKeys(Data.DEMO_EMAIL);
        }
        else {
            System.out.println(tc5ruweep.getEmailInputFieldInSignUpForm() + Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //7. Click 'Signup' button

        if(tc5ruweep.getSignupButton().isDisplayed()){
            String signupButtonText= tc5ruweep.getSignupButton().getText();
            Assert.assertEquals(Data.SIGNUP_BUTTON_TEXT,signupButtonText);
            System.out.println( "✔" + signupButtonText + "✔" + Data.IS_VISIBLE);
            tc5ruweep.getSignupButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //      TC - 8. Verify error 'Email Address already exist!' is visible

        if (tc5ruweep.getEmailAddressAlreadyExistText().isDisplayed())
        {
            String emailAddressAlreadyExist= tc5ruweep.getEmailAddressAlreadyExistText().getText();
            System.out.println(emailAddressAlreadyExist + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.EMAIL_ADDRESS_ALREADY_EXIST,emailAddressAlreadyExist);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

    }
}
