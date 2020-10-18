package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTest extends TestBase {

    @Test
    void verifyPageHasLoaded() {
        Assert.assertTrue(mainPage.getMainHeader().equals("Blood pressure and pulse visualizer"));
        Assert.assertTrue(mainPage.allPlotsAreVisible());
    }

}
