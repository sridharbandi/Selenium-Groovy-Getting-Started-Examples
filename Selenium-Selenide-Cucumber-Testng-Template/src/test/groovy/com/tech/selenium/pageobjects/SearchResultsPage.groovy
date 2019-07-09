package com.tech.selenium.pageobjects

import com.codeborne.selenide.Condition
import com.codeborne.selenide.SelenideElement

import static com.codeborne.selenide.Selectors.byPartialLinkText
import static com.codeborne.selenide.Selenide.$

/**
 * Created by Sridhar Bandi on 09/07/19.
 */
class SearchResultsPage {

    private SelenideElement lnkSelenium = $(byPartialLinkText("Selenium - Web Browser Automation"));

    SelenideElement getLnkSelenium(){
        return lnkSelenium.waitUntil(Condition.appear, 60000);
    }
}