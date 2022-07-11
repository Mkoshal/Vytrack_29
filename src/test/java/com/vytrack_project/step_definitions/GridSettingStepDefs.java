package com.vytrack_project.step_definitions;

import com.vytrack_project.pages.VyTrackExportGridPage;
import com.vytrack_project.pages.VyTrackLoginPage;
import com.vytrack_project.vytrack_utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GridSettingStepDefs {


    VyTrackExportGridPage vyTrackExportGridPage = new VyTrackExportGridPage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("user clicks on Grid settings button")
    public void user_clicks_on_grid_settings_button() {
        wait.until(ExpectedConditions.elementToBeClickable(vyTrackExportGridPage.gridSettings));
        actions.click(vyTrackExportGridPage.gridSettings);

    }
    @Then("user should be able to see Grid Setting dropdown")
    public void user_should_be_able_to_see_grid_setting_dropdown() {

       // Assert.assertEquals("Grid Settings", vyTrackExportGridPage.gridSettingsDropdown.getText());

    }





}
