package ru.tinkoff.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;

public class CreditCards {

    public SelenideElement

            sliderInput = $("[data-qa-type=\"uikit/inlineInput.input\"]");

    public CreditCards checkElementAttribute(SelenideElement element, String attirbuteType, String attirbuteValue) {
        element.shouldHave(attribute(attirbuteType, attirbuteValue));
        return this;
    }

}


