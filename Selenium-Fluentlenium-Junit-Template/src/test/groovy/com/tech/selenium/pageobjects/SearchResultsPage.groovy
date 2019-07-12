package com.tech.selenium.pageobjects

import org.fluentlenium.core.FluentPage
import org.fluentlenium.core.domain.FluentWebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

/**
 * Created by Sridhar Bandi on 12/07/19.
 */
class SearchResultsPage extends FluentPage {

    @FindBy(partialLinkText  = "Selenium - Web Browser Automation")
    FluentWebElement lnkSelenium

    def seleniumPresent(){
        await().untilPage().isLoaded();
        return lnkSelenium.displayed();
    }
}