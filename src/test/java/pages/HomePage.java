package pages;

import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePage extends BasePage{

    int order;

    //Elements
    public By homePage = By.id("com.allandroidprojects.getirsample:id/recyclerview");
    public By toolBar = By.id("com.allandroidprojects.getirsample:id/toolbar");
    public By tabs = By.id("com.allandroidprojects.getirsample:id/tabs");
    public By babyCareTab = By.xpath("//android.widget.TextView[@text='BABY CARE']");
    public By waterTab = By.xpath("//android.widget.TextView[@text='WATER']");
    public By snacksTab = By.xpath("//android.widget.TextView[@text='SNACKS']");

    public By allTabs = By.xpath("//android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab");
    public By wishListButton = By.id("com.allandroidprojects.getirsample:id/ic_wishlist");
    public By menuButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
    public By leftMenuWishListButton = By.xpath("//android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[9]");

    public By toasterMessage = By.xpath("/hierarchy/android.widget.Toast");

    //Methods
    public void checkHomePage() {
        checkElementVisibility(homePage);
        checkElementVisibility(toolBar);
        checkElementVisibility(tabs);
    }

    public void selectBabyCareCategory() {
        click(babyCareTab);
    }

    public void slideBabyCareToWater(){
        slideElementToElement(findWebElement(waterTab),findWebElement(babyCareTab));
    }

    public void selectSnacksCategory(){
        click(snacksTab);
    }

    public void getAllTabs(){
        getElementCount(allTabs);
    }

    public void selectRandomCategory(){
        randomSelection(allTabs);
    }

    public void randomThreeWishlist(int productNumber){

        getElementCount(wishListButton);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<getElementCount(wishListButton); i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i=0; i<productNumber; i++) {
            System.out.println(list.get(i));
            order = list.get(i);
            List<AndroidElement> elementList = driver.findElements(wishListButton);
            elementList.get(list.get(i)).click();
        }

    }

    public void clickMiniWishlistButtonAgainForWishListedElement(){
        List<AndroidElement> elementList = driver.findElements(wishListButton);
        elementList.get(order).click();
    }

    public void openMenu(){
        click(menuButton);
    }

    public void clickWishlist(){
        click(leftMenuWishListButton);
    }

    public void checkItemAddedToasterMessage(){
        Assert.assertEquals("Message is not suitable!","Item added to wishlist",getToasterMessage(toasterMessage));
    }
    public void checkItemRemovedToasterMessage(){
        Assert.assertEquals("Message is not suitable!","Item removed from wishlist",getToasterMessage(toasterMessage));
    }



}
