package ru.tinkoff.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class DebitCardsPage {

    public String warningFillFioFieldText = "Укажите фамилию, имя и отчество через пробел";
    public String warningFillPhoneFieldText = "Укажите номер телефона";
    public String warningFillDateOfBirthFieldText = "Укажите дату рождения";
    public SelenideElement

            fioInput = $("[data-qa-type=\"uikit/inputFio.inputBox uikit/inputFio.inputBox_required\"]"),
            emailInput = $("[data-field-name=\"email\"]"),
            phoneInput = $("[data-field-name=\"phone_mobile\"]"),
            dateOfBirthInput = $("[data-field-name=\"birthdate\"]"),
            warningBlock = $("[data-qa-type=\"uikit/formRow.errorBlock\"]");

    public DebitCardsPage checkElementText(SelenideElement element, String text) {
        element.shouldHave(text(text));
        return this;
    }

    public DebitCardsPage click(SelenideElement element) {
        element.click();
        return this;
    }
}
