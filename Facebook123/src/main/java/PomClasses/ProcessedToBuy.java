package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcessedToBuy {
	
	@FindBy (xpath="(//span[@id='attach-sidesheet-checkout-button'])[1]")
    private WebElement processedToBuy;
	
	public ProcessedToBuy(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	public void clickOnprocessedToBuy(){
		processedToBuy.click();
		
	}
}
