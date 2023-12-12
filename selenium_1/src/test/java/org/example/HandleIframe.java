package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class HandleIframe extends DriverSetup{
    @Test
    public void testIframeElements() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//button[@id='mousehover']")));
        //driver.switchTo().frame(0);   //to enter into iframe by using index
        //driver.switchTo().frame("courses-iframe");   //to enter into iframe by using id
        //driver.switchTo().frame("iframe-name");   //to enter into iframe by using name
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));   //to enter into iframe by using xpath
        driver.findElement(By.linkText("Courses")).click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();     //to back to outside from iframe
        driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
        Thread.sleep(2000);
    }
}
