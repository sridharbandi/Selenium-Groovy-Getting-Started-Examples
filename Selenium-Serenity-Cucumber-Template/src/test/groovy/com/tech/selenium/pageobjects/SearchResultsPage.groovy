package com.tech.selenium.pageobjects

import net.serenitybdd.core.pages.WebElementFacade
import net.thucydides.core.pages.PageObject
import org.openqa.selenium.support.FindBy

/**
 * Created by Sridhar Bandi on 03/07/19.
 */
class SearchResultsPage extends PageObject {

    @FindBy(partialLinkText  = "Selenium - Web Browser Automation")
    WebElementFacade lnkSelenium

    def seleniumPresent(){
        return lnkSelenium.isDisplayed()
    }
}