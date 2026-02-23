package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test_Selenium_012_Dynamic_DropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();


       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class=\"commonModal__close\"]"))).click();

        //driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();

        driver.findElement(By.cssSelector("label[for='fromCity']")).click();

      //  driver.findElement(By.xpath("//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]")).sendKeys("RANCHI");
    }
}
