package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SearchPage;

public class TestSearchPage extends TestBase{
    String productName = "Chelsea Tee";
    String txt = "Che";
    SearchPage search;
    SoftAssert softAssert =new SoftAssert()  ;
    @Test
    public void testSearchFeature(){

        search = new SearchPage(driver);
        search.setSearchBArTxt(productName);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        search.openDetailsProductPage();
        softAssert.assertEquals(driver.
                        getTitle()
                ,"Search results for: 'Chelsea Tee'"
                ,"Title is no as expected");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
