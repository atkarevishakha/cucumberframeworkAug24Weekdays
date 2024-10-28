package com.vtiger.pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    public static WebDriver driver;
    public static LoginPage lp;
    public static HomePage hp;
    public static LeadPage ldp;
    public static AccountPage ap;
    public static HeaderPage hdp;
    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest logger;

    public LoginPage getLoginPage()
    {
       return lp = (lp == null) ? new LoginPage(driver, logger) : lp;
    }

    public HeaderPage getHeaderPage()
    {
        return hdp = (hdp == null) ? new HeaderPage(driver, logger) : hdp;
    }

    public void getHomePage()
    {
       // return hp = (hp == null) ? new HomePage(driver, logger) : hp;
    }

    public LeadPage getLeadPage()
    {
        return ldp = (ldp == null) ? new LeadPage(driver, logger) : ldp;
    }

    public AccountPage getAccountPage()
    {
        return ap = (ap == null) ? new AccountPage(driver, logger) : ap;
    }

}
