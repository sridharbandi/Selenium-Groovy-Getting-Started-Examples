package com.tech.selenium.driverutil

import com.codeborne.selenide.Configuration
import io.github.bonigarcia.wdm.WebDriverManager
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.edge.EdgeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.opera.OperaDriver

import java.util.concurrent.TimeUnit

/**
 * Created by Sridhar Bandi on 04/07/19.
 */
class DriverFactory {

    def static setBrowser() {


        def browserName = System.getProperty("browser", DriverType.CHROME.toString()).toUpperCase()
        def driverType = DriverType.valueOf(browserName)

        switch (driverType) {
            case DriverType.CHROME:
                System.setProperty("selenide.browser", "chrome");
                break
            case DriverType.FIREFOX:
                System.setProperty("selenide.browser", "firefox");
                break;
            case DriverType.EDGE:
                System.setProperty("selenide.browser", "edge");
                break;
            case DriverType.IE:
                System.setProperty("selenide.browser", "ie");
                break;
            case DriverType.OPERA:
                System.setProperty("selenide.browser", "opera");
                break;
            default:
                System.setProperty("selenide.browser", "chrome");
                break;
        }
        Configuration.startMaximized = true;
        Configuration.timeout = 60000;
    }

}