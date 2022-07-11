package com.vytrack_project.step_definitions;

import com.vytrack_project.pages.VyTrackExportGridPage;
import com.vytrack_project.pages.VyTrackLoginPage;
import com.vytrack_project.vytrack_utilities.ConfigurationReader;
import com.vytrack_project.vytrack_utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Map;

public class ClickExportGridStepDefs {

    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
    VyTrackExportGridPage vyTrackExportGridPage = new VyTrackExportGridPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    int winHeight, winWidth, xPos, yPos;

    @Given("{string} is on Vehicles page")
    public void isOnVehiclesPage(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        vyTrackLoginPage.login(user);
        vyTrackExportGridPage.fleetModule.click();
        vyTrackExportGridPage.vehicleModule.click();

    }

    @When("user clicks on Export Grid dropdown")
    public void user_clicks_on_export_grid_dropdown() {
        WebElement loader = Driver.getDriver().findElement(By.cssSelector("div[class='loader-mask shown']"));
        wait.until(ExpectedConditions.invisibilityOf(loader));
        vyTrackExportGridPage.exportGridDropdown.click();
        wait.until(ExpectedConditions.invisibilityOf(loader));

    }
    @Then("user should be able to see CSV and XLSX")
    public void user_should_be_able_to_see_csv_and_xlsx() {

        Assert.assertEquals("CSV", vyTrackExportGridPage.CSVGrid.getText());
        Assert.assertEquals("XLSX", vyTrackExportGridPage.XLSXGrid.getText());
    }

    @When("user looks for Export Grid dropdown")
    public void userLooksForExportGridDropdown() {
        int winHeight = Driver.getDriver().manage().window().getSize().getHeight();
        int winWidth = Driver.getDriver().manage().window().getSize().getWidth();
        int xPos = vyTrackExportGridPage.exportGridDropdown.getLocation().getX();
        int yPos = vyTrackExportGridPage.exportGridDropdown.getLocation().getY();

    }
    @Then("user should be able to see Export Grid dropdown on the left of the page")
    public void userShouldBeAbleToSeeExportGridDropdownOnTheLeftOfThePage() {
        Assert.assertTrue(xPos <= winWidth/2 && yPos <= winHeight/2);
    }
}
