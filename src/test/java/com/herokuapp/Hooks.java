package com.herokuapp;


import com.cucumber.listener.Reporter;
import com.herokuapp.basepage.BasePage;
import com.herokuapp.propertyreader.PropertyReader;
import com.herokuapp.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


public class Hooks extends BasePage {
    //This is class responsible for opening and closing browser

    @Before
    public void openBrowser(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
   // Reporter.assignAuthor("Technical Test", "Sweta oza");

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        driver.quit();
    }
}
