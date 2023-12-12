package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DifferentAssertion{
    @Test
    public void handleAssertion(){
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Hello 1");
        System.out.println("Hello 2");
        //Assert.assertTrue(false);
        softAssert.assertTrue(false);
        System.out.println("Hello 3");
        System.out.println("Hello 4");
        System.out.println("Hello 5");
        //softAssert.assertAll();
    }
}
