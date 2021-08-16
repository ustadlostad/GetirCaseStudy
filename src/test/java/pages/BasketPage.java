package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class BasketPage extends BasePage{

    //Elements
    public By basketIcon = By.id("com.allandroidprojects.getirsample:id/action_cart");
    public By basketProductList = By.id("com.allandroidprojects.getirsample:id/image_cartlist");
    public By productPrice = By.xpath("//android.widget.LinearLayout/android.widget.TextView[3]");

    //Methods
    public void goToBasket(){
        click(basketIcon);
    }

    public void checkProductCount(int expectedProductCount){
        Assert.assertEquals("Basket product Count is not true!!",expectedProductCount,getElementCount(basketProductList));
    }

    public void checkProductsPrice(String expectedPrice){
        Assert.assertEquals("Product price is not true",expectedPrice,getAttribute(productPrice,"text"));
    }


}
