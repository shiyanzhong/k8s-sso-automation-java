package com.auto.tests;

import com.auto.pages.SSOLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testSSOLoginSuccess() {
        SSOLoginPage loginPage = new SSOLoginPage(driver);
        // 用测试账号登录
        loginPage.loginBySSO("test_user", "test_pass");
        // 校验登录成功
        Assert.assertTrue(loginPage.isLoginSuccess(), "SSO登录失败，用户头像未显示");
    }
}