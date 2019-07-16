package com.tech.selenium.tests

import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import geb.junit4.GebReportingTest
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

/**
 * Created by Sridhar Bandi on 16/07/19.
 */
@RunWith(JUnit4)
class RunTest extends GebReportingTest {

    @Test
    void exampleTest() {
        to GoogleSearchPage
        searchFor("Selenium")
        at SearchResultsPage
        assert linkSelenium.displayed
    }
}
