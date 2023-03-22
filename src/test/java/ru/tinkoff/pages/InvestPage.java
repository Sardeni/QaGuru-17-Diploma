package ru.tinkoff.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class InvestPage {
    public SelenideElement

            menuItemReview = $$("[href=\"/invest/\"][data-qa-type=\"uikit/navigation.menuItem\"]").last(),
            menuItemCatalog = $("[href=\"/invest/recommendations/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            menuItemPulse = $("[href=\"/invest/pulse/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            menuItemAnalytics = $("[href=\"/invest/research/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            menuItemAcademy = $("[href=\"/invest/education/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            menuItemScreener = $("[href=\"/invest/stock-screener/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            menuItemTerminal = $("[href=\"/invest/web-terminal/\"][data-qa-type=\"uikit/navigation.menuItem\"]");

    public InvestPage checkElementText(SelenideElement element, String text) {
        element.shouldHave(text(text));
        return this;
    }
}
