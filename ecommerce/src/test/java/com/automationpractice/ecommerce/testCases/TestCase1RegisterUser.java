package com.automationpractice.ecommerce.testCases;


import com.automationpractice.ecommerce.pages.TestCase1RegisterUserPage;
import com.automationpractice.ecommerce.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1RegisterUser extends BaseClass {

    @Test
    public void testCase1RegisterUser(){

        TestCase1RegisterUserPage  tc1rup =new TestCase1RegisterUserPage(driver);

        //TC-3  HOME URL Validation / Verify that home page is visible successfully
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.HOME_PAGE_URL);
        System.out.println("Home URL is validate");


        //TC-4 Click on 'Signup / Login' button
        tc1rup.getSignInButton().click();
        System.out.println("Sign in Button Clicked");

        //TC-5 Verify 'New User Signup!' is visible
        if (tc1rup.getNewUserSignupText().isDisplayed())
        {
            String newUserSignupText= tc1rup.getNewUserSignupText().getText();
            System.out.println(newUserSignupText + Data.POSETIVE_MASSAGE);
            Assert.assertEquals(Data.NEW_USER_SIGNUP_TEXT,newUserSignupText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //TC -6 Enter name and email address
        if (tc1rup.getNameInputFieldInSignUpForm().isDisplayed())
        {
          tc1rup.getNameInputFieldInSignUpForm().sendKeys(Data.DEMO_USER_NAME);
        }
        else {
            System.out.println(tc1rup.getNameInputFieldInSignUpForm() + Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        if (tc1rup.getEmailInputFieldInSignUpForm().isDisplayed())
        {
            tc1rup.getEmailInputFieldInSignUpForm().sendKeys(Data.DEMO_EMAIL);
        }
        else {
            System.out.println(tc1rup.getEmailInputFieldInSignUpForm() + Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //7. Click 'Signup' button

        if(tc1rup.getSignupButton().isDisplayed()){
            String signupButtonText= tc1rup.getSignupButton().getText();
            Assert.assertEquals(Data.SIGNUP_BUTTON_TEXT,signupButtonText);
            System.out.println( "✔" + signupButtonText + "✔" + Data.IS_VISIBLE);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


    }


}
