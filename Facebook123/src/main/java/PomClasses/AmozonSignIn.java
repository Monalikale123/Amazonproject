package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmozonSignIn {
	
	@FindBy(xpath ="//input[@id='ap_email']")
	private WebElement emailOrMobileNo;
	
	@FindBy(xpath ="//input[@id='continue']")
	private WebElement continueButtan;
	
	@FindBy(xpath ="//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy(xpath ="//input[@id='signInSubmit']")
	private WebElement signIn;
	
	public AmozonSignIn (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
    public void sendEmailOrMobileNo() {
		
	emailOrMobileNo.sendKeys("chetansalgare21@gmail.com");
	}
    
    public void clickOncontinueButtan() {
	
	continueButtan.click();
	
    }
	public void sendPassword() {
		
		password.sendKeys("Shardul07");
     }
	
	 public void clickOnSignIn() {
			
		 signIn.click();
    
	 }
	 

}




