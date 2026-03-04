package com.SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Common_To_All {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
    driver = new ChromeDriver();
    }
        public void openBrowser(String url){
            driver.get(url);
            driver.manage().window().maximize();
        }
        @AfterMethod
        public void closeBrowser(){
            driver.quit();
            }

        }

