package com.vytrack_project.step_definitions;

import com.vytrack_project.pages.ExportGridDropdownPage2;
import com.vytrack_project.pages.VyTrackLoginPage;
import com.vytrack_project.vytrack_utilities.ConfigurationReader;
import com.vytrack_project.vytrack_utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ExportGridStepDefs2 {

    ExportGridDropdownPage2 exportGridDropdownPage2 = new ExportGridDropdownPage2();
    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();


    @Given("{string} is on Vehicles page")
    public void is_on_vehicles_page(String string) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        vyTrackLoginPage.login("user177", "UserUser123");
        exportGridDropdownPage2.fleetModule.click();
        exportGridDropdownPage2.vehicleModule.click();

    }
    @When("user clicks on Export Grid dropdown")
    public void user_clicks_on_export_grid_dropdown() {
        exportGridDropdownPage2.exportGridDropdown.click();


    }
    @Then("user is able to see Export Grid Dropdown on the left of the page")
    public void user_is_able_to_see_export_grid_dropdown_on_the_left_of_the_page() {
        Assert.assertTrue(exportGridDropdownPage2.CSVGrid.isDisplayed());
        Assert.assertTrue(exportGridDropdownPage2.XLSXGrid.isDisplayed());
    }

}
