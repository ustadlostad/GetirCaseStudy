package tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.LandingPage;

public class LandingPageTest extends LandingPage {

    @Given("user passes onboarding screens")
    public void user_passes_onboarding_screens() {
        clickGotItButton(4);
    }



}
