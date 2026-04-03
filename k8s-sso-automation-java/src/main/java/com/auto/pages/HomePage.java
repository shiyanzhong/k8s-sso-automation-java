package com.auto.pages;

import com.auto.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class HomePage extends BasePage {

    @FindBy(id = "home-dashboard")
    private WebElement dashboard; // 首页核心仪表盘元素

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageLoaded() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            return wait.until(ExpectedConditions.visibilityOf(dashboard)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}