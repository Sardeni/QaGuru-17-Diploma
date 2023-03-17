package ru.tinkoff.tests.web;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

public class InvestPageTests extends TestBase {
    @Test
    @Tag("regress")
    @Tag("smoke")
    @DisplayName("Checking menu items")
    @Owner("emelianovam")
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

    @Test
    @Tag("regress")
    @DisplayName("Checking validation on the form")
    @Owner("emelianovam")
    @Severity(NORMAL)
    @Feature("Contact data form")
    public void checkingValidationOnTheForm() {
        open("/invest/");


        step("Checking initial form condition", () -> {
            investPage.hover(investPage.contactFormFurtherButton)
                    .checkElementText(investPage.contactFormFioLabel, "Фамилия, имя и отчество")
                    .checkElementText(investPage.contactFormMobilePhoneLabel, "Мобильный телефон")
                    .elementIsDisabled(investPage.contactFormFurtherButton);
        });

        step("Fill inputs in form", () -> {
            investPage.hover(investPage.contactFormFio).click(investPage.contactFormFio)
                    .inputData(investPage.contactFormFioInput, "Иванов Семен Петрович");
            sleep(2000);
            investPage.hover(investPage.contactFormMobilePhoneInput).click(investPage.contactFormMobilePhoneInput)
                    .inputData(investPage.contactFormMobilePhoneInput, "9174583696")
                    .elementIsNotDisabled(investPage.contactFormFurtherButton);
        });

        step("Check the button is not disabled", () -> {
            investPage.elementIsNotDisabled(investPage.contactFormFurtherButton);
        });
    }
}