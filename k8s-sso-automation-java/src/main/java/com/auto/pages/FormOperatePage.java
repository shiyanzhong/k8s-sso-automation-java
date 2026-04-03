package com.auto.pages;

import com.auto.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormOperatePage extends BasePage {

    @FindBy(name = "dataInput")
    WebElement dataInput;

    @FindBy(css = "button[type='submit']")
    WebElement submitBtn;

    @FindBy(className = "success-info")
    WebElement successMsg;

    public FormOperatePage(WebDriver driver) {
        super(driver);
    }

    public void submitData(String text) {
        input(dataInput, text);
        click(submitBtn);
    }

    public String getResult() {
        return getText(successMsg);
    }
}