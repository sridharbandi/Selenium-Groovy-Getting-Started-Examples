package com.tech.selenium.pageobjects

import org.junit.Assert
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class SearchResultsPage {

    WebDriver driver

    @FindBy(partialLinkText  = "Selenium - Web Browser Automation")
    WebElement lnkSelenium

    SearchResultsPage(driver) {
        this.driver = driver
        PageFactory.initElements(driver, this)
    }

    def assertSeleniumPresent(){
        Assert.assertTrue(lnkSelenium.isDisplayed())
    }
}