package com.tech.selenium.driverutil

import io.github.bonigarcia.wdm.WebDriverManager
import net.thucydides.core.webdriver.DriverSource
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.opera.OperaDriver

import java.util.concurrent.TimeUnit

/**
 * Created by Sridhar Bandi on 03/07/19.
 */
class DriverFactory implements DriverSource {

    @Override
    WebDriver newDriver() {
        def driver
        def browserName = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase()
        def driverType = DriverType.valueOf(browserName)

        switch (driverType) {
            case DriverType.CHROME:
                WebDriverManager.chromedriver().setup()
                driver = new ChromeDriver()
                break
            case DriverType.FIREFOX:
                WebDriverManager.firefoxdriver().setup()
                driver = new FirefoxDriver()
                break
            case DriverType.EDGE:
                WebDriverManager.edgedriver().setup()
                driver = new EdgeDriver()
                break
            case DriverType.IE:
                WebDriverManager.iedriver().setup()
                driver = new InternetExplorerDriver()
                break
            case DriverType.OPERA:
                WebDriverManager.operadriver().setup()
                driver = new OperaDriver()
                break
            default:
                WebDriverManager.chromedriver().setup()
                driver = new ChromeDriver()
                break
        }
        driver.manage().window().maximize()
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS)
        return driver
    }

    @Override
    boolean takesScreenshots() {
        return true
    }
}