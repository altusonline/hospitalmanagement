package com.openmrs.pages;

import com.openmrs.base.BasePage;
import com.openmrs.utils.ElementUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class LoginPage extends BasePage {
    private WebDriver driver;
    private ElementUtil elementUtil;

    private By username=By.id("username");
    private By password=By.id("password");
    private By loginPageLogo=By.className("logo");
    private By locationList=By.xpath("//ul[@id='sessionLocation']/descendant::li");
    private By loginBtn=By.id("loginButton");
    private By sessionLocationError=By.id("sessionLocationError");
    private By cantLogin=By.id("cantLogin");
    private By cantLoginPopup=By.xpath("//div[@class='dialog-content']/p");
    private By loginErrorMsg=By.id("error-message");
    private By inpatientWard=By.id("Inpatient Ward");

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        elementUtil=new ElementUtil(driver);
    }
    public boolean verifyLogo() {
        return elementUtil.doIsDisplayed(loginPageLogo);
    }
    public String getPageTitle() {
        return driver.getTitle();
    }
    public List<String> verifyLocations() {
        List<String> locationsList=new ArrayList<String>();
        List<WebElement> locationListElements=elementUtil.getElements(locationList);
        for (WebElement e:locationListElements) {
            locationsList.add(e.getText());
        }
        return locationsList;
    }
    public boolean verifyLoginBtnEnabled() {
        return elementUtil.doIsEnabled(loginBtn);
    }
    public boolean verifyCantLoginLink() {
        return elementUtil.doIsDisplayed(cantLogin);
    }
    public String verifyCantLoginPopup() throws InterruptedException {
        elementUtil.doClick(cantLogin);
        return elementUtil.doGetText(cantLoginPopup);
    }
    public String verifyLoginMsgWithoutCred() {
        elementUtil.doClick(loginBtn);
        return elementUtil.doGetText(sessionLocationError);
    }
    public String verifyLoginMsgWithLocationWithoutCred() {
        elementUtil.doClick(inpatientWard);
        elementUtil.doClick(loginBtn);
        return elementUtil.doGetText(loginErrorMsg);
    }
    public AdminDashBoardPage verifyLoginFunction(String userName,String passWord)  {
        try {
        elementUtil.doSendKeys(username,userName);
        elementUtil.doSendKeys(password,passWord);
        elementUtil.doClick(inpatientWard);
        elementUtil.doClick(loginBtn);
        Thread.sleep(2000);
        } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return new AdminDashBoardPage(driver);
    }


}
