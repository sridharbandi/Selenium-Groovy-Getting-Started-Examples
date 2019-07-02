package com.tech.selenium.pageobjects

import net.serenitybdd.core.pages.WebElementFacade
import net.thucydides.core.annotations.DefaultUrl
import net.thucydides.core.pages.PageObject
import org.openqa.selenium.Keys
import org.openqa.selenium.support.FindBy

/**
 * Created by Sridhar Bandi on 02/07/19.
 */
@DefaultUrl("https://www.google.com/")
class GoogleSearchPage extends PageObject {

    @FindBy(name = "q")
    WebElementFacade searchBox

    def searchFor(searchTerm) {
        searchBox.waitUntilVisible().sendKeys(searchTerm + Keys.RETURN)
    }

}