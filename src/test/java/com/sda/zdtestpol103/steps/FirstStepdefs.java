package com.sda.zdtestpol103.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepdefs {
    @Given("This is given step")
    public void thisIsGivenStep() {
        System.out.println("We are inside Given step !!!!!!!!!!");
    }

    @When("This is when step")
    public void thisIsWhenStep() {
        System.out.println("We are inside When step !!!!!!!!!!!");
        
    }

    @Then("This is then step")
    public void thisIsThenStep() {
        System.out.println("We are inside Then step !!!!!!!!!!!");

    }
}
