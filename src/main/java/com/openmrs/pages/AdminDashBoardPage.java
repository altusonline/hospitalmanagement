package com.openmrs.pages;

import com.openmrs.base.BasePage;
import com.openmrs.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AdminDashBoardPage extends BasePage {
    private WebDriver driver;
    private ElementUtil elementUtil;

    private By asAdmin = By.xpath("//li[@class='nav-item identifier']");
    private By locationSelected=By.id("selected-location");
    private By appsList=By.xpath("//div[@id='apps']/descendant::a");
    private By logoutBtn=By.linkText("Logout");

    public AdminDashBoardPage(WebDriver driver) {
        this.driver=driver;
        elementUtil=new ElementUtil(driver);
        System.out.println("admindashboard constructor callad");
    }
    public String verifyLoginAsAdmin() {
        return elementUtil.doGetText(asAdmin);
    }

    public String verifyDashBoardPageTitle() {
        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        return pageTitle;
    }
    public String verifyLoginLocation() {
        return elementUtil.doGetText(locationSelected);
    }
    public List<String> verifyApps() {
        List<String> allAppsList=new ArrayList<String>();
        List<WebElement> appsElements=elementUtil.getElements(appsList);
        for(WebElement a:appsElements) {
            allAppsList.add(a.getText());
        }
        return allAppsList;
    }

    public boolean verifyLogoutLink() {
        System.out.println("log out link");
        return elementUtil.doIsDisplayed(logoutBtn);
    }
    
    public void printMessage() {
    	System.out.println("printing message from admin dash board page class");
    }

 }

