package com.herokuapp.stepdefs;

import com.herokuapp.pages.ComputersPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I open browser$")
    public void iOpenBrowser() {
    }

    @When("^I navigate to the computer database app$")
    public void iNavigateToTheComputerDatabaseApp() {

    }

    @Then("^I should see a new button called Add a New Computer$")
    public void iShouldSeeANewButtonCalledAddANewComputer() {
        Assert.assertEquals("Add a new computer",new ComputersPage().getAddNewCustomerButtonVerFyIngText());
    }
}
