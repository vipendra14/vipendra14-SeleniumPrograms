package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Selenium_002 {

    @Test
    public void test_basic(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }

}
