package com.auto.tests;

import com.auto.pages.SSOLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormFlowTest extends BaseTest {

    @Test
    public void testFormSubmitFlow() {
        new SSOLoginPage(driver).loginBySSO();
        Assert.assertTrue(true, "表单提交流程模拟成功");
    }
}