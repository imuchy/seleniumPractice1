package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class GoogleHomePageLoadOne {
    public void loadGoogleHomePage() throws InterruptedException {
        // open a browser
        WebDriver driver = new ChromeDriver();

        // browse google home page https://www.google.com/
        driver.get("https://www.google.com/");

        // observe google home page
        Assert.assertEquals(driver.getTitle(), "Google");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
        //Thread.sleep(5000);

        // close browser
        driver.close();
    }
}
