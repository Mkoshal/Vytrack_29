package com.vytrack_project.step_definitions;

import com.vytrack_project.pages.VyTrackExportGridPage;
import com.vytrack_project.pages.VyTrackLoginPage;
import com.vytrack_project.vytrack_utilities.ConfigurationReader;
import com.vytrack_project.vytrack_utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class ClickExportGridStepDefs {

    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
    VyTrackExportGridPage vyTrackExportGridPage = new VyTrackExportGridPage();


    @Given("{string} is on Vehicles page")
    public void isOnVehiclesPage(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        vyTrackLoginPage.login(user);
        vyTrackExportGridPage.fleetModule.click();
        vyTrackExportGridPage.vehicleModule.click();

    }

    @When("user clicks on Export Grid dropdown")
    public void user_clicks_on_export_grid_dropdown() {
        vyTrackExportGridPage.exportGridDropdown.click();
    }

    @Then("user should be able to see CSV and XLSX")
    public void user_should_be_able_to_see_csv_and_xlsx() {

        Assert.assertEquals("CSV", vyTrackExportGridPage.CSVGrid.getText());
        Assert.assertEquals("XLSX", vyTrackExportGridPage.XLSXGrid.getText());

    }


}
