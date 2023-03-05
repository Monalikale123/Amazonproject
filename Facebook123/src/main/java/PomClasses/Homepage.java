package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
//	@FindBy(xpath = "//input[@type='text']")
//	private WebElement serach ;
//	
	@FindBy (xpath = " //input[@id='twotabsearchtextbox']")
	private WebElement searchField;
	
	@FindBy (xpath = " //input[@id='nav-search-submit-button']")
	private WebElement searchClick;
	
	@FindBy(xpath = "(//i[@class='a-icon a-icon-checkbox'])[1]")
	private WebElement redmiMblSelect ;
	
	
	public Homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendSearchField()
	{
		searchField.sendKeys("Mobiles");
	}
	
	public void clickOnSearchClick()
	{
		searchClick.click();
	}
	
	
	
//	public void redmiCheckBox(){
//		redmiMblSelect.click();
//	}
	
	
}
