package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LogInPage {
	public LogInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//span[. = 'Log In']")
	public WebElement menuLogInButton;
	
	@FindBy (name = "email")
	public WebElement userEmailField;
	
	@FindBy (xpath = "//button[@type='submit'][1]")
	public WebElement continueButton;
	
	@FindBy (name = "password")
	public WebElement passwordField;
	
	@FindBy (xpath = "//button[@type='submit']")
	public WebElement logInButton;
}
