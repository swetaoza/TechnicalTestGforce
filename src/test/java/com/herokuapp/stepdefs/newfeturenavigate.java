package com.herokuapp.stepdefs;

import com.herokuapp.pages.ComputersPage;
import com.herokuapp.pages.NewFeaturePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class newfeturenavigate {
    @Given("^I am already on the database application$")
    public void iAmAlreadyOnTheDatabaseApplication() {

    }

    @And("^the link to the new section is present$")
    public void theLinkToTheNewSectionIsPresent() {
        Assert.assertEquals("Add a new computer",new ComputersPage().getAddNewCustomerButtonVerFyIngText());
    }

    @When("^I click on the link$")
    public void iClickOnTheLink() {
        new ComputersPage().clickOnAddNewCustomerButton();
    }

    @Then("^I should be taken to the new section to update the database$")
    public void iShouldBeTakenToTheNewSectionToUpdateTheDatabase() {

    }

    @And("^The new section should have a heading of Add a New Computer$")
    public void theNewSectionShouldHaveAHeadingOfAddANewComputer() {
        Assert.assertEquals("Add a computer",new NewFeaturePage().getNewFeTuReVerIFyIngText());

    }
}
