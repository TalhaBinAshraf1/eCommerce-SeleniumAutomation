package com.automationpractice.ecommerce.testCases;


import com.automationpractice.ecommerce.pages.First;
import org.testng.annotations.Test;

public class FirstTc extends BaseClass {

    @Test
    public void firstTc(){

        First f =new First(driver);

        f.signInButton.click();
        System.out.println("Test ran Properly ");


    }


}
