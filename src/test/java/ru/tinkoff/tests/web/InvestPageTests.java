package ru.tinkoff.tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

public class InvestPageTests extends TestBase {
    @Test
    @Tag("regress")
    @DisplayName("Checking menu items")
    @Owner("emelianovam")
    @Severity(NORMAL)
    @Feature("InvestPage menu")
    public void checkingMenuItems() {
        open("/invest/");

        investPage.checkElementText(investPage.menuItemReview, "Обзор");
        investPage.checkElementText(investPage.menuItemCatalog, "Каталог");
        investPage.checkElementText(investPage.menuItemPulse, "Пульс");
        investPage.checkElementText(investPage.menuItemAnalytics, "Аналитика");
        investPage.checkElementText(investPage.menuItemAcademy, "Академия");
        investPage.checkElementText(investPage.menuItemScreener, "Скринер");
        investPage.checkElementText(investPage.menuItemTerminal, "Терминал");
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
            investPage.hover(investPage.contactFormFurtherButton);
            investPage.checkElementText(investPage.contactFormFioLabel, "Фамилия, имя и отчество");
            investPage.checkElementText(investPage.contactFormMobilePhoneLabel, "Мобильный телефон");
            investPage.elementIsDisabled(investPage.contactFormFurtherButton);
        });

        step("Fill inputs in form", () -> {
            investPage.hover(investPage.contactFormFio).click(investPage.contactFormFio);
            investPage.inputData(investPage.contactFormFioInput, "Иванов Семен Петрович");
            sleep(2000);
            investPage.hover(investPage.contactFormMobilePhoneInput).click(investPage.contactFormMobilePhoneInput);
            investPage.inputData(investPage.contactFormMobilePhoneInput, "9174583696");
            investPage.elementIsNotDisabled(investPage.contactFormFurtherButton);
        });

        step("Check the button is not disabled", () -> {
            investPage.elementIsNotDisabled(investPage.contactFormFurtherButton);
        });
    }
}