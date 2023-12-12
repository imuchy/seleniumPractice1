package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetup {
    public WebDriver driver;

    @BeforeSuite
    public WebDriver setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();    // to do maximize the browser window
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    //if fail condition, will show noSuchElementException error
        return driver;
    }

    @AfterSuite
    public void quiteDriver(){
        driver.quit();
    }
}
