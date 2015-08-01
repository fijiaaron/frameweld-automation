package com.frameweld.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WhatWeDoPage extends WebDriverPage {

    public String path = "/what-we-do.html";

    public Expected expected;
    public Elements elements;

    public WhatWeDoPage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        expected = new Expected();
        elements = new Elements();
    }

    public void open() {
        driver.get(baseUrl + path);
    }

    public class Expected {
        public String TITLE = "Frameweld - What We Do";
    }

    public class Elements {

    }
}
