package pages;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    //Elements
    public By gotItButton = By.id("com.allandroidprojects.getirsample:id/btn_next");

    //Methods
    public void clickGotItButton(int tapRepetition) {
        checkElementVisibility(gotItButton);

        for(int i = 0; i < tapRepetition; i++){
            click(gotItButton);
        }

    }

}
