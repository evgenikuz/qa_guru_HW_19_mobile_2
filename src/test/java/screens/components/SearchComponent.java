package screens.components;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchComponent {
    private static final SelenideElement fakeInput = $(accessibilityId("Search Wikipedia")),
            searchInput = $(id("org.wikipedia.alpha:id/search_src_text"));
    private static final ElementsCollection searchResults = $$(id("org.wikipedia.alpha:id/page_list_item_title"));

    public SearchComponent pressOnFakeInput() {
        fakeInput.click();
        return this;
    }

    public SearchComponent sendKeysToRealInput(String keys) {
        searchInput.sendKeys(keys);
        return this;
    }

    public SearchComponent countResultsShouldBeGreaterThan(Integer amount) {
        searchResults.shouldHave(sizeGreaterThan(amount));
        return this;
    }
}
