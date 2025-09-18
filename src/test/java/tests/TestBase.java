package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import drivers.BrowserstackDriver;
import drivers.LocalDriver;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    private static final String DEVICE_HOST = System.getProperty("deviceHost", "browserstack");
    @BeforeAll
    static void beforeAll() {
        System.out.println(DEVICE_HOST);
        if (DEVICE_HOST.equals("browserstack")) {
            Configuration.browser = BrowserstackDriver.class.getName();
        } else if (DEVICE_HOST.equals("emulator")) {
            Configuration.browser = LocalDriver.class.getName();
        } else {
            throw new RuntimeException("No Driver was found for " + DEVICE_HOST);
        }
        Configuration.browser = BrowserstackDriver.class.getName();
        Configuration.browserSize = null;
        Configuration.timeout = 30000;
        System.setProperty("selenide.browser", "drivers.BrowserstackDriver");
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

//    @AfterEach
//    void addAttachments() {
//        if (PLATFORM.equals("emulator")) {
//            Attach.screenshotAs("Last screenshot");
//        } else if (PLATFORM.equals("browserstack")) {
//            String sessionId = Selenide.sessionId().toString();
//            Attach.addVideo(sessionId);
//        } else {
//            throw new RuntimeException("Unknown deviceHost");
//        }
//        Attach.pageSource();
//        closeWebDriver();
//    }
}
