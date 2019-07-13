package com.tech.selenium.pageobjects

import org.fluentlenium.core.FluentPage
import org.fluentlenium.core.domain.FluentWebElement
import org.openqa.selenium.support.FindBy

/**
 * Created by Sridhar Bandi on 13/07/19.
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