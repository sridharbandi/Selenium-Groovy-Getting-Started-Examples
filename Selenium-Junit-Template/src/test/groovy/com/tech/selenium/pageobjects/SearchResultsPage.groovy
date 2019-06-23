package com.tech.selenium.pageobjects

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

/**
 * Created by Sridhar Bandi on 23/06/19.
 */
class SearchResultsPage {

    WebDriver driver

    @FindBy(partialLinkText  = "Selenium - Web Browser Automation")
    WebElement lnkSelenium

    SearchResultsPage(driver) {
        this.driver = driver
        PageFactory.initElements(driver, this)
    }

    def seleniumPresent(){
        return lnkSelenium.isDisplayed()
    }
}