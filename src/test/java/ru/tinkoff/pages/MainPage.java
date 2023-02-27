package ru.tinkoff.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    public String headerText = "Дебетовая карта, которую рекомендуют ваши друзья",

      panelSlideDebitCardsLink = "https://www.tinkoff.ru/cards/debit-cards/?internal_source=home_icon",
              panelSlideCreditCardsLink = "https://www.tinkoff.ru/cards/debit-cards/?internal_source=home_icon",
              panelSlideCreditsLink = "https://www.tinkoff.ru/loans/?internal_source=home_icon",
      getCardTodayText = "Получите Tinkoff Black уже сегодня";
    public SelenideElement
            logo = $("[data-test=\"logo\"]"),
            menuItemForYou = $("[data-test=menu-item-0-title]"),
            menuItemForBusiness = $("[data-test=menu-item-1-title]"),
            menuItemPremium = $("[data-test=menu-item-2-title]"),
            cardNameHeader = $("h1[data-test=\"htmlTag title\"]"),

    getCardButton = $("[data-test=\"htmlTag button\"]"),
            panelSlideDebitCards = $("[data-schema-path=\"0\"][data-test=\"item\"]").$("a"),
            panelSlideCreditCards = $("[data-schema-path=\"1\"][data-test=\"item\"]").$("a"),
            panelSlideCredits = $("[data-schema-path=\"2\"][data-test=\"item\"]").$("a"),
            panelSlideDeposits = $("[data-schema-path=\"3\"][data-test=\"item\"]").$("a"),
            panelSlideInvestments = $("[data-schema-path=\"4\"][data-test=\"item\"]").$("a"),
            panelSlideSimCards = $("[data-schema-path=\"5\"][data-test=\"item\"]").$("a"),
            panelSlideInsurance = $("[data-schema-path=\"6\"][data-test=\"item\"]").$("a"),
            panelSlideTravels = $("[data-schema-path=\"7\"][data-test=\"item\"]").$("a"),
            panelSlideBusiness = $("[data-schema-path=\"8\"][data-test=\"item\"]").$("a");


    public MainPage checkElementText(SelenideElement element, String text) {
        element.shouldHave(text(text));
        return this;
    }

    public MainPage checkElementAttribute(SelenideElement element, String attirbuteType, String attirbuteValue) {
        element.shouldHave(attribute(attirbuteType, attirbuteValue));
        return this;
    }

    public MainPage checkVisibility(SelenideElement element) {
        element.shouldBe(visible);
        return this;
    }


}
