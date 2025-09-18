package screens;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class Onboard1LanguageScreen {
    private static final SelenideElement header = $(id("org.wikipedia.alpha:id/primaryTextView")),
                                        addLanguageButton = $(id("org.wikipedia.alpha:id/addLanguageButton")),
                                        skipButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")),
                                        continueButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));
    private static final ElementsCollection languages = $$(id("org.wikipedia.alpha:id/languagesList")),
                                            languageNames = $$(id("org.wikipedia.alpha:id/option_label"));

    public Onboard1LanguageScreen checkHeader(String headerText) {
        header.shouldHave(text(headerText));
        return this;
    }

    public Onboard1LanguageScreen checkLanguageAmount(Integer amount) {
        languages.shouldHave(size(amount));
        return this;
    }

    public Onboard1LanguageScreen checkLanguageInList(String language) {
        languageNames.findBy(text(language)).shouldBe(visible);
        return this;
    }

    public Onboard1LanguageScreen checkAddButtonExists(String buttonText) {
        addLanguageButton.shouldHave(text(buttonText));
        return this;
    }

    public Onboard1LanguageScreen checkSkipButtonExists() {
        skipButton.shouldHave(text("Skip"));
        return this;
    }

    public Onboard1LanguageScreen pressContinueButton() {
        continueButton.shouldHave(text("Continue")).click();
        return this;
    }
}
