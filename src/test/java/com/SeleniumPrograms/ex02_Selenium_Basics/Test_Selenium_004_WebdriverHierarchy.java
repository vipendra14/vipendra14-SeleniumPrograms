package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test_Selenium_004_WebdriverHierarchy {
    public static void main(String[] args) {

        // Webdriver hierarchy
        // SearchContext(I) -> (2) -> WebDriver(I)( ~10) -> RemoteWebDriver(C) (~15)
        //        //// -> ChromiumDriver(C) ~25 -> EdgeDriver(C) (~45)
        // SearchContext - Interface - findElement, and findElements - GGF
        // WebDriver - Interface - some incomplete functions - GF
        // RemoteWebDriver - Class- It also has some functions - F
        // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver  Class - S

       // Do want to run on  Chrome or Edge?
        SearchContext driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver = new EdgeDriver();
        driver = new SafariDriver();

        WebDriver driver1 = new ChromeDriver();
        driver1 = new FirefoxDriver();
        driver1 = new EdgeDriver();
        driver1 = new SafariDriver();

        RemoteWebDriver driver2 = new ChromeDriver();
        driver2 = new FirefoxDriver();
        driver2 = new EdgeDriver();
        driver2 = new SafariDriver();

        ChromeDriver driver3 = new ChromeDriver();
        FirefoxDriver driver4 = new FirefoxDriver();
        EdgeDriver driver5 = new EdgeDriver();
        SafariDriver driver6 = new SafariDriver();



    }
}
