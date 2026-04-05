package com.SeleniumPrograms.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;

public class AutomateDemoPage {
    public static void main(String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement name = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[normalize-space()=\"Burj Khalifa\"]"))));
       // String height = driver.findElement(By.xpath("//span[text()=\"829m\"]/../..//span[normalize-space()=\"Burj Khalifa\"]")).getText();
     //   String built = driver.findElement(By.xpath("//span[text()=\"2010\"]/../../..//span[normalize-space()=\"Burj Khalifa\"]")).getText();

        String height = driver.findElement(By.xpath("//span[normalize-space()='Burj Khalifa']/ancestor::tr//td[3]")).getText();
        String built = driver.findElement(By.xpath("//span[normalize-space()='Burj Khalifa']/ancestor::tr//td[4]")).getText();

        System.out.println(height);
        System.out.println(built);

        driver.close();

    }
}
