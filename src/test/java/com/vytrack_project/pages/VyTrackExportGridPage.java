package com.vytrack_project.pages;

import com.vytrack_project.vytrack_utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VyTrackExportGridPage {

    public VyTrackExportGridPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public List<WebElement> allModules;

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


}
