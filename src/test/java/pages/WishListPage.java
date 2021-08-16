package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

public class WishListPage extends BasePage{

    //Elements
    public By wishListProducts = By.xpath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout");
    public By pageHeader = By.xpath("//android.widget.TextView[@text='My Wishlist']");
    public By trashIcon = By.xpath("//*[@resource-id = 'com.allandroidprojects.getirsample:id/ic_wishlist']");

    public By trashIcons(int count){
        return By.xpath("(//*[@resource-id = 'com.allandroidprojects.getirsample:id/ic_wishlist'])" + "[" +count+ "]");
    }

    //Methods
    public void checkPageTitle(){
        checkElementVisibility(pageHeader);
        Assert.assertEquals("Page Header is wrong!","My Wishlist",getAttribute(pageHeader,"text"));
    }

    public void checkProducts(){
        Assert.assertEquals("Product Number is wrong!",3,getElementCount(wishListProducts));
    }

    public void checkProductsInvisibility(){
        Assert.assertEquals("Product is not removed from wishlist!",false,checkElementInvisibility(wishListProducts));
    }

    public void deleteProducts(){
       int size = getElementCount(trashIcon);

        for(int i=size; i>0; i--){
            System.out.println(trashIcons(i));
            click(trashIcons(i));
        }
    }



}
