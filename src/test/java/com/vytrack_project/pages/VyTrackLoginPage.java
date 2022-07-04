package com.vytrack_project.pages;

import com.vytrack_project.vytrack_utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(name = "_username")
    public WebElement userName;

    @FindBy(name = "_password")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

}
