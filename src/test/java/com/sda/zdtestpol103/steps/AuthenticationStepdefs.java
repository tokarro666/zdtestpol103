package com.sda.zdtestpol103.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepdefs {
    @Given("Home page is opened")
    public void homePageIsOpened() {
    }

    @When("I click Sign in link in top menu")
    public void iClickSignInLinkInTopMenu() {
    }

    @And("I fill login field {string}")
    public void iFillLoginField(String emailAddress) {
    }

    @And("I fill password field {string}")
    public void iFillPasswordField(String password) {
    }

    @And("I click Sign in button")
    public void iClickSignInButton() {
    }

    @Then("I can see page for authenticated users")
    public void iCanSeePageForAuthenticatedUsers() {
    }

    @Then("Error message is presented {string}")
    public void errorMessageIsPresented(String errorMessage) {
    }
}
