package PageObjectModelPageFactory.Tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class MainPageTest extends TestBase {

    @Test(priority=1)
    void verifyPageHasLoaded() {
        Assert.assertTrue(mainPage.getMainHeader().equals("Blood pressure and pulse visualizer"));
    }

    @Test(priority=2)
    @Parameters({ "userId"})
    void verifyUserProfileHasLoaded(String userId) {
        mainPage.loginAsUser(userId);
        Assert.assertTrue(mainPage.allPlotsAreVisible());
    }

    @Test(priority=3)
    @Parameters({ "userId", "searchTermEscEsh"})
    void verifyFilterByKeyword(String userId, String searchTermEscEsh) {
        mainPage.filterByEscEsh(searchTermEscEsh);
        List<String> labelsEscEsh = mainPage.getAllEscEshColumnValues();
        System.out.println("Number of values found in the column: "+labelsEscEsh.size());
        Assert.assertTrue(labelsEscEsh.stream().allMatch(label -> label.equals(searchTermEscEsh)));
    }

}
