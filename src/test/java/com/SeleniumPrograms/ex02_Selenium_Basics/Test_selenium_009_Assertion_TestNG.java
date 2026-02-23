package com.SeleniumPrograms.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.apache.logging.log4j.util.Strings;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test_selenium_009_Assertion_TestNG {

    @Description("Open the url")
    @Test
    public void test_sel_009() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.Google.com/");
        driver.manage().window().minimize();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com/");

        driver.quit();
    }

}
