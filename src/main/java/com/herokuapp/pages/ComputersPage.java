package com.herokuapp.pages;

import com.herokuapp.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends Utility {

    //--this is database application homepage/computers page

//---This class is stores WebElements Located in Computer page and method to to Implement on it

    //-*--- WebElements ---*-//

    @FindBy(xpath = "//a[@id='add']")
    WebElement _AddNewComputerButton;
    @FindBy(xpath = "//input[@id='searchbox']")
    WebElement _sEarChTexTFieLD;
    @FindBy(xpath = "//input[@id='searchsubmit']")
    WebElement _seArChByNAmeButTon;
    @FindBy(xpath = "//a[contains(text(),'← Previous')]")
    WebElement _pRevIOusButton;
    @FindBy(xpath = "//a[contains(text(),'Next →')]")
    WebElement _nExTButTon;
    @FindBy(xpath = "//a[contains(text(),'Displaying 1 to 10 of 665')]")
    WebElement _dISpLaYINgButton;
    @FindBy(xpath = "//body/section[@id='main']/div[1]")
    WebElement _sUccEssFullAddedMessAge;


    //---*---Methods---*---//



    //---This method get confirmation text in order to check that add new customer button is on page
    public String getAddNewCustomerButtonVerFyIngText() {
        return getTextFromElement(_AddNewComputerButton);
    }

    //---This method will click on add new computer button
    public void clickOnAddNewCustomerButton(){
        clickOnElement(_AddNewComputerButton);
    }

    //---This method will search computer previously added to page
    public void seArChComputerInTExtField(String seArChData) {
        sendTextToElement(_sEarChTexTFieLD, seArChData);
        clickOnElement(_seArChByNAmeButTon);
    }

    //---This method will get customer added to list successfully
    public String getSuccessFullYAddEdVErYFyiNGTExt(){
        return getTextFromElement(_sUccEssFullAddedMessAge);
    }


}
