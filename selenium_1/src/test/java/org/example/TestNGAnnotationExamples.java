package org.example;

import org.testng.annotations.*;

public class TestNGAnnotationExamples {

    @Test(priority = 1) // we're adding priority because if wanna show testCase2 first then testCase1
    public void testCase1(){
        System.out.println("This is test case 1");
    }

    @Test(priority = 0)
    public void testCase2(){
        System.out.println("This is test case 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This will execute after every Method");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This will execute after the Class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This will execute after the Test Suite");
    }
}
