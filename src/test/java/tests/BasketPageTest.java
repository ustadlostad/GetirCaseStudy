package tests;

import io.cucumber.java.en.And;
import pages.BasketPage;

public class BasketPageTest extends BasketPage {

    @And("User goes to basket and control added products and prices")
    public void user_goes_to_basket_and_control_added_products_and_prices() {
        goToBasket();
        checkProductCount(2);
        checkProductsPrice("$1,98");

    }

}
