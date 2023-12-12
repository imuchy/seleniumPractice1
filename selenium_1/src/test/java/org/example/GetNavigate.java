package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

@Test
public class GetNavigate extends DriverSetup{
    public void testGetNavigate() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.close();
    }

    public void testWindow() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//a[@id='opentab']")).click();
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();

        System.out.println("The URL is " + driver.getCurrentUrl());
        System.out.println("ONE window identification number = " + driver.getWindowHandle());   //to get ONE window identification number

        List <String> windowHandleList = new ArrayList<>(driver.getWindowHandles());  //to get LIST of window identification numbers
        System.out.println(windowHandleList.get(1));
        System.out.println(windowHandleList.get(2));
        driver.switchTo().window(windowHandleList.get(2));
        System.out.println("This is 3rd URL: " + driver.getCurrentUrl());
        Thread.sleep(2000);

        driver.switchTo().window(windowHandleList.get(1));
        System.out.println("This is 2nd URL: " + driver.getCurrentUrl());
        Thread.sleep(2000);

        driver.switchTo().window(windowHandleList.get(0));
        System.out.println("This is 1st URL: " + driver.getCurrentUrl());
        Thread.sleep(2000);

        Thread.sleep(2000);
    }
}

