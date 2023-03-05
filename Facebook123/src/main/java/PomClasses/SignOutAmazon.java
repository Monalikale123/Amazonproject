package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutAmazon {
	
	@FindBy (xpath ="//span[text()='Account & Lists']")
	private WebElement accAndList;
	
	@FindBy (xpath =" //span[text()='Sign Out']")
	private WebElement signOut;
	
	private WebDriver driver;
	
	//Constructor
	//private WebDriver driver;
	public SignOutAmazon (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Methods
	

	public void clickOnSignOut()
	{
		Actions act = new Actions(driver);
	    act.moveToElement(accAndList).perform();
		act.moveToElement(signOut).click().build().perform();
	
	}

}
