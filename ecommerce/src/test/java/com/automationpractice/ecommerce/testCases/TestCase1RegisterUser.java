package com.automationpractice.ecommerce.testCases;


import com.automationpractice.ecommerce.pages.TestCase1RegisterUserPage;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase1RegisterUser extends BaseClass {

    @Test
    public void testCase1RegisterUser(){

        TestCase1RegisterUserPage  tc1rup =new TestCase1RegisterUserPage(driver);

        //TC-3  HOME URL Validation / Verify that home page is visible successfully
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is validate");

        //TC-4 Click on 'Signup / Login' button
        tc1rup.getSignInButton().click();
        System.out.println("Sign in Button Clicked");

        //TC-5  Login URL Validation / Verify that home page is visible successfully
        String loginURL = driver.getCurrentUrl();
        System.out.println("Given "+loginURL);
        Assert.assertEquals(loginURL , Data.BASE_URL + Data.LOGIN_PAGE_URL);
        System.out.println("login URL is validate");


        //TC-6 Verify 'New User Signup!' is visible
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

        //TC -7 Enter name and email address
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
            tc1rup.getSignupButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //TC - 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        if (tc1rup.getEnterAccountInformation().isDisplayed())
        {
            String enterAccountInformationText= tc1rup.getEnterAccountInformation().getText();
            System.out.println(enterAccountInformationText + Data.POSETIVE_MASSAGE);
            Assert.assertEquals(Data.ENTER_ACCOUNT_INFORMATION,enterAccountInformationText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //Title Mr Mrs radio button validation
        WebElement mr= driver.findElement(By.cssSelector("div:nth-of-type(1) > .top > .radio  input[name='title']"));
        WebElement mrs= driver.findElement(By.cssSelector("div:nth-of-type(2) > .top > .radio  input[name='title']"));
        if(mr.isDisplayed()){
            mr.click();
            mr.isSelected();
            System.out.println("Mr is selected");
        }else {
            System.out.println("Mr not Selected ");
        }
        sleepTest(2000);

        if(mrs.isDisplayed()){
            mrs.click();
            mrs.isSelected();
            System.out.println("Mrs is selected");
        }else {
            System.out.println("Mrs not Selected ");
        }
        sleepTest(2000);

        //TC - 8. Verify that 'Password Input Field' is visible
        if (tc1rup.getPasswordInputField().isDisplayed())
        {
            tc1rup.getPasswordInputField().sendKeys("test01234");
            System.out.println("Password Inputted Successfully");
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


    }


}
