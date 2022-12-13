package neostoxpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;


public class Neostoxsignuppage 
{
	@FindBy(xpath = "(//a[text()='Sign In'])[1]") private WebElement signINButton;
	public Neostoxsignuppage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void clickOnSignInButton(WebDriver driver)
	{
	UtilityNew.wait(driver, 1000);
	Reporter.log("Clicking on Sign In button", true);
	signINButton.click();
	}


}
