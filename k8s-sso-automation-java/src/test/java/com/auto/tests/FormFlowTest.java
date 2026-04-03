package com.auto.tests;

import com.auto.pages.FormPage;
import com.auto.pages.SSOLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormFlowTest extends BaseTest {

    @Test
    public void testFormSubmitFlow() {
        // 登录前置
        SSOLoginPage loginPage = new SSOLoginPage(driver);
        loginPage.loginBySSO("test_user", "test_pass");
        Assert.assertTrue(loginPage.isLoginSuccess(), "登录失败，无法进行表单测试");

        // 表单提交流程
        FormPage formPage = new FormPage(driver);
        formPage.submitTestForm("自动化测试数据", "test@example.com");

        // 真实断言：校验提交成功
        Assert.assertTrue(formPage.isSubmitSuccess(), "表单提交失败，成功提示未显示");
    }
}