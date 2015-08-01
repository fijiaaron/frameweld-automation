package com.frameweld.test.automation;

import org.openqa.selenium.WebDriver;

public class FrameweldAutomation {

    public String SITE_URL="http://frameweld.com";

    public HomePage homePage;
    public WhatWeDoPage whatWeDoPage;

    WebDriver driver;

    public FrameweldAutomation(WebDriver driver) {
        this.driver = driver;
        initialize();
    }
    public FrameweldAutomation(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.SITE_URL = baseUrl;
        initialize();
    }

    void initialize() {
        homePage = new HomePage(driver, SITE_URL);
        whatWeDoPage = new WhatWeDoPage(driver, SITE_URL);
    }
}
