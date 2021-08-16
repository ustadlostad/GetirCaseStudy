package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;

public class HomePageTest extends HomePage {

    @And("user checks if home page exists or not")
    public void user_checks_if_home_page_exists_or_not() {
        checkHomePage();
    }

    @And("User changes category to Baby Care")
    public void user_changes_category_to_baby_care() {
        selectBabyCareCategory();
    }

    @And("User changes category to Snacks")
    public void user_changes_category_to_snacks() {
        slideBabyCareToWater();
        selectSnacksCategory();
    }

    @Given("User gets the number of categories and write this number to console")
    public void user_gets_the_number_of_categories_and_write_this_number_to_console() {
        getAllTabs();

    }

    @And("User open a random category")
    public void user_open_a_random_category() {
        selectRandomCategory();
    }

    @And("User adds {int} random products to wishlist via mini heart icon")
    public void user_adds_random_products_to_wishlist_via_mini_heart_icon(Integer int1) {
        randomThreeWishlist(int1);
    }

    @And("User opens the menu in the left")
    public void user_opens_the_menu_in_the_left() {
        openMenu();
    }

    @And("User go to ‘My Wishlist’")
    public void user_go_to_my_wishlist() {
        clickWishlist();
    }

    @And("User tabs mini heard icon again to remove added product")
    public void user_tabs_mini_heard_icon_again_to_remove_added_product() {
        clickMiniWishlistButtonAgainForWishListedElement();
    }

    @And("user checks item added toaster message")
    public void user_checks_item_added_toaster_message() {
        checkItemAddedToasterMessage();
    }

    @And("user checks item removed toaster message")
    public void user_checks_item_removed_toaster_message() {
        checkItemRemovedToasterMessage();
    }




}
