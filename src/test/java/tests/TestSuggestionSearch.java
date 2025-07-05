package tests;

import org.testng.annotations.Test;
import pages.SearchPage;

public class TestSuggestionSearch extends TestBase {
    SearchPage search;
    String txt = "che";

    @Test
    public void testSuggestionSearch(){
        search = new SearchPage(driver);
        search.openAllListProductPage(txt);

    }


}
