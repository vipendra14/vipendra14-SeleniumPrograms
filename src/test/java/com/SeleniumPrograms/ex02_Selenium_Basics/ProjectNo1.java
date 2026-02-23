package com.SeleniumPrograms.ex02_Selenium_Basics;

import com.SeleniumPrograms.Common_To_All;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProjectNo1 extends Common_To_All {

    @Description("TC#1 : Verify that the particular test exist in katlon website")
    @Link
    @Test

    public void test_verify_text(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");

        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test case Passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Test case failed");
            Assert.assertTrue(false);
        }

driver.quit();

    }



}
