package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Selenium_007_Selenium_commands {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com");

        System.out.println(driver.getTitle() + " : is the title");
        System.out.println(driver.getCurrentUrl()+ " : is the current url");
        System.out.println(driver.getPageSource()+ " : is the page source");

    }
}
