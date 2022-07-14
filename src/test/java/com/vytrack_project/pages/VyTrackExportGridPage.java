package com.vytrack_project.pages;

import com.vytrack_project.vytrack_utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class VyTrackExportGridPage {

    public VyTrackExportGridPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[contains(text(),'Fleet')]")
    public WebElement fleetModule;

    @FindBy(xpath = "//span[contains(text(),'Vehicles')]")
    public WebElement vehicleModule;

    @FindBy(xpath = "//div[@class='btn-group']/a[@data-toggle='dropdown']")
    public WebElement exportGridDropdown;

    @FindBy(css = "a[title='CSV']")
    public WebElement CSVGrid;

    @FindBy(css = "a[title='XLSX']")
    public WebElement XLSXGrid;

    @FindBy(xpath = "//a[@title='Refresh']/i")
    public WebElement refreshBtn;

    @FindBy(xpath = "//*[@title='Reset']")
    public WebElement resetBtn;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSettings;

    @FindBy(xpath = "//div[@class='dropdown-menu']/div[@class='column-manager-title']")
    public WebElement gridSettingsDropdown;

    @FindBy(xpath = "//div[@class='actions-panel pull-right form-horizontal']")
    public WebElement allBtn;

    @FindBy(xpath = "//div[@class='flash-messages-holder']")
    public WebElement messagePopUp;

    @FindBy(css = "h1[class='oro-subtitle']")
    public WebElement carsTitle;

    public void clickOption(String option){
        if(option.equals("CSV")){
            CSVGrid.click();
        } else {
            XLSXGrid.click();
        }
    }


}
