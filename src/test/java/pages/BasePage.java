package pages;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.BaseTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class BasePage {

    AndroidDriver driver = BaseTest.getAndroidDriver();
    TouchAction touchAction = BaseTest.getAction();
    WebDriverWait wait = (WebDriverWait) BaseTest.getWait();

    public static int randomSelectionIndexer(List<AndroidElement> list) {
        Random random = new Random();
        int bound = list.size();
        int randomGeneratedNumber = random.nextInt(bound - 1);
        System.out.println(randomGeneratedNumber);
        return randomGeneratedNumber;
    }

    public void click(By by) {

        driver.findElement(by).click();
    }

    public void checkElementVisibility(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public boolean checkElementInvisibility(By by){
        if(driver.findElement(by).isDisplayed() == true){
            return true;
        }else{
            return false;
        }
    }

    public void randomSelection(By by) {
        List<AndroidElement> elementList = driver.findElements(by);
        elementList.get(randomSelectionIndexer(elementList)).click();
    }

    public int getElementCount(By by){
        List<AndroidElement> elementList = driver.findElements(by);
        int count = elementList.size();
        System.out.println(count);
        return count;
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void slideElementToElement(WebElement element1,WebElement element2) {
        touchAction.longPress(LongPressOptions
                        .longPressOptions()
                        .withElement(element(element1))
                        .withDuration(ofSeconds(2)))
                .moveTo(element(element2))
                .release()
                .perform();
    }

    public WebElement findWebElement(By by){
        WebElement element = driver.findElement(by);
        return element;
    }

    public String getAttribute(By by, String attributeName){
        String attribute = driver.findElement(by).getAttribute(attributeName);
        return attribute;
    }

    public String getToasterMessage(By by){
        String message = driver.findElement(by).getText();
        System.out.println(message);
        return message;
    }


}
