package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test_Selenium_008_Maximize_Minimize {
    public static void main(String[] args) throws  InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
       driver.manage().window().maximize();

        Thread.sleep(5000);
  //      driver.get("https://api.vwo.com");
   //     driver.manage().window().minimize();

        Assert.assertEquals(driver.getTitle(),"Google");
        driver.quit();

    }
}
