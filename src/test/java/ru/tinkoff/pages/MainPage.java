package ru.tinkoff.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public String headerText = "Дебетовая карта, которую рекомендуют ваши друзья";

    public SelenideElement

            mainHeader = $("h1[data-test=\"htmlTag title\"]"),
            mainMenuItemsBank = $("a[href=\"/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsCashRegister = $("a[href=\"/kassa/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsInvest = $("a[href=\"/invest/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsSim = $("a[href=\"/mobile-operator/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsInsurance = $("a[href=\"/insurance/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsTravel = $("a[href=\"/travel/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsCity = $("a[href=\"/gorod/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            gettingCardForm = $("#form");
    public MainPage checkElementText(SelenideElement element, String text) {
        element.shouldHave(text(text));
        return this;
    }
    public MainPage checkVisibility(SelenideElement element) {
        element.shouldNotBe(visible);
        return this;
    }
}
