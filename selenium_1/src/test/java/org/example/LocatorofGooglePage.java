package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

@Test
public class LocatorofGooglePage extends DriverSetup{

    public void googleSearchBox() throws InterruptedException {
        driver.get("https://www.google.com/");

        // locate using by ID
        //WebElement searchBox = driver.findElement(By.id("APjFqb"));

        // locate using by Name
        //WebElement searchBox = driver.findElement(By.name("q"));

        // locate using by ClassName
        //WebElement searchBox = driver.findElement(By.className("gLFyf"));

        // locate using by TagName
        WebElement searchBox = driver.findElement(By.tagName("textArea"));
        searchBox.sendKeys("Test Automation");
        Thread.sleep(2000);
        searchBox.clear();

        // locate using by linkText
        /*WebElement gmailLink = driver.findElement(By.linkText("Gmail"));  //In linktext should input exact value like Gmail, not mail.
        gmailLink.click();*/

        // locate using by partialLinkText
        WebElement imageLink = driver.findElement(By.partialLinkText("mages"));  //In partiallinktext can input Image like mages. Not mandatory to input exact value.
        System.out.println(imageLink.getText());
       // imageLink.click();

        // locate using by CSSselector
        WebElement countryName = driver.findElement(By.cssSelector("div[class='uU7dJb']"));
        System.out.println(countryName.getText());

        // locate using by relative xPath
        WebElement languageOption = driver.findElement(By.xpath("//div[@id='SIvCob']"));
        System.out.println(languageOption.getText());
        Thread.sleep(5000);
    }
}
