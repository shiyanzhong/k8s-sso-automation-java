package com.auto.tests;

import com.auto.core.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void startBrowser() {
        driver = DriverManager.getDriver();
    }

    @AfterClass
    public void closeBrowser() {
        DriverManager.closeDriver();
    }
}