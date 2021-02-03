package com.herokuapp.pages;

import com.herokuapp.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewFeaturePage extends Utility {

    //---this is newely added feature class it contains all new developed feature

    //---*---WebElements---*---

    @FindBy(xpath = "//h1[contains(text(),'Add a computer')]")
    WebElement _newPageVeriFyIngText;
    @FindBy(xpath = "//input[@id='name']")
    WebElement _CompUTERInputField;
    @FindBy(xpath = "//input[@id='introduced']")
    WebElement _inTroDuCeDate;
    @FindBy(xpath = "//input[@id='discontinued']")
    WebElement _dIScoNtiNueDAte;
    @FindBy(xpath = "//select[@id='company']")
    WebElement _CompanyDroPDoWnBoX;
    @FindBy(xpath = "//body/section[@id='main']/form[1]/div[1]/input[1]")
    WebElement _cReAteThisComPutErButton;
    @FindBy(xpath = "//a[contains(text(),'Cancel')]")
    WebElement _cAnCeLBuTTon;


    //---------Mehtods -----//

    //--this method will return navigated page verifying text
    public String getNewFeTuReVerIFyIngText(){
        return getTextFromElement(_newPageVeriFyIngText);
    }

    //--this method will enter computer name to computer text field
    public void seNdTextToComputerField(String ComPUteRNAme){
        sendTextToElement(_CompUTERInputField,ComPUteRNAme);
    }

    //--this method will enter Introduce date to introduced date field
    public void seNdDaTeToInTrOduCEDateFieldS(String date){
        sendTextToElement(_inTroDuCeDate,date);
    }

    //--this method will enter Discontinue date to Discontinue date field
    public void seNdDaTeToDisCoNtiNueDateField(String DisConTiNueDate){
        sendTextToElement(_dIScoNtiNueDAte,DisConTiNueDate);
    }

    //---this method will select option from dropdown box of select company --//
    public void sEleCTFromComPaNy(String droPDownItemList){
        selectByVisibleTextFromDropDown(_CompanyDroPDoWnBoX,droPDownItemList);
    }

    //---this method will click on Create New Computer Link
    public void cLiCKOnNewComPutErButtON(){
        clickOnElement(_cReAteThisComPutErButton);
    }

    //----this method will cancel created computer
    public void cliCkOnCaNceLButtOn(){
        clickOnElement(_cAnCeLBuTTon);
    }


}
