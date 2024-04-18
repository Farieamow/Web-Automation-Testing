package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Browsersetup {
   public WebDriver browser;
   @BeforeSuite

    public void browsersetup(){
         browser=new ChromeDriver();
    }
    @AfterSuite
    public void quitebrowser(){
       browser.quit();
    }
}
