package org.apiautomationdeepak.ex_28092024_CRUD;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg003 {
    @Description("Verify that true==true")
    @Test
    public void testcase01(){
        Assert.assertEquals(true,true);

    }
    @Description("Verify that true==false")
    @Test
    public void testcase02(){
        Assert.assertEquals(true,false);

    }
}
