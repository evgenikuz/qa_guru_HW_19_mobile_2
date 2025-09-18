package screens;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class Onboard3ReadingListsScreen {
    private static final SelenideElement header = $(id("org.wikipedia.alpha:id/primaryTextView")),
            skipButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")),
            continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));

    public Onboard3ReadingListsScreen checkHeader(String headerText) {
        header.shouldHave(text(headerText));
        return this;
    }

    public Onboard3ReadingListsScreen checkSkipButtonExists() {
        skipButton.shouldHave(text("Skip"));
        return this;
    }

    public Onboard3ReadingListsScreen pressContinueButton() {
        continueButton.shouldHave(text("Continue")).click();
        return this;
    }
}

