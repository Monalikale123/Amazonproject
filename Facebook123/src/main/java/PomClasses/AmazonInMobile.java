package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonInMobile {
	
	@FindBy (xpath = "(//i[@class='a-icon a-icon-checkbox'])[1]")
	private WebElement clickOnCheckBox;
	
	@FindBy(xpath ="//div[@data-index='2']//img")
	private WebElement clickOnRedmiMbl ;
	
	public AmazonInMobile (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void selectCheckBox() {
		//clickOnCheckBox.click();
       Boolean result = clickOnCheckBox.isSelected();
		
		if( result == false)
		{
			System.out.println("Elements is not Selected");
			clickOnCheckBox.click();
		}
		else
		{
			System.out.println("Elements is Selected");

		}
	}
	
	public void selectRedmiMbl() {
		clickOnRedmiMbl.click();
	}
	

}
