package com.tech.selenium.pageobjects

import com.codeborne.selenide.SelenideElement

import static com.codeborne.selenide.Selectors.byName
import static com.codeborne.selenide.Selenide.$
import static com.codeborne.selenide.Selenide.open

/**
 * Created by Sridhar Bandi on 07/07/19.
 */
class GoogleSearchPage {

    private SelenideElement searchBox = $(byName("q"));

    void openURL(){
        open("https://www.google.com/");
    }

    void searchFor(String searchTerm){
        searchBox.val(searchTerm).pressEnter();
    }

}