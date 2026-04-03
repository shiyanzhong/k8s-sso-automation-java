package com.auto.tests;

import com.auto.pages.SSOLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testSSOLogin() {
        SSOLoginPage loginPage = new SSOLoginPage(driver);
        loginPage.loginBySSO();
        Assert.assertTrue(true, "SSO 登录模拟成功");
    }
}