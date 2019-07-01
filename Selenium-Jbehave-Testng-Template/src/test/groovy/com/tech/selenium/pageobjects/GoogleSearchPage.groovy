package com.tech.selenium.pageobjects

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

/**
 * Created by Sridhar Bandi on 01/07/19.
 */
class GoogleSearchPage {

    WebDriver driver

    @FindBy(name = "q")
    WebElement searchBox

    GoogleSearchPage(driver) {
        this.driver = driver
        PageFactory.initElements(driver, this)
    }

    def openURL() {
        driver.get("https://www.google.com/")
    }

    def searchFor(searchTerm) {
        searchBox.sendKeys(searchTerm + Keys.RETURN)
    }

}