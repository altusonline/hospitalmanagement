package com.openmrs.tests;

import com.openmrs.base.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPatientPageTest extends BaseTest {
    @BeforeClass
    public void registerPatientPageSetup() throws InterruptedException {
        adminDashBoardPage=loginPage.verifyLoginFunction(prop.getProperty("username"),prop.getProperty("password"));
    }
    @Test
    public void registerNewPatientTest(String gName,String fName,String gender,String day,String month,
                                       String year,String address, String city, String state,String country,String zip,
                                       String phone,String relation,String person) throws InterruptedException {
        registerPatientPage.registerNewPatient(gName,fName,gender,day,month,year,address,city,state,country,zip,phone,relation,person);

    }
   /* public Object[][] getPatientData() {
        //Object data[][] =
    }*/
}
