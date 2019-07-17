package com.tech.selenium.tests

import com.tech.selenium.pageobjects.GoogleSearchPage
import com.tech.selenium.pageobjects.SearchResultsPage
import geb.testng.GebTestTrait
import org.testng.annotations.Test

/**
 * Created by Sridhar Bandi on 17/07/19.
 */
class RunTest implements GebTestTrait {

    @Test
    void exampleTest() {
        to GoogleSearchPage
        searchFor("Selenium")
        at SearchResultsPage
        assert linkSelenium.displayed
    }
}
