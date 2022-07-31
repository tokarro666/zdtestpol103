package com.sda.zdtestpol103.steps;

import com.sda.zdtestpol103.pages.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepdefs {

    GooglePage googlePage = new GooglePage();
    @Given("Google page is opened")
    public void googlePageIsOpened() {
//        System.out.println("Google page is opened !!!!!!!!");
        googlePage.openGooglePage();
    }

    @When("I click Accept all button")
    public void iClickAcceptAllButton() {
//        System.out.println("User clicks Accept All button");
        googlePage.clickAcceptAllButton();

    }

    @And("I search for phrase {string}")
    public void iSearchForPhrase(String searchPhrase) {
//        System.out.println("This is searchPhrase: " + searchPhrase);
        googlePage.searchInGoogle(searchPhrase);
    }

    @Then("I can see search results page")
    public void iCanSeeSearchResultsPage() {
//        System.out.println("User can see search results page");
        googlePage.verifyThatSearchResultsAreVisible();
    }

    @And("I click Enter button")
    public void iClickEnterButton() {
//        System.out.println("User clicks Enter button");
    }

    @Then("Search results page is not presented")
    public void searchResultsPageIsNotPresented() {
//        System.out.println("Search results page is not presented !!!!!!!");
    }
}
