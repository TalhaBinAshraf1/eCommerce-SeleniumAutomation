package com.automationpractice.ecommerce.testCases;


import com.automationpractice.ecommerce.pages.TestCase1RegisterUserPage;
import com.automationpractice.ecommerce.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1RegisterUser extends BaseClass {

    @Test
    public void testCase1RegisterUser(){

        TestCase1RegisterUserPage  tc1rup =new TestCase1RegisterUserPage(driver);

        //TC-1 HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.HOME_PAGE_URL);
        System.out.println("Home URL is validate");
        sleepTest(2000);


        //TC-2 Click on 'Signup / Login' button
        tc1rup.signInButton.click();
        System.out.println("Sign in Button Clicked");

        //TC-3 Verify 'New User Signup!' is visible
        if (tc1rup.getNewUserSignupText().isDisplayed())
        {
            String newUserSignupText= tc1rup.getNewUserSignupText().getText();
            Assert.assertEquals(Data.NEW_USER_SIGNUP_TEXT,newUserSignupText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);



    }


}
