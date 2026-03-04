package com.SeleniumPrograms.ex03_Selenium_Locators;

import com.SeleniumPrograms.Common_To_All;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.commons.math3.ml.neuralnet.twod.util.TopographicErrorHistogram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Test_Selenium_018_MiniProject2 extends Common_To_All {

   // <a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
    // class="btn btn--link btn--primary Fw(medium)"
    // target="_blank"
    // rel="noreferrer"
    // data-qa="bericafeqo"
    // vwo-html-translate="login:startFreeTrial">Start a free trial
    // </a>

    @Description("Get the error message while entering invalid email id")
    @Severity(SeverityLevel.CRITICAL)
    @Test

    public void test_trial_page(){

        openBrowser("https://app.vwo.com/#/login");

        String parentWindow = driver.getWindowHandle();
        WebElement trial_url = driver.findElement(By.partialLinkText("trial"));
        trial_url.click();

      //  Assert.assertTrue(driver.getCurrentUrl().contains("free-trial/"));

       Set<String> handles = driver.getWindowHandles();

       for (String handle: handles){
           if(!handle.equals(parentWindow)){
               driver.switchTo().window(handle);
                break;
            }
        }
        WebElement input_box = driver.findElement(By.id("page-v1-step1-email"));
        input_box.sendKeys("Vipendra@gmail.com");

        WebElement tick_box= driver.findElement(By.name("gdpr_consent_checkbox"));
        tick_box.click();

        WebElement click_btn = driver.findElement(By.tagName("button"));
        click_btn.click();

        WebElement err_msg = driver.findElement(By.className("invalid-reason"));
        System.out.println(err_msg.getText());
    }
}
