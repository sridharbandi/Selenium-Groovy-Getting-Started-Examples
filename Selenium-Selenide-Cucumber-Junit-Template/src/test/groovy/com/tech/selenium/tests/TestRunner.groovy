package com.tech.selenium.tests

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
 * Created by Sridhar Bandi on 08/07/19.
 */
@RunWith(Cucumber)
@CucumberOptions(features = ["classpath:features/Google.feature"],
        glue = ["com.tech.selenium.stepdefinitions"],
        plugin = ["json:target/cucumber-report.json","html:target/cucumber-html"])

public class TestRunner {

}
