package com.SeleniumPrograms.ex03_Selenium_Locators;

import com.SeleniumPrograms.Common_To_All;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_Selenium_017_PartialLinkText_MiniProject2 extends Common_To_All {

    @Description("verify the trail page")
    @Severity(SeverityLevel.MINOR)
    @Test

    public void test_trailpage(){
        openBrowser("https://app.vwo.com/#/login");

        WebElement partial_match = driver.findElement(By.partialLinkText("trial"));
        partial_match.click();



    }
}
