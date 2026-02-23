package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_Selenium_003 {

    @Test
    public void launch_firefox(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
   //     driver.close();
    }
}
