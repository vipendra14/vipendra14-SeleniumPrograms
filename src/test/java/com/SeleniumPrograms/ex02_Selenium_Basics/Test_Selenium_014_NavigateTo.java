package com.SeleniumPrograms.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_014_NavigateTo {

    @Description("TC#2: Open the URL")
    @Link
    @Test

    public void test_Selenium01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
        // element = wait.until(ExpectedConditions.visibilityOfAllElements());
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

}
