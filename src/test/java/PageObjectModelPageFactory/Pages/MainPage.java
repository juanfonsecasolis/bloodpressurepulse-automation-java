package PageObjectModelPageFactory.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class MainPage extends PageBase {

    @FindBy(xpath = "//H1")
    WebElement mainHeader;

    @FindBy(id = "Systolic")
    WebElement systolicPlot;

    @FindBy(id = "Diastolic")
    WebElement diastolicPlot;

    @FindBy(id = "Pulse")
    WebElement pulsePlot;

    @FindBy(xpath = "//div[@class=\"dash-spreadsheet-container dash-spreadsheet dash-empty-01 dash-fill-width\"]")
    WebElement dataTable;

    @FindBy(id = "scatter")
    WebElement scatterPlot;

    @FindBy(className = "js-plotly-plot")
    WebElement correlationPlot;

    @FindBy(id = "bar_plot")
    WebElement monthlyMeasurementsPlot;

    @FindBy(xpath = "//th[@data-dash-column=\"ESC/ESH*\"]/input")
    WebElement escEshTableFilter;

    @FindBy(xpath = "//td[@class=\"dash-cell column-5\"]")
    List<WebElement> escEshTableCell;

    public MainPage(WebDriver driver){
        super(driver);
    }

    public String getMainHeader(){
        return wait.until(ExpectedConditions.visibilityOf(mainHeader)).getText();
    }

    public boolean allPlotsAreVisible(){
        return wait.until(ExpectedConditions.visibilityOf(systolicPlot)).isDisplayed()
                && wait.until(ExpectedConditions.visibilityOf(diastolicPlot)).isDisplayed()
                && wait.until(ExpectedConditions.visibilityOf(pulsePlot)).isDisplayed()
                && wait.until(ExpectedConditions.visibilityOf(dataTable)).isDisplayed()
                && wait.until(ExpectedConditions.visibilityOf(scatterPlot)).isDisplayed()
                && wait.until(ExpectedConditions.visibilityOf(correlationPlot)).isDisplayed()
                && wait.until(ExpectedConditions.visibilityOf(monthlyMeasurementsPlot)).isDisplayed();
    }

    public void loginAsUser(String userId) {
        driver.navigate().to(baseUrl + userId);
    }

    public void filterByEscEsh(String searchTerm){
        wait.until(ExpectedConditions.visibilityOf(escEshTableFilter))
                .sendKeys(searchTerm+ Keys.ENTER);
    }

    public List<String> getAllEscEshColumnValues() {
        List<WebElement> escEshTableCells;
        List<String> labels = new ArrayList<String>();

        escEshTableCells = wait.until(ExpectedConditions.visibilityOfAllElements(escEshTableCell));
        for(WebElement element : escEshTableCells){
            labels.add(element.getText());
        }

        return labels;
    }
}