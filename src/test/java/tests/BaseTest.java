package tests;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    public static AndroidDriver<AndroidElement> driver;
    public static Wait wait;
    public static TouchAction touch;

    public static AndroidDriver<AndroidElement> getAndroidDriver() {
        return driver;
    }

    public static TouchAction getAction() {
        return touch;
    }

    public static Wait getWait() {
        return wait;
    }


    @Before
    public static void setUp() throws MalformedURLException {

            File appDir = new File("src");
            File app = new File(appDir, "sampleGetir.apk");
            DesiredCapabilities capabilities = new DesiredCapabilities();


            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "baturEmulator");
            capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            wait = new WebDriverWait(driver, 3);
            touch = new TouchAction(driver);
        }

        @After
        public void tearDown(){
            driver.quit();
        }

    }


