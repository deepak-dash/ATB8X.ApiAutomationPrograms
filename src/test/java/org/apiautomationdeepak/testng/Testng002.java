package org.apiautomationdeepak.testng;

import org.testng.annotations.*;

public class Testng002 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("	before Test");


    }
    @AfterTest
    public void afterTest() {
        System.out.println("	after test");
    }

    @Test
    public void Test1() {
        System.out.println("					inside test1");
    }

    @Test
    public void Test2() {
        System.out.println("					inside test2");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("		Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("		After class");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("				Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("				After method");
    }
}



class deepak {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before Suite deepak ");


    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite deepak");
    }

    @Test
    public void Test1() {
        System.out.println("					inside deepak test1");
    }

    @Test
    public void Test2() {
        System.out.println("					inside deepak test2");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("		Before class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("		After class");
    }


    @BeforeMethod
    public void beforeMethod() {
        System.out.println("				Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("				After method");
    }
}