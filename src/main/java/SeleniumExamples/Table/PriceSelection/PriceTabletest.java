package SeleniumExamples.Table.PriceSelection;

import SeleniumExamples.Link.BrokenLink.DriverFactory;
import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class PriceTabletest {
    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setDriver(@Optional("chrome") String browser) {
        this.driver = DriverFactory.getDriver(browser);
    }

    @Test
    public void minPriceTest() {
        PriceTable p = new PriceTable(driver);
        p.selectMinPriceRow();
        String status = p.getStatus();

        Assert.assertEquals("PASS", status);

        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
    }

    @AfterTest
    public void quitDriver() {
        this.driver.quit();
    }
}
