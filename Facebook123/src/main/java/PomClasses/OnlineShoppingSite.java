package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineShoppingSite {
	
	@FindBy (xpath = "//span[text()='Account & Lists'] ")
	private WebElement helloSingIn ;
	
	public OnlineShoppingSite(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnHelloSingIn() {
		
		helloSingIn.click();
	}

}
