package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test_Selenium_011_Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement dropdown  = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
        select.selectByIndex(1);
        select.selectByIndex(2);
    }
}
