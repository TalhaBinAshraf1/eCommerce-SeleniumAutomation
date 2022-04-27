package com.automationpractice.ecommerce.testCases;


import com.automationpractice.ecommerce.pages.TestCase2LoginUserWithCorrectEmailAndPasswordPage;
import com.automationpractice.ecommerce.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2LoginUserWithCorrectEmailAndPassword extends BaseClass{

    @Test public void testCase2LoginUserWithCorrectEmailAndPassword(){

        TestCase2LoginUserWithCorrectEmailAndPasswordPage tc2luwceapp =new TestCase2LoginUserWithCorrectEmailAndPasswordPage(driver);

//    TC - 4. Click on 'Signup / Login' button

        tc2luwceapp.getSignInButton().click();
        System.out.println("Sign in Button Clicked");

//    TC - 5. Verify 'Login to your account' is visible

        String loginURL = driver.getCurrentUrl();
        System.out.println("Given "+loginURL);
        Assert.assertEquals(loginURL , Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("login URL is validate");

        if (tc2luwceapp.getLoginToYourAccountText().isDisplayed())
        {
            String loginToYourText= tc2luwceapp.getLoginToYourAccountText().getText();
            System.out.println(loginToYourText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGIN_TO_YOUR_ACCoUNT_TEXT,loginToYourText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//     TC - 6. Enter correct email address and password

        tc2luwceapp.getEmailAddressInputField().sendKeys(Data.DEMO_EMAIL);
        tc2luwceapp.getPasswordInputField().sendKeys(Data.DEMO_PASSWORD);

//     TC - 7. Click 'login' button
        tc2luwceapp.getLoginButton().click();

//     TC - 8. Verify that 'Logged in as username' is visible

        if (tc2luwceapp.getLoggedInAsUsernameText().isDisplayed())
        {
            String loggedInAsUserText= tc2luwceapp.getLoggedInAsUsernameText().getText();
            System.out.println(loggedInAsUserText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGGED_IN_AS_USER_TEXT,loggedInAsUserText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }

//     TC - 9. Click 'Delete Account' button

        tc2luwceapp.getDeleteAccountButton().click();

//     TC - 10. Verify that 'ACCOUNT DELETED!' is visible
        tc2luwceapp.getDeleteButton().click();
        sleepTest(2000);

    }
}
