package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedmiA1_Child {
	
	@FindBy (xpath = "//input[@name='submit.add-to-cart']")
	private WebElement addToCard;
	


	//private WebDriver  driver;
	

	public  RedmiA1_Child (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//this.driver = driver;
	}
	 
	public void selectAddToCard() {
		addToCard.click();
	}
	

}
