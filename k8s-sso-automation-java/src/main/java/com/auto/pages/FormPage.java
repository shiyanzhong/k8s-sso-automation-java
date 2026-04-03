package com.auto.pages;

import com.auto.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FormPage extends BasePage {

    @FindBy(id = "form-input-name")
    private WebElement nameInput;

    @FindBy(id = "form-input-email")
    private WebElement emailInput;

    @FindBy(id = "form-submit-btn")
    private WebElement submitBtn;

    @FindBy(id = "submit-success-msg")
    private WebElement successMsg;

    public FormPage(WebDriver driver) {
        super(driver);
    }

    public void submitTestForm(String name, String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(nameInput)).sendKeys(name);
        wait.until(ExpectedConditions.visibilityOf(emailInput)).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
    }

    public boolean isSubmitSuccess() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            return wait.until(ExpectedConditions.visibilityOf(successMsg)).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}