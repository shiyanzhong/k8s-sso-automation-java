package com.auto.core;

import com.auto.config.FrameworkConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(FrameworkConfig.WAIT_SECONDS));
        PageFactory.initElements(driver, this);
    }

    public void open(String url) {
        driver.get(url);
    }

    public void input(WebElement el, String text) {
        el.clear();
        el.sendKeys(text);
    }

    public void click(WebElement el) {
        el.click();
    }

    public String getText(WebElement el) {
        return el.getText();
    }

    public boolean titleContains(String key) {
        return driver.getTitle().contains(key);
    }
}