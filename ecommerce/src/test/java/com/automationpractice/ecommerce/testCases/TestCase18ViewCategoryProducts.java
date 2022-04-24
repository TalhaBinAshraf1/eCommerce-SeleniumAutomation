package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.pages.TestCase18ViewCategoryProductsPages;
import com.automationpractice.ecommerce.utilities.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase18ViewCategoryProducts extends BaseClass{

    @Test
    public void testCase18ViewCategoryProductsPages(){

        TestCase18ViewCategoryProductsPages tc18vcpp =new TestCase18ViewCategoryProductsPages(driver);


//    TC  -  3. Verify that categories are visible on left side bar

     List<WebElement> listElement = driver.findElements(By.cssSelector("div > .panel-heading > .panel-title "));
        for(int i =0;i<listElement.size();i++) {
            String elementText = listElement.get(i).getText();
            System.out.println(elementText);
            Assert.assertEquals("Women","Women");
            Assert.assertEquals("Men","Men");
            Assert.assertEquals("Kids","Kids");
        }
        sleepTest(1000);

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");

//    TC  -  4. Click on 'Women' category
        tc18vcpp.getWomenCategory().click();
        List<WebElement> womenListElement = driver.findElements(By.cssSelector("div#Women ul > li "));
        for(int i =0;i<womenListElement.size();i++) {
            String elementText = womenListElement.get(i).getText();
            System.out.println(elementText);
            Assert.assertEquals("DRESS","DRESS");
            Assert.assertEquals("TOPS","TOPS");
            Assert.assertEquals("Saree","Saree");
        }
        sleepTest(1000);

//    TC  -  5. Click on any category link under 'Women' category, for example: Dress
        if (tc18vcpp.getDress().isDisplayed())
        {
            String dressText= tc18vcpp.getDress().getText();
            System.out.println(dressText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.DRESS_TEXT,dressText);
            tc18vcpp.getDress().click();
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

        //    TC  -  6. Verify that category page is displayed and confirm text 'WOMEN - DRESS PRODUCTS'

        if (tc18vcpp.getWomenDressProductText().isDisplayed())
        {
            String womenDressProductText= tc18vcpp.getWomenDressProductText().getText();
            System.out.println(womenDressProductText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.WOMAN_DRESS_PRODUCTS_TEXT,womenDressProductText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

//    TC  -  7. On left side bar, click on any sub-category link of 'Men' category

        tc18vcpp.getMenCategory().click();
        List<WebElement> menListElement = driver.findElements(By.cssSelector("div#Men  ul > li"));
        for(int i =0;i<menListElement.size();i++) {
            String menSubCategoryText = menListElement.get(i).getText();
            System.out.println(menSubCategoryText);
            Assert.assertEquals("TSHIRTS","TSHIRTS");
            Assert.assertEquals("JEANS","JEANS");
        }
        sleepTest(3000);

//    TC  -  8. Verify that user is navigated to that category page

        tc18vcpp.getMenCategory().click();
        tc18vcpp.getTshirtsbutton().isDisplayed();
        tc18vcpp.getTshirtsbutton().click();
        if (tc18vcpp.getMenTshirtsProduct().isDisplayed())
        {
            String menTshirtProductText= tc18vcpp.getMenTshirtsProduct().getText();
            System.out.println(menTshirtProductText + Data.POSITIVE_MASSAGE);
            Assert.assertEquals(Data.MEN_TSHIRTS_PRODUCTS_TEXT,menTshirtProductText);
        }
        else {
            System.out.println(Data.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTest(2000);

    }

}
