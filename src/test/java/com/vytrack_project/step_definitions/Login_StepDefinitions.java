package com.vytrack_project.step_definitions;

import com.vytrack_project.pages.VyTrackLoginPage;
import com.vytrack_project.vytrack_utilities.ConfigurationReader;
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
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user enters truck driver username")
    public void user_enters_truck_driver_username() {
        //vyTrackLoginPage.userName.sendKeys("user177" + Keys.TAB);
        vyTrackLoginPage.userName.sendKeys(ConfigurationReader.getProperty("username1"));



    }
    @When("user enters truck driver password")
    public void user_enters_truck_driver_password() {
        vyTrackLoginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        vyTrackLoginPage.submit.click();


    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Dashboard", Driver.getDriver().getTitle());

    }

    @When("user enters store manager username")
    public void user_enters_store_manager_username() {
        vyTrackLoginPage.userName.sendKeys(ConfigurationReader.getProperty("username2"));
    }

    @When("user enters store manager password")
    public void user_enters_store_manager_password() {
        vyTrackLoginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        vyTrackLoginPage.submit.click();
    }

    @When("user enters sales manager username")
    public void user_enters_sales_manager_username() {
        vyTrackLoginPage.userName.sendKeys(ConfigurationReader.getProperty("username3"));
    }

    @When("user enters sales manager password")
    public void user_enters_sales_manager_password() {
        vyTrackLoginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        vyTrackLoginPage.submit.click();
    }

}
