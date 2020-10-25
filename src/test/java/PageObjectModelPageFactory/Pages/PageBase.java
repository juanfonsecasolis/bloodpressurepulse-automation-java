package PageObjectModelPageFactory.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {

    public final String baseUrl = "https://bloodpressurepulse.herokuapp.com/";
    public final long SECONDS_WAIT_PAGE_LOADS = 20;
    public final long SECONDS_WAIT_ELEMENT_LOADS = 15;
    protected WebDriver driver;
    protected WebDriverWait wait;

    PageBase(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, SECONDS_WAIT_ELEMENT_LOADS);
        PageFactory.initElements(driver, this);
    }
}
