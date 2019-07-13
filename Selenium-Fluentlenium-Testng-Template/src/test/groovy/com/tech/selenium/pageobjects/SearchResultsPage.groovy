package com.tech.selenium.pageobjects

import org.fluentlenium.core.FluentPage
import org.fluentlenium.core.domain.FluentWebElement
import org.openqa.selenium.support.FindBy

/**
 * Created by Sridhar Bandi on 13/07/19.
 */
class SearchResultsPage extends FluentPage {

    @FindBy(partialLinkText  = "Selenium - Web Browser Automation")
    FluentWebElement lnkSelenium

    def seleniumPresent(){
        await().untilPage().isLoaded();
        return lnkSelenium.displayed();
    }
}