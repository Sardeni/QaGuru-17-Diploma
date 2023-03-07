package ru.tinkoff.tests.web;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.CRITICAL;

public class MainPageTests extends TestBase {

    @Test
    @Tag("regress")
    @Tag("smoke")
    @DisplayName("Checking items on main page")
    @Owner("emelianovam")
    @Severity(CRITICAL)
    @Feature("Main page items")
    public void checkingPageItems() {

        open("/");

        step("Checking header", () -> {
            mainPage.checkElementText(mainPage.mainHeader, mainPage.headerText);
        });

        step("Checking main menu items text", () -> {
            mainPage.checkElementText(mainPage.mainMenuItemsBank, "Банк");
            mainPage.checkElementText(mainPage.mainMenuItemsCashRegister, "Касса");
            mainPage.checkElementText(mainPage.mainMenuItemsInvest, "Инвестиции");
            mainPage.checkElementText(mainPage.mainMenuItemsSim, "Сим-карта");
            mainPage.checkElementText(mainPage.mainMenuItemsInsurance, "Страхование");
            mainPage.checkElementText(mainPage.mainMenuItemsTravel, "Путешествия");
            mainPage.checkElementText(mainPage.mainMenuItemsCity, "Город");
        });

        step("Checking getting card form visibility", () -> {
            mainPage.checkVisibility(mainPage.gettingCardForm);
        });
    }
}
