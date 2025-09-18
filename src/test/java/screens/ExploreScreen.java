package screens;

import screens.components.SearchComponent;

public class ExploreScreen {
    SearchComponent searchComponent = new SearchComponent();

    public ExploreScreen pressOnFakeInput() {
        searchComponent.pressOnFakeInput();
        return this;
    }

    public ExploreScreen sendKeysToRealInput(String keys) {
        searchComponent.sendKeysToRealInput(keys);;
        return this;
    }

    public ExploreScreen countResultsShouldBeGreaterThan(Integer amount) {
        searchComponent.countResultsShouldBeGreaterThan(amount);
        return this;
    }

}
