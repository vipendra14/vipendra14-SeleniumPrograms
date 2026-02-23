package com.SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common_To_All {
    public ChromeDriver driver;
        public void openBrowser(WebDriver driver, String url){
            driver.get(url);
            driver.manage().window().maximize();
        }

        public void closeBrowser(WebDriver driver){
            try{
                Thread.sleep(3000);
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            driver.quit();
        }
}
