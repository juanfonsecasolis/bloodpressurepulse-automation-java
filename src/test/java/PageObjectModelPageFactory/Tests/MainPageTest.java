package PageObjectModelPageFactory.Tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MainPageTest extends TestBase {

    @Test
    void verifyPageHasLoaded() {
        Assert.assertTrue(mainPage.getMainHeader().equals("Blood pressure and pulse visualizer"));
    }

    @Test
    @Parameters({ "userId" })
    void verifyUserProfileHasLoaded(String userId) {
        mainPage.loginAsUser(userId);
        Assert.assertTrue(mainPage.allPlotsAreVisible());
    }

}
