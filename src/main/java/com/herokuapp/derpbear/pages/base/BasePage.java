package com.herokuapp.derpbear.pages.base;

import org.apache.log4j.Logger;

/**
 * Created by Vlad on 12.02.14.
 */
public abstract class BasePage implements IPage {
    protected EnvironmentConfiguration configuration;
    protected Logger l = Logger.getLogger(BasePage.class);

    public BasePage (EnvironmentConfiguration configuration){
        if (configuration == null){
            throw new IllegalArgumentException("configuration is null");
        }
        this.configuration = configuration;
    }
    public IPage open() {
        com.codeborne.selenide.Selenide.open(configuration.getApplicationUrl());
        return this;
    }
    public IPage close() {
        configuration.getWebDriver().close();
        return null;
    }

}
