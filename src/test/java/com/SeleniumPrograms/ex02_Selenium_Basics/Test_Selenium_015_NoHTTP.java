package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Selenium_015_NoHTTP {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       // driver.get("bing.com"); // HTTPs is required and it is important.
        driver.get("https://Bing.com"); // HTTPs is important.
    }
}
