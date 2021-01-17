package com.openmrs.utils;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static final String LOGIN_PAGE_TITLE="Login";
    public static final String DASHBOARD_PAGE_TITLE="Home";
    public static final String CANT_LOGIN_POPUP_MSG="Please contact your System Administrator.";
    public static final String MSG_LOGIN_WITHOUT_CRED="You must choose a location!";
    public static final String MSG_LOGIN_WITHOUT_CRED_WITH_LOCATION="Invalid username/password. Please try again.";
    public static final List<String> getLocationList() {
        List<String> list=new ArrayList<String>();
        list.add("Inpatient Ward");
        list.add("Isolation Ward");
        list.add("Laboratory");
        list.add("Outpatient Clinic");
        list.add("Pharmacy");
        list.add("Registration Desk");
        return list;
    }
    public static final List<String> getApps() {
        List<String> apps =new ArrayList<String>();
        apps.add("Find Patient Record");
        apps.add("Active Visits");
        apps.add("Register a patient");
        apps.add("Capture Vitals");
        apps.add("Appointment Scheduling");
        apps.add("Reports");
        apps.add("Data Management");
        apps.add("Configure Metadata");
        apps.add("System Administration");
        return apps;
    }
}
