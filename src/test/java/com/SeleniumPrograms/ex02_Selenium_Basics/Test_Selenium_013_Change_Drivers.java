package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Selenium_013_Change_Drivers {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver= new FirefoxDriver();
        driver.manage().window().maximize();

    }
}
