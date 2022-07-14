package com.vytrack_project.step_definitions;

import com.vytrack_project.pages.VyTrackExportGridPage;
import com.vytrack_project.pages.VyTrackLoginPage;
import com.vytrack_project.vytrack_utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResetBtnStepDefs {

    VyTrackExportGridPage vyTrackExportGridPage = new VyTrackExportGridPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @When("user clicks on reset button")
    public void user_clicks_on_reset_button() throws InterruptedException {
       // Actions actions = new Actions(Driver.getDriver());
        Thread.sleep(2000);
        vyTrackExportGridPage.resetBtn.click();
        wait.until(ExpectedConditions.elementToBeClickable(vyTrackExportGridPage.resetBtn));
        Thread.sleep(2000);

    }
    @Then("user should be able to reset the page to current one")
    public void user_should_be_able_to_reset_the_page_to_current_one() {
        Assert.assertEquals("Car - Entities - System - Car - Entities - System", Driver.getDriver().getTitle());
    }

}
