package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Advancedlocator extends Browsersetup {
    @Test
    public void testpagelocator() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
         }
        browser.findElement(By.xpath("//input[@value='radio3']")).click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        browser.findElement(By.cssSelector("#checkBoxOption1")).click();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        browser.findElement(By.cssSelector(".radioButton")).click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String h1text=browser.findElement(By.cssSelector("h1")).getText();
        System.out.println("css-selector get text:\n"+h1text);
        String h1textxpath=browser.findElement(By.xpath("//h1")).getText();
        System.out.println("Xpath get text:\n"+h1textxpath);
        browser.findElement(By.xpath("//*[@value='radio3']")).click();
        Thread.sleep(200);

        String text=browser.findElement(By.cssSelector("div[id='checkbox-example']>fieldset>legend")).getText();
        System.out.println(text);

        String text1=browser.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/legend")).getText();
        System.out.println(text1);
    }
}
