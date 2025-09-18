package screens;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class Onboard4DataPrivacyScreen {
    private static final SelenideElement header = $(id("org.wikipedia.alpha:id/primaryTextView")),
            getStartedButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button"));

    public Onboard4DataPrivacyScreen checkHeader(String headerText) {
        header.shouldHave(text(headerText));
        return this;
    }

    public Onboard4DataPrivacyScreen checkGetStartedButtonExists() {
        getStartedButton.shouldHave(text("Get started"));
        return this;
    }
}
