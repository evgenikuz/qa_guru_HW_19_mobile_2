package tests.local;

import org.junit.jupiter.api.Test;
import screens.ExploreScreen;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class WikiScreensTest extends TestBase {
    ExploreScreen exploreScreen = new ExploreScreen();

    @Test
    void successfulSearchOnExploreScreenTest() {
        back();
        step("Type search", () -> {
            exploreScreen.pressOnFakeInput()
                    .sendKeysToRealInput("Appium");
        });
        step("Verify content found", () ->
                exploreScreen.countResultsShouldBeGreaterThan(0));
    }

    @Test
    void ExploreScreenTest() {
        back();
        step("", () -> {

        });
        step("", () -> {

        });
    }

    @Test
    void SavedScreenTest() {
        back();
        step("", () -> {

        });
        step("", () -> {

        });
    }

    @Test
    void SearchScreenTest() {
        back();
        step("", () -> {

        });
        step("", () -> {

        });
    }

    @Test
    void EditsScreenTest() {
        back();
        step("", () -> {

        });
        step("", () -> {

        });
    }

    @Test
    void MoreScreenTest() {
        back();
        step("", () -> {

        });
        step("", () -> {

        });
    }
}
