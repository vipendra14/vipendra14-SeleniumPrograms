package com.SeleniumPrograms.ex03_Selenium_Locators;

import com.SeleniumPrograms.Common_To_All;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_016_MiniProject extends Common_To_All {

    @Description("Verify that the error message comes with invalid email on login page.")
    @Severity(SeverityLevel.BLOCKER)
    @Test

    public void test_vwo_Invalid_Login(){
        // Step 1 - Find the EMAIL ID and enter the admin@admin.com.
        // Step 2 - Find the Password and enter the 1234.
        // Step 3 - Find the Submit and click on the button.
        // Step 4 - Wait some time.
        // Step 5 - Verify the message error message.


        openBrowser("https://app.vwo.com/#/login");

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("Vipendra@gmail.com");

        WebElement password_input_box = driver.findElement(By.id("login-password"));
        password_input_box.sendKeys("1234");

        WebElement login_button = driver.findElement(By.id("js-login-btn"));
        login_button.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement err_msg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));
        System.out.println(err_msg.getText());

        Assert.assertTrue(err_msg.isDisplayed(), "Your email, password, IP address or location did not match");

    }
}
