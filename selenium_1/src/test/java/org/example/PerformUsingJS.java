package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class PerformUsingJS extends DriverSetup{
    @Test
    public void testJSExecute() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//button[@id='mousehover']")));
        Thread.sleep(2000);
    }
}
