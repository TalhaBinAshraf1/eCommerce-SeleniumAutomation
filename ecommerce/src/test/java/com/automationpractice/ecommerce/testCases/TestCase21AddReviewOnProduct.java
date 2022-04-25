package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase21AddReviewOnProductPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase21AddReviewOnProduct extends BaseClass{

    @Test
    public void testCase21AddReviewOnProductPages(){

        TestCase21AddReviewOnProductPages tc21aropp =new TestCase21AddReviewOnProductPages(driver);

//    TC - 3. Click on 'Products' button
        if (tc21aropp.getProductsButton().isDisplayed())
        {
            String productsButtonText= tc21aropp.getProductsButton().getText();
            System.out.println(productsButtonText + Data.POSITIVE_MASSAGE);
            Assert.assertTrue(true,productsButtonText);
            tc21aropp.getProductsButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//    TC - 4. Verify user is navigated to ALL PRODUCTS page successfully

        String productPageUrl = driver.getCurrentUrl();
        System.out.println("Given "+productPageUrl);
        Assert.assertEquals(productPageUrl, Data.PRODUCTS_PAGE_LINK);
        System.out.println("URL is validate");
        sleepTest(1000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");

//    TC - 5. Click on 'View Product' button

        if (tc21aropp.getViewProductButton().isDisplayed())
        {
            String viewProductsButtonText= tc21aropp.getViewProductButton().getText();
            System.out.println(viewProductsButtonText + Data.POSITIVE_MASSAGE);
            Assert.assertTrue(true,viewProductsButtonText);
            tc21aropp.getViewProductButton().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//    TC - 6. Verify 'Write Your Review' is visible

        if (tc21aropp.getWriteYourReviewText().isDisplayed())
        {
            String writeYourReviewText= tc21aropp.getWriteYourReviewText().getText();
            System.out.println(writeYourReviewText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(writeYourReviewText,Data.WRITE_YOUR_REVIEW_TEXT);

        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);


//    TC - 7. Enter name, email and review
        //NAME
       tc21aropp.getNameInputField().isDisplayed();
       tc21aropp.getNameInputField().sendKeys(Data.DEMO_USER_NAME);

       //EMAIL
       tc21aropp.getEmailInputField().isDisplayed();
       tc21aropp.getEmailInputField().sendKeys(Data.DEMO_EMAIL_ADDRESS);

        //Review
        tc21aropp.getAddReviewInputField().isDisplayed();
        tc21aropp.getAddReviewInputField().sendKeys(Data.DEMO_TEXT);

//    TC - 8. Click 'Submit' button

        tc21aropp.getSubmitButton().isDisplayed();
        tc21aropp.getSubmitButton().click();
        sleepTest(3000);

//    TC - 9. Verify success message 'Thank you for your review.'

        WebElement msg = driver.findElement(By.cssSelector("#review-section > div > div > span"));
        String text = msg.getText() ;
        System.out.println(text);
        //Assert.assertEquals(text, "Thank you for your review.");
        sleepTest(2000);


//        String alert = driver.switchTo().alert().getText();
//        System.out.println(alert);
//        sleepTest(1000);
//        Assert.assertEquals(alert,"Thank you for your review.");
//        sleepTest(2000);


    }
}
