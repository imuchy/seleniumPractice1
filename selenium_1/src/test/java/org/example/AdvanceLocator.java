package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AdvanceLocator extends DriverSetup{
    public void nopCommerce() throws InterruptedException {
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.cssSelector("form > input")).sendKeys("Apple MacBook Pro 13-inch");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@type=\"submit\" and @class=\"button-1 search-box-button\"]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[starts-with(@href,\"/apple-macbook\")]")).click();     // we're using "starts-with" because we can remove last portion of attibute's value like apple-mac er -mac badd dileu cholbe
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[contains(@id,\"cart-button\")]")).click();     // we're using "contains" because we can remove any portion of attibute's value like add-t-cart-button-4 er only cart-button nileu cholbe
        Thread.sleep(2000);

        driver.findElement(By.linkText("shopping cart")).click();
        Thread.sleep(500);

        String unitPrice = driver.findElement(By.xpath("//tr/td[5]/preceding-sibling::td[1]")).getText();
        String totalPrice = driver.findElement(By.xpath("//tr/td[5]/following-sibling::td[1]")).getText();
        Assert.assertEquals(unitPrice, "$1,800.00");
        Assert.assertEquals(totalPrice, "$3,600.00");
        Thread.sleep(2000);
    }
}
