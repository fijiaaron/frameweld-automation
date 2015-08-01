package com.frameweld.test.automation;

import org.openqa.selenium.WebDriver;

public class WebDriverPage {
    public WebDriver driver;
    public String baseUrl;

    public WebDriverPage(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.baseUrl = baseUrl;
    }

    public String getTitle() {
        return driver.getTitle();
    }
}
