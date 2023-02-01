package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.ContentPage;
import pages.LogInPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class StepdefinitionIdeLoading {
	
	LogInPage lp = new LogInPage();
	ContentPage cp = new ContentPage();
 
	@Given("user logged in to the application")
	public void user_logged_in_to_the_application() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		lp.menuLogInButton.click();
		lp.userEmailField.sendKeys(ConfigReader.getProperty("userEmail"));
		lp.continueButton.click();
		BrowserUtils.waitForVisibility(lp.passwordField, 20);
		lp.passwordField.sendKeys(ConfigReader.getProperty("password"));
		lp.logInButton.click();
	    
	}

	@When("user clicks New Project button and again clicks New RStudio Project tab")
	public void user_clicks_new_project_button_and_again_clicks_new_r_studio_project_tab() {
	    cp.newProjectButton.click();
	    cp.newRStudioProjectButton.click();
	}

	
	@Then("user should see an IDE loaded successfully")
	public void user_should_see_an_ide_loaded_successfully() {
		BrowserUtils.waitForVisibility(cp.iframe, 30);
		Driver.getDriver().switchTo().frame(0);
		boolean ideVisible = cp.fileMenuForIDE.isDisplayed();
        Assert.assertTrue(ideVisible);
	}
             
}