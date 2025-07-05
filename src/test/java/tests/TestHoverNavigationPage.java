package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class TestHoverNavigationPage extends TestBase{
    HomePage home;
    @Test
    public void TestHoverNavigation(){
        home.selectFromCategory();

    }

}
