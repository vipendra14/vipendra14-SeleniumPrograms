package com.SeleniumPrograms.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Collections;

public class ProjectNo2_Add_Extension {

    @Description("TC#1 Add extension")
    @Link
    @Test

    public void test_Selenium_01() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1920,1080");
        chromeOptions.addArguments("--incognito");
        File path = new File("src/test/java/com/SeleniumPrograms/ex02_Selenium_Basics/AdBlockers.crx");
        chromeOptions.addExtensions(path);

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.youtube.com/watch?v=Oy05e_YYYms&list=RDGMEMQ1dJ7wXfLlqCjwV0xfSNbAVMOy05e_YYYms&start_radio=1");

        Thread.sleep(5000);

        driver.quit();
    }
}
