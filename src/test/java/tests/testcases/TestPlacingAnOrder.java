package tests.testcases;


import org.testng.annotations.Test;
import pages.P0_HomePage;
import tests.TestBase;


public class TestPlacingAnOrder extends TestBase {


    @Test(priority = 1)
    public void addingItemToCart() {
        new P0_HomePage(driver)
                .navigateToPage()
                .selectProductItem()
                .setLinenBlazer()
                .assertURL();
    }

    @Test(priority = 2)
    public void adding_5ItemTOCart() {

        new P0_HomePage(driver)
                .navigateToPage()
                .selectFromCategoryMan()
                .filterByPrice()
                .getFrenchCuffItemPage()
                .editProductNO(item.numberOfProduct.get(0))
                .setFrenchCuff()
                .assertURL()
                .assertPrice(item.numberOfProduct.get(0),item.FrenchCuff.price);


    }

    @Test(priority = 3)
    public void removeItemIntoCart() {
        new P0_HomePage(driver)
                .navigateToPage()
                .assertTitle()
                .assertURL()
                .selectProductItem()
                .setLinenBlazer()
                .removeFirstItem()
                .assertProductRemoved("Linen Blazer");
    }

    @Test(priority = 4)
    public void invalidAddingItemTCartWithAboveMax() {
        new P0_HomePage(driver)
                .navigateToPage()
                .selectFromCategoryMan()
                .filterByPrice()
                .getFrenchCuffItemPage()
                .setFrenchCuff()
                .modifyNumberOfProduct("1000")
                .submitToUpdateNumberOfProduct()
                .assertURL()
                .assertTheMaxOfQuantity("The requested quantity for \"French Cuff Cotton Twill Oxford\" is not available.");


    }

}
