package com.SeleniumPrograms.ex04_Selenium_XPath;

import com.SeleniumPrograms.Common_To_All;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_21_Automate_CuraHealthcare extends Common_To_All {

    @Description("Test case to validate login and make appointment")
    @Severity(SeverityLevel.NORMAL)
    @Test

    public void test_cura_login_flow(){
        openBrowser("https://katalon-demo-cura.herokuapp.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement appointmnet = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id=\"btn-make-appointment\"]")));
        appointmnet.click();

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"txt-username\"]")));
        username.sendKeys("John Doe");

        WebElement pswd = driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
        pswd.sendKeys("ThisIsNotAPassword");

        WebElement login = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login.click();

       WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[\"Make Appointment\"]")));
       System.out.println(title.getText());
        Assert.assertEquals(title.getText(), "Make Appointment");





    }
}
