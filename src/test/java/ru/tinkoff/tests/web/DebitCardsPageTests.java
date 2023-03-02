package ru.tinkoff.tests.web;

import io.qameta.allure.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.NORMAL;

public class DebitCardsPageTests extends TestBase {

    @Test
    @Tag("regress")
    @DisplayName("Checking warning for required field FIO at form")
    @Owner("emelianovam")
    @Severity(NORMAL)
    public void checkingFioInputValidation() {
        open("/cards/debit-cards/");

        step("Click on FIO input", () -> {
            debitCardsPage.click(debitCardsPage.fioInput);
        });
        step("Choosing a random item of cashback", () -> {
            debitCardsPage.click(debitCardsPage.emailInput);
        });
        step("Checking text in warning", () -> {
            debitCardsPage.checkElementText(debitCardsPage.warningBlock, debitCardsPage.warningFillFioFieldText);
        });
    }

    @Test
    @Tag("regress")
    @DisplayName("Checking warning for required field FIO at form")
    @Owner("emelianovam")
    @Severity(NORMAL)
    public void checkingPhoneInputValidation() {
        open("/cards/debit-cards/");

        step("Click on FIO input", () -> {
            debitCardsPage.click(debitCardsPage.phoneInput);
        });
        step("Choosing a random item of cashback", () -> {
            debitCardsPage.click(debitCardsPage.emailInput);
        });
        step("Checking text in warning", () -> {
            debitCardsPage.checkElementText(debitCardsPage.warningBlock, debitCardsPage.warningFillPhoneFieldText);
        });
    }

    @Test
    @Tag("regress")
    @DisplayName("Checking warning for required field Date of birth at form")
    @Owner("emelianovam")
    @Severity(NORMAL)
    public void checkingDateOfBirthInputValidation() {
        open("/cards/debit-cards/");

        step("Click on FIO input", () -> {
            debitCardsPage.click(debitCardsPage.dateOfBirthInput);
        });
        step("Choosing a random item of cashback", () -> {
            debitCardsPage.click(debitCardsPage.emailInput);
        });
        step("Checking text in warning", () -> {
            debitCardsPage.checkElementText(debitCardsPage.warningBlock, debitCardsPage.warningFillDateOfBirthFieldText);
        });
    }

}