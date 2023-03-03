package ru.tinkoff.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementIsNotClickableException;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class InvestPage {
    public SelenideElement

            menuItemReview = $$("[href=\"/invest/\"][data-qa-type=\"uikit/navigation.menuItem\"]").last(),
            menuItemCatalog = $("[href=\"/invest/recommendations/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            menuItemPulse = $("[href=\"/invest/pulse/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            menuItemAnalytics = $("[href=\"/invest/research/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            menuItemAcademy = $("[href=\"/invest/education/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            menuItemScreener = $("[href=\"/invest/stock-screener/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            menuItemTerminal = $("[href=\"/invest/web-terminal/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            contactFormFioLabel = $("[data-qa-type=\"uikit/inputFio.inputBox.label\"]"),
             contactFormFio = $("[data-qa-type=\"uikit/inputFio.inputBox uikit/inputFio.inputBox_required\"]"),
            contactFormFioInput = $("[data-qa-type=\"uikit/inputFio.value.input\"]"),
    contactFormMobilePhoneLabel = $("[data-qa-type=\"uikit/input\"]").$("span"),
            contactFormMobilePhoneInput = $("[data-qa-type=\"uikit/input\"]").$("input"),
            contactFormFurtherButton = $("[data-qa-file=\"auth\"][data-qa-type=\"uikit/button\"]");

    public InvestPage checkElementText(SelenideElement element, String text) {
        element.shouldHave(text(text));
        return this;
    }

    public InvestPage click(SelenideElement element) {
        element.click();
        return this;
    }

    public InvestPage elementIsDisabled(SelenideElement element) {
        element.shouldBe(disabled);
        return this;
    }

    public InvestPage elementIsNotDisabled(SelenideElement element) {
        element.shouldNotBe(disabled);
        return this;
    }

    public InvestPage inputData(SelenideElement element, String text) {
        element.sendKeys(text);
        return this;
    }

    public InvestPage hover(SelenideElement element) {
        element.hover();
        return this;
    }
}
