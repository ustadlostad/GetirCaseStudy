package pages;

import org.openqa.selenium.By;

public class ProductDetailPage extends BasePage{

    //Elements
    public By addToCard = By.xpath("//android.widget.TextView[@text='ADD TO CART']");

    //Methods
    public void addCard() {
        click(addToCard);
    }

    public void goBack() {
        navigateBack();
    }
}
