package tests;

import io.cucumber.java.en.And;
import pages.ProductListPage;

public class ProductListPageTest extends ProductListPage {

    @And("User open a random product detail")
    public void user_open_a_random_product_detail() {
        selectRandomProduct();
    }

}
