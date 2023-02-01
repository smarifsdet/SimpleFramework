package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ContentPage {
	public ContentPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//span[. ='New Project']")
	public WebElement newProjectButton;
	
	@FindBy (xpath = "//span[. ='New RStudio Project']")
	public WebElement newRStudioProjectButton;
	
	@FindBy (xpath = "(//div[. ='Console'])[1]")
	public WebElement consoleForIDE ;
	
	@FindBy (id = "rstudio_label_file_menu")
	public WebElement fileMenuForIDE ;
	
	@FindBy (tagName = "iframe")
	public WebElement iframe ;
}
