package com.vtiger.pages;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends HeaderPage {

    public ContactPage(WebDriver driver, ExtentTest logger) {
        super(driver,logger);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='lastname']")
    WebElement tb_LastN;

    @FindBy(xpath = "//input[@name='firstname']")
    WebElement tb_FirstN;

    @FindBy(name = "button")
    WebElement btn_save;


    public void Create_Contact(String fname, String lname){
        set_FirstName(fname);
        set_LastName(lname);
        clickSave();

    }



    public void set_LastName(String CompName){

        SetInput(tb_LastN,CompName," Last Name is set on New Account page");
    }

    public void set_FirstName(String CompName){

        SetInput(tb_FirstN,CompName," First Name is set on New Account page");
    }

    public void clickSave(){

        ClickElement(btn_save,"Clicked on Save button on New Account page");
    }

}

