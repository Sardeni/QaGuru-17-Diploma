package ru.tinkoff.tests.web;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.tinkoff.config.WebDriverConfig;
import ru.tinkoff.config.WebDriverProvider;
import ru.tinkoff.helpers.Attach;
import ru.tinkoff.pages.CreditCardsPage;
import ru.tinkoff.pages.DebitCardsPage;
import ru.tinkoff.pages.InvestPage;
import ru.tinkoff.pages.MainPage;

public class TestBase {

    MainPage mainPage = new MainPage();
    CreditCardsPage creditCardsPage = new CreditCardsPage();
    DebitCardsPage debitCardsPage = new DebitCardsPage();
    InvestPage investPage = new InvestPage();


    @BeforeAll
    static void beforeAll() {
        WebDriverProvider.config();
    }

    @BeforeEach
    void addListenerAndOpenPage() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
    }
}