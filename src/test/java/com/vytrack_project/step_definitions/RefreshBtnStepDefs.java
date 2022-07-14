package com.vytrack_project.step_definitions;

import com.vytrack_project.pages.VyTrackExportGridPage;
import com.vytrack_project.vytrack_utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefreshBtnStepDefs {

    VyTrackExportGridPage vyTrackExportGridPage = new VyTrackExportGridPage();
   WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);


    @When("user clicks on refresh button")
    public void user_clicks_on_refresh_button() {
       wait.until(ExpectedConditions.elementToBeClickable(vyTrackExportGridPage.refreshBtn));
        vyTrackExportGridPage.refreshBtn.click();
    }
    @When("user clicks reset button")
    public void user_clicks_reset_button() {
        wait.until(ExpectedConditions.elementToBeClickable(vyTrackExportGridPage.resetBtn));
        vyTrackExportGridPage.resetBtn.click();
    }
    @Then("user should be able to see Cars page header")
    public void user_should_be_able_to_see_cars_page_header() {
        wait.until(ExpectedConditions.visibilityOf(vyTrackExportGridPage.carsTitle));
        Assert.assertTrue(vyTrackExportGridPage.carsTitle.getText().contains("Cars"));
    }

}
