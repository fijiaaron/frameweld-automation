import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.frameweld.test.automation.FrameweldAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.frameweld.test.automation.FrameweldAutomation;

public abstract class WebDriverTest {
    WebDriver driver;
    WebDriverWait wait;
    int TIMEOUT=60;

    void setUpWebDriver() {
//        System.setProperty("wedbdriver.chrome.driver", "/path/to/chromedriver");
//        driver = new ChromeDriver();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, TIMEOUT);
    }

    @Before
    public void setUp() {
        setUpWebDriver();
    }

    @After
    public void tearDown() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        driver.quit();
    }

}
