package ru.tinkoff.tests.web;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import org.junit.jupiter.api.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static io.qameta.allure.SeverityLevel.*;

public class MainPageTests extends TestBase {


    @Test
    @Tag("regress")
    @DisplayName("Checking items on Main page: logo, menu, etc.")
    @Owner("emelianovam")
    @Severity(CRITICAL)
    public void checkingPageItems() {

        open("/");

//        step("Checking logo", () -> {
//            mainPage.checkVisibility(mainPage.logo);
//        });

        step("Checking text on menu items", () -> {
                    mainPage.checkElementText(mainPage.menuItemForYou, "Для вас");
                    mainPage.checkElementText(mainPage.menuItemForBusiness, "Для бизнеса");
                    mainPage.checkElementText(mainPage.menuItemPremium, "Премиум");
        });
            step("Checking text on getting card button", () -> {
            mainPage.checkElementText(mainPage.getCardButton, "Оформить карту");
        });


        step("Checking links on panel slide items", () -> {
            mainPage.checkElementAttribute(mainPage.panelSlideDebitCards, "href", mainPage.panelSlideDebitCardsLink);
            mainPage.checkElementAttribute(mainPage.panelSlideCreditCards, "href",mainPage.panelSlideCreditCardsLink);
            mainPage.checkElementAttribute(mainPage.panelSlideCredits,"href", mainPage.panelSlideCreditsLink);

        });

        step("Checking header with card name", () -> {
            mainPage.checkElementText(mainPage.cardNameHeader, mainPage.headerText);
        });

        step("Checking text on getting card button", () -> {
            mainPage.checkElementText(mainPage.getCardButton, "Оформить карту");
        });

    }
}
