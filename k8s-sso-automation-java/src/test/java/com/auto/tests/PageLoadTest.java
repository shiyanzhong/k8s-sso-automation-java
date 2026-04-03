package com.auto.tests;

import com.auto.pages.HomePage;
import com.auto.pages.SSOLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageLoadTest extends BaseTest {

    @Test
    public void testHomePageLoadAfterLogin() {
        // 先完成登录
        SSOLoginPage loginPage = new SSOLoginPage(driver);
        loginPage.loginBySSO("test_user", "test_pass");
        Assert.assertTrue(loginPage.isLoginSuccess(), "登录失败，无法进行页面加载测试");

        // 校验首页加载
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isPageLoaded(), "首页加载失败，核心元素未显示");
    }
}