package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Test_Selenium_010_MultipleWindow {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        String mainwindow = driver.getWindowHandle();


        driver.findElement(By.xpath("//span[text()='AI Mode']")).click();

        Set<String> allwindow = driver.getWindowHandles();

        for(String window : allwindow){
            if (!mainwindow.equals(window)){
                driver.switchTo().window(window);
                System.out.println("switchd to new window");
                driver.close();
            }
        }
        driver.switchTo().window(mainwindow);
       // driver.quit();
    }
}
