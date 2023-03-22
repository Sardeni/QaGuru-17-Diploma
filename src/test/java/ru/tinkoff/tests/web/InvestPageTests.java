package ru.tinkoff.tests.web;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.SeverityLevel.NORMAL;

@Owner("emelianovam")
@Tag("regress")

public class InvestPageTests extends TestBase {
    @Test
    @Tag("smoke")
    @DisplayName("Checking menu items")
    @Severity(NORMAL)
    @Feature("InvestPage menu")
    public void checkingMenuItems() {
        open("/invest/");

        investPage.checkElementText(investPage.menuItemReview, "Обзор")
                .checkElementText(investPage.menuItemCatalog, "Каталог")
                .checkElementText(investPage.menuItemPulse, "Пульс")
                .checkElementText(investPage.menuItemAnalytics, "Аналитика")
                .checkElementText(investPage.menuItemAcademy, "Академия")
                .checkElementText(investPage.menuItemScreener, "Скринер")
                .checkElementText(investPage.menuItemTerminal, "Терминал");
    }
}