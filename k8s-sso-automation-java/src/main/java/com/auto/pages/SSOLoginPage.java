package com.auto.pages;

import com.auto.config.FrameworkConfig;
import com.auto.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SSOLoginPage extends BasePage {

    @FindBy(id = "login-username")
    private WebElement usernameInput;

    @FindBy(id = "login-password")
    private WebElement passwordInput;

    @FindBy(id = "login-submit-btn")
    private WebElement submitBtn;

    @FindBy(id = "user-avatar")
    private WebElement userAvatar; // 登录成功后的头像元素，用于验证

    public SSOLoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginBySSO(String username, String password) {
        // 打开真实可访问的测试页面（用GitHub登录页做演示，可替换为真实SSO地址）
        driver.get("https://github.com/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // 等待元素加载，避免NoSuchElement异常
        wait.until(ExpectedConditions.visibilityOf(usernameInput)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordInput)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
    }

    // 新增：登录成功校验方法，真实断言
    public boolean isLoginSuccess() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            return wait.until(ExpectedConditions.visibilityOf(userAvatar)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}