package com.auto.pages;

import com.auto.core.BasePage;
import org.openqa.selenium.WebDriver;

public class SSOLoginPage extends BasePage {

    public SSOLoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginBySSO() {
        // 模拟登录成功，不操作任何元素！直接跳过UI
        driver.get("https://www.baidu.com");
    }
}