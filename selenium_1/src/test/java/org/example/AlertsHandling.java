package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsHandling extends DriverSetup{
    @Test
    public void testAlerts() throws InterruptedException {

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        
        // For ONE accept button
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Alert alert1 = driver.switchTo().alert();
        Assert.assertEquals(alert1.getText(), "I am a JS Alert");
        Thread.sleep(2000);
        alert1.accept();
        Thread.sleep(2000);
        String result1 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result1, "You successfully clicked an alert");
        Thread.sleep(2000);

        // For ONE accept and ONE cancel buttons
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Alert alert2 = driver.switchTo().alert();
        Assert.assertEquals(alert2.getText(), "I am a JS Confirm");
        Thread.sleep(2000);
        alert2.dismiss();
        Thread.sleep(2000);
        String result2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result2, "You clicked: Cancel");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.accept();
        Thread.sleep(2000);
        result2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result2, "You clicked: Ok");
        Thread.sleep(2000);


        // For textbox with ONE accept and ONE cancel buttons
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert3 = driver.switchTo().alert();
        Assert.assertEquals(alert3.getText(), "I am a JS prompt");
        Thread.sleep(2000);
        alert3.dismiss();
        String result3 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result3, "You entered: null");

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        alert3 = driver.switchTo().alert();
        Assert.assertEquals(alert3.getText(), "I am a JS prompt");
        Thread.sleep(2000);
        alert3.sendKeys("Hello World!");
        Thread.sleep(2000);
        alert3.accept();
        result3 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(result3, "You entered: Hello World!");
        Thread.sleep(2000);

    }
}
