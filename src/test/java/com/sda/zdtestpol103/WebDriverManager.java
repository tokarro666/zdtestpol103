package com.sda.zdtestpol103;

import com.opera.core.systems.OperaDriver;
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
            case "opera":
                DRIVER = new OperaDriver();
                break;
            default:
                throw new IllegalStateException("UNSUPPORTED BROWSER !!!!!!!!!!!!!!!");

        }
        DRIVER.manage().window().minimize();
    }

    public static void destroyDriver() {
        DRIVER.quit();
    }

    public static String getBrowserName(){
        return System.getProperty("browserName", "chrome" );
    }


}
