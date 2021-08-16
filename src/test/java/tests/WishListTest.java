package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.WishListPage;

public class WishListTest extends WishListPage {

    @And("User controls the page and products")
    public void user_controls_the_page_and_products() {
        checkPageTitle();
        checkProducts();
    }

    @And("User deletes all of them from Wishlist")
    public void user_deletes_all_of_them_from_wishlist() {
        deleteProducts();
    }

    @And("User checks the page that there is no product on the page")
    public void user_checks_the_page_that_there_is_no_product_on_the_page() {
        checkProductsInvisibility();
    }

}
