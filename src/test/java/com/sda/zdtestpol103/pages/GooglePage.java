package com.sda.zdtestpol103.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GooglePage extends BasePage {

    private static String GOOGLE_URL = "https://www.google.com";

    @FindBy(how = How.ID, using = "L2AGLb")
    WebElement agreeAllButton;

    @FindBy(how = How.NAME, using = "q")
    WebElement searchField;

    @FindBy(how = How.ID, using = "rcnt")
    WebElement searchResults;

    public void openGooglePage(){
        driver.get(GOOGLE_URL);

    }

    public void clickAcceptAllButton(){
        agreeAllButton.click();
    }

    public void searchInGoogle(String searchPhrase){
        searchField.sendKeys(searchPhrase);
        searchField.sendKeys(Keys.ENTER);
    }

    public void verifyThatSearchResultsAreVisible(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(searchResults));
    }

}
