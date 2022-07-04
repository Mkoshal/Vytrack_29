package com.vytrack_project.step_definitions;

import com.vytrack_project.pages.VyTrackLoginPage;
import com.vytrack_project.vytrack_utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login_StepDefinitions {

    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();

    @Given("user is on the vytrack login page")
    public void user_is_on_the_vytrack_login_page() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");

    }
    @When("user enters truck driver username")
    public void user_enters_truck_driver_username() {
        vyTrackLoginPage.userName.sendKeys("user177" + Keys.TAB);


    }
    @When("user enters truck driver password")
    public void user_enters_truck_driver_password() {
        vyTrackLoginPage.password.sendKeys("UserUser123" + Keys.ENTER);


    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Dashboard", Driver.getDriver().getTitle());

    }

    @When("user enters store manager username")
    public void user_enters_store_manager_username() {
        vyTrackLoginPage.userName.sendKeys("storemanager210" + Keys.TAB);
    }

    @When("user enters store manager password")
    public void user_enters_store_manager_password() {
        vyTrackLoginPage.password.sendKeys("UserUser123" + Keys.ENTER);
    }

    @When("user enters sales manager username")
    public void user_enters_sales_manager_username() {
        vyTrackLoginPage.userName.sendKeys("salesmanager273" + Keys.TAB);
    }

    @When("user enters sales manager password")
    public void user_enters_sales_manager_password() {
        vyTrackLoginPage.password.sendKeys("UserUser123" + Keys.ENTER);
    }

}
