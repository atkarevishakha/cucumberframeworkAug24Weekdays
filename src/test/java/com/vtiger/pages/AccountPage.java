package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends HeaderPage{

    public AccountPage(WebDriver driver, ExtentTest logger) {
        super(driver,logger);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='accountname']")
    WebElement tb_accountname;

    @FindBy(name = "button")
    WebElement btn_save;

    public void createAccount(String acc)
    {
        SetAccountName(acc);
        clickSave();
    }

    public void SetAccountName(String acc)
    {
        SetInput(tb_accountname,acc,acc+" has been entered successfully into account name field");
    }

    public void clickSave()
    {
        ClickElement(btn_save,"Save button clicked");
    }
}
