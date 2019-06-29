package com.tech.selenium.stepdefinitions

import com.tech.selenium.driverutil.DriverFactory
import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import org.jbehave.core.annotations.AfterScenario
import org.jbehave.core.annotations.BeforeScenario
import org.jbehave.core.annotations.Given
import org.jbehave.core.annotations.Then
import org.jbehave.core.annotations.When
import org.junit.Assert
import org.openqa.selenium.WebDriver

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
