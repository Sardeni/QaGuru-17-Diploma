package ru.tinkoff.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public String headerText = "Дебетовая карта, которую рекомендуют ваши друзья";
    public String getCardHeaderText = "Получите Tinkoff Black уже сегодня";

    public SelenideElement

            mainHeader = $("h1[data-test=\"htmlTag title\"]"),

    mainMenuItemsBank = $("a[href=\"/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsCashRegister = $("a[href=\"/kassa/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsInvest = $("a[href=\"/invest/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsSim = $("a[href=\"/mobile-operator/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsInsurance = $("a[href=\"/insurance/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsTravel = $("a[href=\"/travel/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            mainMenuItemsCity = $("a[href=\"/gorod/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            gettingCardForm = $("#form"),
            creditCardsPage = $("[href=\"/cards/credit-cards/\"][data-qa-type=\"uikit/navigation.menuItem\"]"),
            debitCardsPage = $("[href=\"/cards/debit-cards/\"][data-qa-type=\"uikit/navigation.menuItem\"]");

    public MainPage checkElementText(SelenideElement element, String text) {
        element.shouldHave(text(text));
        return this;
    }

    public MainPage checkElementAttribute(SelenideElement element, String attirbuteType, String attirbuteValue) {
        element.shouldHave(attribute(attirbuteType, attirbuteValue));
        return this;
    }

    public MainPage checkVisibility(SelenideElement element) {
        element.shouldNotBe(visible);
        return this;
    }

    public MainPage clickOnElementPage(SelenideElement element) {
        element.click();
        return this;
    }


}
