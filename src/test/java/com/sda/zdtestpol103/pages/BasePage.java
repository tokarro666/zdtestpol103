package com.sda.zdtestpol103.pages;

import com.sda.zdtestpol103.WebDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public final RemoteWebDriver driver;

    public BasePage() {
        this.driver = WebDriverManager.DRIVER;
        PageFactory.initElements(this.driver, this);
    }

}