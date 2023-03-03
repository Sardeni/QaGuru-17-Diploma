package ru.tinkoff.tests.web;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.SeverityLevel.NORMAL;

public class CreditCardTests extends TestBase {

    @ParameterizedTest(name = "Checking сredit value {1} after choosing slider {0}")
    @CsvSource(value = {
            "15000, 15 000 ₽",
            "100000, 100 000 ₽",
            "300000, 300 000 ₽",
            "700000, 700 000 ₽"
    })
    @Tag("regress")
    @Owner("emelianovam")
    @Severity(NORMAL)
    @Feature("Credit card form")
    public void checkingHeadersParametrized(String value, String inputValue) {
        open("/cards/credit-cards/");
        $("[data-qa-type=\"uikit/slider.point\"][data-value=\"" + value + "\"]").click();
        creditCardsPage.checkElementAttribute(creditCardsPage.sliderInput, "value", inputValue);
    }


}
