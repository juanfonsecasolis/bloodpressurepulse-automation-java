package PageObjectModelPageFactory.Tests;

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
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
        mainPage = new MainPage(driver);
        driver.navigate().to(mainPage.baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(mainPage.SECONDS_WAIT_PAGE_LOADS, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(mainPage.SECONDS_WAIT_ELEMENT_LOADS, TimeUnit.SECONDS);
    }

    @AfterClass
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}