package PageObjectModelPageFactory.Tests;

import Helper.WebDriverHelper;
import PageObjectModelPageFactory.Pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    protected WebDriver driver;
    protected MainPage mainPage;

    @BeforeClass
    void setUp() {
        WebDriverHelper helper = new WebDriverHelper();
        driver = helper.getDriver();
        mainPage = helper.getMainPage();
    }

    @AfterClass
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}