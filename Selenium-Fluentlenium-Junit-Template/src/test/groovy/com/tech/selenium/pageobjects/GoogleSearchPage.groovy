package com.tech.selenium.pageobjects

import org.fluentlenium.core.FluentPage
import org.fluentlenium.core.domain.FluentWebElement
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

/**
 * Created by Sridhar Bandi on 12/07/19.
 */
class GoogleSearchPage extends FluentPage {

    @FindBy(name = "q")
    FluentWebElement searchBox

    def openURL() {
        goTo("https://www.google.com/")
    }

    def searchFor(searchTerm) {
        searchBox.fill().with(searchTerm);
        searchBox.submit();
    }

}