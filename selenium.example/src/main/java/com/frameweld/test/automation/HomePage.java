package com.frameweld.test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends WebDriverPage {
    public String path = "/";

    public Expected expected;
    public Elements elements;

    public HomePage(WebDriver driver, String baseUrl) {
        super(driver, baseUrl);
        expected = new Expected();
        elements = new Elements();
    }

    public void open() {
        driver.get(baseUrl + path);
    }

    public void clickLearnMore() {
        driver.findElement(elements.LEARN_MORE_BUTTON).click();
    }

    public class Expected {
        public String TITLE = "Frameweld - Accelerating Innovation, Strategy, Software and Design";
    }

    public class Elements {
        public By LEARN_MORE_BUTTON = By.xpath("//button[contains(text(), 'Learn More')]");
    }
}
