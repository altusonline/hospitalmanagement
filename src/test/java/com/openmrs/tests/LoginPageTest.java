package com.openmrs.tests;

import com.openmrs.base.BaseTest;
import com.openmrs.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    @Test(priority = 1)
    public void verifyLogoTest() throws InterruptedException {
        Thread.sleep(3000);
       boolean logo=loginPage.verifyLogo();
        Assert.assertTrue(logo);
    }
    @Test(priority = 2)
    public void verifyPageTitleTest() {
        String pageTitle=loginPage.getPageTitle();
        Assert.assertEquals(pageTitle, Constants.LOGIN_PAGE_TITLE);
    }
    @Test(priority = 3)
    public void verifyLocationListTest() {
        Assert.assertEquals(loginPage.verifyLocations(),Constants.getLocationList());
    }
    @Test(priority = 4)
    public void verifyLoginBtnStatusTest() {
        boolean loginBtnStatus=loginPage.verifyLoginBtnEnabled();
        Assert.assertTrue(loginBtnStatus);
    }
    @Test(priority = 5)
    public void verifyCantLoginLinkTest() {
        boolean cantLoginLink=loginPage.verifyCantLoginLink();
        Assert.assertTrue(cantLoginLink);
    }
    @Test(priority = 6)
    public void verifyMsgLoginWithoutCredTest() {
        Assert.assertEquals(loginPage.verifyLoginMsgWithoutCred(),Constants.MSG_LOGIN_WITHOUT_CRED);
    }
    @Test(priority = 7)
    public void verifyMsgLoginWithoutCredWithLocTest() {
        Assert.assertEquals(loginPage.verifyLoginMsgWithLocationWithoutCred(),Constants.MSG_LOGIN_WITHOUT_CRED_WITH_LOCATION);
    }
   /* @Test(priority = 8)
    public void verifyCantLoginPopupMsgTest() throws InterruptedException {
        Assert.assertEquals(loginPage.verifyCantLoginPopup(),Constants.CANT_LOGIN_POPUP_MSG);
    }*/
    @Test(priority = 9)
    public void loginTest() {
       loginPage.verifyLoginFunction(prop.getProperty("username"),prop.getProperty("password"));
       adminDashBoardPage.printMessage();
       //String adminPageTitle = adminDashBoardPage.verifyDashBoardPageTitle();
      // System.out.println(adminPageTitle);
      // Assert.assertTrue(adminDashBoardPage.verifyLogoutLink());
       // Assert.assertEquals(adminDashBoardPage.verifyDashBoardPageTitle(),Constants.DASHBOARD_PAGE_TITLE);
    }

}
