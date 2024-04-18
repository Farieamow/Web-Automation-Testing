package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class Testwebpage extends Browsersetup{
    @Test
    public void testpage() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        // BY ID SEARCH
        WebElement autocomplteTextBox =browser.findElement(By.id("autocomplete"));
        autocomplteTextBox.sendKeys("Hi");
        //BY CLASSNAME SEARCH
        WebElement radioButton=browser.findElement(By.className("radioButton"));
        radioButton.click();
       // BY NAME SEARCH
        WebElement option1=browser.findElement(By.name("checkBoxOption1"));
        option1.click();
        // BY TAGNAMR SEARCH
        WebElement tagname=browser.findElement(By.tagName("h1"));
        System.out.println(tagname.getText());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //BY LINK SEARCH WITH FULL TEXT AND PARTIAL TEXT
        //browser.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        //browser.findElement(By.partialLinkText("ResumeAssistance/Material")).click();
        //Thread.sleep(5000);
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(200);
        browser.findElement(By.xpath("//input[@value='radio3']")).click();
        browser.quit();
    }
}
