package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class DifferentWait extends DriverSetup{
    @Test
    public void testWait() throws InterruptedException {
        driver.get("https://qavbox.github.io/demo/alerts/");
        driver.findElement(By.xpath("//input[@id='delayalert']")).click();
        //Thread.sleep(2000);   //it's called hard sleep. it's class of java.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());  //if fail condition, will show TimeoutException error and another wait is under DriverSetup java class.
        driver.switchTo().alert().accept();
    }
}
