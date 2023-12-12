package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class MultiplePagesLoad extends DriverSetup{

    //for google page laoded
    public void loadGoogleHomePage () {
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
    }

    //for facebook page laoded
    public void loadFacebookHomePage(){
        driver.get("https://www.facebook.com/");
        Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
    }
}
