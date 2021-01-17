package com.openmrs.pages;

import com.openmrs.utils.ElementUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientPage {
    private WebDriver driver;
    private ElementUtil elementUtil;

    public PatientPage(WebDriver driver) {
        this.driver=driver;
        elementUtil=new ElementUtil(driver);

    }
}
