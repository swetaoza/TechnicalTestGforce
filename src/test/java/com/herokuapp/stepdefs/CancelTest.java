package com.herokuapp.stepdefs;

import com.herokuapp.pages.ComputersPage;
import com.herokuapp.pages.NewFeaturePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class CancelTest {
    @Given("^I am already entering a new computer into the system$")
    public void iAmAlreadyEnteringANewComputerIntoTheSystem() {
        new ComputersPage().clickOnAddNewCustomerButton();
        new NewFeaturePage().seNdTextToComputerField("hp");
    }

    @But("^I need to stop what I am doing and go back to the main view$")
    public void iNeedToStopWhatIAmDoingAndGoBackToTheMainView() {
    }

    @When("^I click cancel$")
    public void iClickCancel() {
        new NewFeaturePage().cliCkOnCaNceLButtOn();
    }

    @Then("^It should take me back to the main computer database view$")
    public void itShouldTakeMeBackToTheMainComputerDatabaseView() {
        Assert.assertEquals("Add a new computer",new ComputersPage().getAddNewCustomerButtonVerFyIngText());
    }

    @When("^I Enter Introduced date \"([^\"]*)\"$")
    public void iEnterIntroducedDate(String IdAte)  {
        new NewFeaturePage().seNdDaTeToInTrOduCEDateFieldS(IdAte);

    }

    @And("^I Enter DiscontinueDate \"([^\"]*)\"$")
    public void iEnterDiscontinueDate(String dIssMIssDate)  {
        new NewFeaturePage().seNdDaTeToDisCoNtiNueDateField(dIssMIssDate);
    }

    @And("^I select company \"([^\"]*)\"$")
    public void iSelectCompany(String CoMPaNyNAme)  {
        new NewFeaturePage().sEleCTFromComPaNy(CoMPaNyNAme);
    }

    @When("^I Enter Computer name \"([^\"]*)\" in computer name field$")
    public void iEnterComputerNameInComputerNameField(String cName)  {
       new NewFeaturePage().seNdTextToComputerField(cName);
    }
}
