package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase3LoginUserWithIncorrectEmailAndPasswordPage;
import com.automationpractice.ecommerce.utilities.Data;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3LoginUserWithIncorrectEmailAndPassword extends BaseClass{
    @Test
    public void testCase3LoginUserWithIncorrectEmailAndPassword(){

        TestCase3LoginUserWithIncorrectEmailAndPasswordPage tc3luwieap = new TestCase3LoginUserWithIncorrectEmailAndPasswordPage(driver);

//      TC -  4. Click on 'Signup / Login' button

        tc3luwieap.getSignInButton().click();
        System.out.println("Sign in Button Clicked");

//    TC - 5. Verify 'Login to your account' is visible

        String loginURL = driver.getCurrentUrl();
        System.out.println("Given "+loginURL);
        Assert.assertEquals(loginURL , Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("login URL is validate");

        if (tc3luwieap.getLoginToYourAccountText().isDisplayed())
        {
            String loginToYourText= tc3luwieap.getLoginToYourAccountText().getText();
            System.out.println(loginToYourText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.LOGIN_TO_YOUR_ACCoUNT_TEXT,loginToYourText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//     TC - 6. Enter correct email address and password

        tc3luwieap.getEmailAddressInputField().sendKeys(Data.DEMO_INCORRECT_EMAIL);
        tc3luwieap.getPasswordInputField().sendKeys(Data.DEMO_INCORRECT_PASSWORD);

//     TC - 7. Click 'login' button
        tc3luwieap.getLoginButton().click();

        //      TC - 8. Verify error 'Your email or password is incorrect!' is visible

        if (tc3luwieap.getYourEmailOrPasswordIsIncorrectText().isDisplayed())
        {
            String yourEmailOrPasswordIsIncorrectText= tc3luwieap.getYourEmailOrPasswordIsIncorrectText().getText();
            System.out.println(yourEmailOrPasswordIsIncorrectText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.YOUR_EMAIL_OR_PASSWORD_IS_INCORRECT,yourEmailOrPasswordIsIncorrectText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

    }
}
