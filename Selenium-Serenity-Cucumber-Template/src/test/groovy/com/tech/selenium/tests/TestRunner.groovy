package com.tech.selenium.tests

import cucumber.api.CucumberOptions
import net.serenitybdd.cucumber.CucumberWithSerenity
import org.junit.runner.RunWith

@RunWith(CucumberWithSerenity)
@CucumberOptions(features = ["classpath:features/Google.feature"],
        glue = ["com.tech.selenium.stepdefinitions"])
class TestRunner {

}
