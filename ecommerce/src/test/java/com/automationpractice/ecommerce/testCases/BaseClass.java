package com.automationpractice.ecommerce.testCases;

import com.automationpractice.ecommerce.utilities.Data;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;

    @BeforeClass
    public void beforeClass(){
      /*  String baseDir = System.getProperty("user.dir");
        String chromeDir= baseDir + "/browser/chromedriver.exe ";
        String chromeDir= baseDir + "/browser/chromedriver.exe ";

        System.setProperty("webDriver.chrome.driver", chromeDir);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);*/
       // String baseDir = System.getProperty("user.dir");


//        String chromeDir = baseDir + "/browser/chromedriver22.exe";
//        System.setProperty("webdriver.chrome.driver", chromeDir);

        //String firefoxDir = baseDir + "/browser/geckodriver";
        //System.setProperty("webdriver.gecko.driver", firefoxDir);

//        driver = new ChromeDriver();


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//        WebDriverManager.firefoxdriver().setup();
//        driver = new FirefoxDriver();

//        WebDriverManager.iedriver().setup();
//
//        WebDriverManager.edgedriver().setup();
//
//        WebDriverManager.operadriver().setup();
//
//        WebDriverManager.phantomjs().setup();



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // driver.manage().deleteAllCookies();
    }


    @BeforeMethod
        public void beforeMethod() {
        driver.navigate().to("https://www.automationexercise.com/");
         sleepTest(1000);

        //TC-3  HOME URL Validation / Verify that home page is visible successfully
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given "+baseLink);
        Assert.assertEquals(baseLink, Data.BASE_URL);
        System.out.println("Home URL is validate");
        sleepTest(1000);

        }
    @AfterMethod
    public void afterTest(){
        System.out.println(" ");
    }

    @AfterClass
    public void afterClass(){
        driver.quit();

    }

    public static void sleepTest(long sleeptime){
        try{Thread.sleep(sleeptime);
        } catch (Exception e){

        }
    }

}
