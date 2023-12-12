package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InreractingWithWebElement extends DriverSetup{
@Test
    public void testWebElement() throws InterruptedException {
       // driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement textBox = driver.findElement(By.cssSelector("#autocomplete"));
        String tagName = textBox.getTagName();
        System.out.println(tagName);

        textBox.sendKeys("Hello!");
        Thread.sleep(2000);

        System.out.println(textBox.getAttribute("placeholder"));
        Thread.sleep(2000);

        System.out.println(textBox.isDisplayed());

        WebElement checkBoxOptions = textBox.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        checkBoxOptions.click();
        System.out.println("Is selected = " + checkBoxOptions.isSelected());
        System.out.println("Is enabled = " + checkBoxOptions.isEnabled());
        System.out.println("Padding is " + checkBoxOptions.getCssValue("padding"));
        Thread.sleep(1000);
    }
}
