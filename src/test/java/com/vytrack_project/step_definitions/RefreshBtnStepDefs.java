package com.vytrack_project.step_definitions;

import com.vytrack_project.pages.VyTrackExportGridPage;
import com.vytrack_project.vytrack_utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RefreshBtnStepDefs {

    VyTrackExportGridPage vyTrackExportGridPage = new VyTrackExportGridPage();
   WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
   Actions actions = new Actions(Driver.getDriver());

    @When("user clicks on refresh button")
    public void user_clicks_on_refresh_button() {
       wait.until(ExpectedConditions.elementToBeClickable(vyTrackExportGridPage.refreshBtn));
       actions.click(vyTrackExportGridPage.refreshBtn);
    }
    @Then("user should be able to see the same Vehicles page")
    public void user_should_be_able_to_see_the_same_vehicles_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Car - Entities - System"));
    }

}
