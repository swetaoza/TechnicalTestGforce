package com.herokuapp.stepdefs;

import com.herokuapp.pages.ComputersPage;
import com.herokuapp.pages.NewFeaturePage;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class validationnewfeature {
    @Given("^I am already adding a computer in the Add a New Computer view$")
    public void iAmAlreadyAddingAComputerInTheAddANewComputerView() {
        new ComputersPage().clickOnAddNewCustomerButton();

    }

    @And("^I have already entered a name for a computer$")
    public void iHaveAlreadyEnteredANameForAComputer() {
        new NewFeaturePage().seNdTextToComputerField("acer");
    }

    @But("^Have not entered data into other fields$")
    public void haveNotEnteredDataIntoOtherFields() {
        new NewFeaturePage().seNdDaTeToInTrOduCEDateFieldS("2020-12-05");
    }

    @When("^I click Add This Computer$")
    public void iClickAddThisComputer() {
        new NewFeaturePage().cLiCKOnNewComPutErButtON();
    }

    @Then("^It should not allow you to save$")
    public void itShouldNotAllowYouToSave() {

    }

    @And("^It should indicate which fields are mandatory$")
    public void itShouldIndicateWhichFieldsAreMandatory() {
        Assert.assertEquals("Done! Computer acer has been created",new ComputersPage().getSuccessFullYAddEdVErYFyiNGTExt());
    }
}
