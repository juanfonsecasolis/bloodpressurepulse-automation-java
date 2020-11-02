package Helper;

import PageObjectModelPageFactory.Pages.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class WebDriverHelper {

    WebDriver driver;
    MainPage mainPage;

    public WebDriverHelper(){
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

    public WebDriver getDriver(){ return driver; }

    public MainPage getMainPage(){ return mainPage; }

}
