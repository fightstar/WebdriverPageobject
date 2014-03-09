package com.herokuapp.derpbear.utilities;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.security.auth.login.Configuration;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vlad on 12.02.14.
 */
public class WebDriverInstance {
    private static WebDriver  webDriverInstance = Initialize();

    public static WebDriver getWebDriverInstance() {
        return webDriverInstance;
    }

    public WebDriverInstance() {
    }

    private static WebDriver Initialize() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        WebDriverRunner.setWebDriver(driver);
        com.codeborne.selenide.Configuration.timeout = 50000;
        return driver;
    }
}
