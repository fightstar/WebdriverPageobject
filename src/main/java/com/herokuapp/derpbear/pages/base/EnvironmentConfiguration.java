package com.herokuapp.derpbear.pages.base;

import org.openqa.selenium.WebDriver;

/**
 * Created by Vlad on 09.03.14.
 */
public class EnvironmentConfiguration {
    private String applicationUrl;
    private WebDriver driver;

    public WebDriver getWebDriver() {
        return driver;
    }

    public String getApplicationUrl() {
        return applicationUrl;
    }

    public EnvironmentConfiguration(String applicationUrl, WebDriver driver) {
        this.applicationUrl = applicationUrl;
        this.driver = driver;
    }
}
