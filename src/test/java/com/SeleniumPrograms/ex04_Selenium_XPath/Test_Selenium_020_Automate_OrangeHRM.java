package com.SeleniumPrograms.ex04_Selenium_XPath;

import com.SeleniumPrograms.Common_To_All;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_020_Automate_OrangeHRM extends Common_To_All {

    @Description("Verify orange HRM login")
    @Severity(SeverityLevel.NORMAL)
    @Test

    public void test_OHRM_login(){
        openBrowser("https://awesomeqa.com/hr/web/index.php/auth/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]")));
        username.sendKeys("admin");

        WebElement pswd = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        pswd.sendKeys("Hacker@4321");

        WebElement login_btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        login_btn.click();


        WebElement pim = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"oxd-main-menu-item active\"]")));

        Assert.assertEquals(pim.getText(),"PIM");
        System.out.println(pim.getText());

    }
}
