package com.tech.selenium.tests

import com.tech.selenium.steps.SearchSteps
import net.serenitybdd.junit.runners.SerenityRunner
import net.thucydides.core.annotations.Managed
import net.thucydides.core.annotations.Steps
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.openqa.selenium.WebDriver

/**
 * Created by Sridhar Bandi on 02/07/19.
 */
@RunWith(SerenityRunner.class)
class RunTest {

    @Managed
    WebDriver driver;

    @Steps
    SearchSteps searchSteps;

    @Test
     void testExample(){
        searchSteps.openURL();
        searchSteps.searchFor("Selenium");
        Assert.assertTrue(searchSteps.seleniumLinkPresent());
    }
}
