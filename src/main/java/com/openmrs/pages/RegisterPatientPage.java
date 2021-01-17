package com.openmrs.pages;

import com.openmrs.base.BasePage;
import com.openmrs.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPatientPage extends BasePage {
    private WebDriver driver;
    private ElementUtil elementUtil;

    public RegisterPatientPage(WebDriver driver) {
        this.driver=driver;
        elementUtil=new ElementUtil(driver);
    }

    private By registerPatient=By.linkText("Register a patient");
    private By nextBtn=By.id("next-button");
    private By givenName=By.name("givenName");
    private By familyName=By.name("familyName");
    private By gender=By.name("gender");
    private By birthDateDay=By.name("birthdateDay");
    private By birthDateMonth=By.name("birthdateMonth");
    private By birthDateYear=By.name("birthdateYear");
    private By address=By.id("address1");
    private By city=By.id("cityVillage");
    private By state=By.id("stateProvince");
    private By country=By.id("country");
    private By zipCode=By.id("postalCode");
    private By phoneNumber=By.name("phoneNumber");
    private By relationship=By.id("relationship_type");
    private By relatedPerson=By.xpath("//input[@placeholder='Person Name']");
    private By submitBtn=By.id("submit");

    public PatientPage registerNewPatient(String gName,String fName,String gender,String day,String month,
                                          String year,String address, String city, String state,String country,String zip,
                                          String phone,String relation,String person) throws InterruptedException {
        elementUtil.doClick(registerPatient);
        Thread.sleep(2000);
        elementUtil.doSendKeys(givenName,gName);
        elementUtil.doSendKeys(familyName,fName);
        elementUtil.doClick(nextBtn);
        Thread.sleep(2000);
        elementUtil.selectDropDown(driver.findElement(this.gender),gender);
        elementUtil.doClick(nextBtn);
        elementUtil.doSendKeys(birthDateDay,day);
        elementUtil.doSendKeys(birthDateMonth,month);
        elementUtil.doSendKeys(birthDateYear,year);
        elementUtil.doClick(nextBtn);
        Thread.sleep(2000);
        elementUtil.doSendKeys(this.address,address);
        elementUtil.doSendKeys(this.city,city);
        elementUtil.doSendKeys(this.state,state);
        elementUtil.doSendKeys(this.country,country);
        elementUtil.doSendKeys(zipCode,zip);
        elementUtil.doClick(nextBtn);
        Thread.sleep(2000);
        elementUtil.doSendKeys(phoneNumber,phone);
        elementUtil.doClick(nextBtn);
        elementUtil.doSendKeys(relationship,relation);
        elementUtil.doSendKeys(relatedPerson,person);
        elementUtil.doClick(nextBtn);
        Thread.sleep(2000);
        elementUtil.doClick(submitBtn);

        return new PatientPage(driver);
    }




}
