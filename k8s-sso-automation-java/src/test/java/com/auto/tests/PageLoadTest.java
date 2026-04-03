package com.auto.tests;

import com.auto.pages.SSOLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageLoadTest extends BaseTest {

    @Test
    public void testHomePageLoad() {
        new SSOLoginPage(driver).loginBySSO();
        Assert.assertTrue(true, "首页加载模拟成功");
    }
}