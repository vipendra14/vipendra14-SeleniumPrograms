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
import java.util.List;

public class Test_Selenium_019_Automate_TTABank extends Common_To_All {

    @Description("Write the test cases for automating TTA BANK")
    @Severity(SeverityLevel.NORMAL)
    @Test

    public void tta_bank_valid_tc(){
        openBrowser("https://tta-bank-digital-973242068062.us-west1.run.app/");

        // Singup
        WebElement click_btn = driver.findElement(By.xpath("//button[@class='font-medium text-blue-600 hover:text-blue-500 focus:outline-none']"));
        click_btn.click();

        // Verify the current page url and print
        Assert.assertEquals(driver.getCurrentUrl(),"https://tta-bank-digital-973242068062.us-west1.run.app/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());


        // Enter Full name
        WebElement input_box = driver.findElement(By.xpath("//input[@placeholder='John Doe']"));
        input_box.sendKeys("Vipendra Mishra");


        //Enter Emial id
        WebElement email_input = driver.findElement(By.xpath("//input[@placeholder='you@example.com']"));
        email_input.sendKeys("vipendra@gmail.com");


        //Enter password
        WebElement pswd_box = driver.findElement(By.xpath("//input[@placeholder='••••••••']"));
        pswd_box.sendKeys("Catchmeifyoucan**");

        //Click on create account
        WebElement btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        btn.click();

        // after Signup Verify the current page url and print
        Assert.assertEquals(driver.getCurrentUrl(),"https://tta-bank-digital-973242068062.us-west1.run.app/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement trnsfr_fnd = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[normalize-space ()='Transfer Funds']")));
                 trnsfr_fnd.click();

     //   WebElement manage_ben = driver.findElement(By.xpath("//button[normalize-space ()= 'Manage Beneficiaries']"));
        WebElement manage_ben = driver.findElement(By.xpath("//button[@class='pb-3 text-sm font-medium transition-colors text-slate-500 hover:text-slate-700']"));
        manage_ben.click();

        WebElement enter_name = driver.findElement(By.xpath("//input[@placeholder='e.g. John Doe']"));
        enter_name.sendKeys("Ketan King");

        WebElement entr_bank = driver.findElement(By.xpath("//input[@placeholder='e.g. Citibank']"));
        entr_bank.sendKeys("ICICI Bank");

        WebElement acc_num = driver.findElement(By.xpath("//input[@placeholder='8-12 digits']"));
        acc_num.sendKeys("986239091110");

        WebElement clk_btn = driver.findElement(By.xpath("//button[normalize-space()=\"Save Beneficiary\"]"));
        clk_btn.click();

        WebElement manage_ben1 = driver.findElement(By.xpath("//button[normalize-space ()= 'Manage Beneficiaries']"));
        manage_ben1.click();

        WebElement added_beneficary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'Ketan King')]")));

        Assert.assertTrue(added_beneficary.isDisplayed());
        System.out.println("Beneficary added successfully");

        List<WebElement> beneficiaries = driver.findElements(By.xpath("//div[contains(@class,'space-y-3')]"));
        for (WebElement beneficiary: beneficiaries){
            System.out.println(beneficiary.getText());
        }
    }

}
