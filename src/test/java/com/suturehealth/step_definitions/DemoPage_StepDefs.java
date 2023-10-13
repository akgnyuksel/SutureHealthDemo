package com.suturehealth.step_definitions;

import com.suturehealth.pages.DemoPage;
import com.suturehealth.utilities.BrowserUtils;
import com.suturehealth.utilities.ConfigurationReader;
import com.suturehealth.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DemoPage_StepDefs {
    private DemoPage demoPage=new DemoPage();

    @Given("User navigate to the Suture Health Demo website")
    public void user_navigate_to_the_suture_health_demo_website() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
    }
    @Given("User see the title of website")
    public void user_see_the_title_of_website() {
        BrowserUtils.waitForPageToLoad(4);
        String title=demoPage.title.getText();
        Assert.assertEquals(title,"Suture Health Demo");
    }
    @When("User click to the Get Ditto Data button")
    public void user_click_to_the_get_ditto_data_button() {
        BrowserUtils.waitForClickablity(demoPage.getDittoDataButton,3);
        demoPage.getDittoDataButton.click();
    }
    @Then("User should see limber and imposter")
    public void user_should_see_limber_and_imposter() {
        BrowserUtils.waitForVisibility(demoPage.dittoAbilitiesLimber,4);
        demoPage.dittoAbilitiesLimber.isDisplayed();
    }
}
