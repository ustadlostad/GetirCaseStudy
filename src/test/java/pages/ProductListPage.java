package pages;

import org.openqa.selenium.By;

public class ProductListPage extends BasePage{

    //Elements
    public By productList = By.id("com.allandroidprojects.getirsample:id/cardview");

    //Methods
    public void selectRandomProduct() {
        randomSelection(productList);
    }
}
