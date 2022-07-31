package com.sda.zdtestpol103;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.rmi.Remote;

public class WebDriverManager {

    public static RemoteWebDriver DRIVER;

    public static void startDriver() {

        switch(getBrowserName()){
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                DRIVER = new ChromeDriver();
                break;
            case "firefox":
                DRIVER = new FirefoxDriver();
                break;
            case "safari":
                DRIVER = new SafariDriver();
                break;
            default:
                throw new IllegalStateException("UNSUPPORTED BROWSER !!!!!!!!!!!!!!!");

        }
        DRIVER.manage().window().maximize();
    }

    public static void destroyDriver() {
        DRIVER.quit();
    }

    public static String getBrowserName(){
        return System.getProperty("browserName", "chrome" );
    }


}
