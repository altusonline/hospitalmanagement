package com.openmrs.tests;

import com.openmrs.base.BaseTest;
import com.openmrs.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AdminDashBoardPageTest extends BaseTest {
	
    @BeforeClass
    public void adminDashBoardSetup() throws InterruptedException {
        adminDashBoardPage=loginPage.verifyLoginFunction(prop.getProperty("username"),prop.getProperty("password"));
    }
    @Test(priority = 1)
    public void verifyLoginAsAdminTest() {
        Assert.assertEquals(adminDashBoardPage.verifyLoginAsAdmin(),prop.getProperty("username"));
    }
    @Test(priority = 2)
    public void verifyLocationTest() {
        Assert.assertEquals(adminDashBoardPage.verifyLoginLocation(),prop.getProperty("location"));
    }
    @Test(priority = 3)
    public void verifyAppsTest() {
        Assert.assertEquals(adminDashBoardPage.verifyApps(), Constants.getApps());
    }
    @Test(priority = 4)
    public void verifyLogoutTest() {
        Assert.assertTrue(adminDashBoardPage.verifyLogoutLink());
    }

}
