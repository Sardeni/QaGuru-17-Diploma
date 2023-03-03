package ru.tinkoff.tests.web;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.*;
public class MainPageTests extends TestBase {


    @Test
    @Tag("regress")
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
