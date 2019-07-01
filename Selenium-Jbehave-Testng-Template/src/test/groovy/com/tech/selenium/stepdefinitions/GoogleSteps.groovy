package com.tech.selenium.stepdefinitions

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.jbehave.core.annotations.*
import org.junit.Assert
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 01/07/19.
 */
class GoogleSteps {

    WebDriver browser
    GoogleSearchPage googleSearchPage
    SearchResultsPage searchResultsPage

    @BeforeScenario
    def setUp() {
        browser = DriverFactory.driver
        googleSearchPage = new GoogleSearchPage(browser)
        searchResultsPage = new SearchResultsPage(browser)
    }

    @Given("User is on Google search page")
    def userOnGooglePage() {
        googleSearchPage.openURL()
    }

    @When("User searches for Selenium")
    def userSearches() {
        googleSearchPage.searchFor("Selenium")
    }

    @Then("User can see Selenium results")
    def userSeesResults() {
        Assert.assertTrue(searchResultsPage.seleniumPresent())
    }

    @AfterScenario
    def tearDown() {
        browser.quit()
    }
}
