import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.frameweld.test.automation.FrameweldAutomation;

public class FrameweldSmokeTests extends WebDriverTest {

    FrameweldAutomation frameweld;

    @Before
    public void setUp() {
        super.setUp();
        frameweld = new FrameweldAutomation(driver);
    }
    @Test
    public void load_home_page() {
        frameweld.homePage.open();
        assertThat(driver.getTitle(), is(frameweld.homePage.expected.TITLE));
    }

    @Test
    public void learn_more() {
        frameweld.homePage.open();
        frameweld.homePage.clickLearnMore();
        assertThat(driver.getTitle(), is(frameweld.whatWeDoPage.expected.TITLE));
    }

}
