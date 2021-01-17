package com.openmrs.base;

import com.openmrs.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

public class BaseTest {
    public BasePage basePage;
    public LoginPage loginPage;
    public AdminDashBoardPage adminDashBoardPage;
    public RegisterPatientPage registerPatientPage;
    public PatientPage patientPage;
    public FindPatientRecordPage findPatientRecordPage;
    public Properties prop;
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        basePage=new BasePage();
        prop=basePage.init_Prop();
        String browserType=prop.getProperty("browser");
        driver=basePage.init_Driver(browserType);
        loginPage=new LoginPage(driver);
        driver.get(prop.getProperty("url"));

    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
