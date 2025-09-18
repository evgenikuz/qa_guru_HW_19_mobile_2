package tests.local;

import org.junit.jupiter.api.Test;
import screens.*;

import static io.qameta.allure.Allure.step;

public class WikiScreensTest extends TestBase {
    Onboard1LanguageScreen languageScreen = new Onboard1LanguageScreen();
    Onboard2ExploreScreen exploreScreen = new Onboard2ExploreScreen();
    Onboard3ReadingListsScreen readingListsScreen = new Onboard3ReadingListsScreen();
    Onboard4DataPrivacyScreen dataPrivacyScreen = new Onboard4DataPrivacyScreen();

    @Test
    void onboardingScreenTest() {
        step("Language Screen Check", () -> {
            languageScreen.checkHeader("The Free Encyclopedia\n…in over 300 languages")
                    .checkLanguageAmount(1)
                    .checkLanguageInList("English")
                    .checkAddButtonExists("Add or edit languages")
                    .checkSkipButtonExists()
                    .pressContinueButton();
        });

        step("Explore Screen Check", () -> {
            exploreScreen.checkHeader("New ways to explore")
                    .checkSkipButtonExists()
                    .pressContinueButton();
        });
        step("Reading Lists Screen Check", () -> {
            readingListsScreen.checkHeader("Reading lists with sync")
                    .checkSkipButtonExists()
                    .pressContinueButton();
        });
        step("Data & Privacy Check", () -> {
            dataPrivacyScreen.checkHeader("Data & Privacy")
                    .checkGetStartedButtonExists();
        });
    }
}
