package tests;

import io.cucumber.java.en.And;
import pages.ProductDetailPage;

public class ProductDetailPageTest extends ProductDetailPage {

    @And("User adds this product to basket return last page")
    public void user_adds_this_product_to_basket_return_last_page() {
        addCard();
        goBack();
    }

    @And("User adds this product to basket and return last page")
    public void user_adds_this_product_to_basket_and_return_last_page() {
        addCard();
        goBack();
    }
}
