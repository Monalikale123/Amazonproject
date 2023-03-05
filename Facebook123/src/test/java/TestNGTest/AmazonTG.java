package TestNGTest;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PomClasses.AmazonInMobile;
import PomClasses.AmozonSignIn;
import PomClasses.Homepage;
import PomClasses.OnlineShoppingSite;
import PomClasses.ProcessedToBuy;
import PomClasses.RedmiA1_Child;
import PomClasses.SignOutAmazon;

public class AmazonTG {
	WebDriver driverTest;
	@BeforeClass
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		 driverTest = new ChromeDriver();
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void ToGetSignUpForm() throws InterruptedException
	{
		driverTest.get("https://www.amazon.in/");
		OnlineShoppingSite onlineShoppingSite = new OnlineShoppingSite(driverTest);
		 
		onlineShoppingSite.clickOnHelloSingIn();
		
		AmozonSignIn amozonSignIn= new AmozonSignIn(driverTest);
		amozonSignIn.sendEmailOrMobileNo();
		amozonSignIn.clickOncontinueButtan();
		amozonSignIn.sendPassword();
		amozonSignIn.clickOnSignIn();
		
		Homepage homepage = new Homepage(driverTest); 
		//homepage.searchProduct();
		homepage.sendSearchField();
		homepage.clickOnSearchClick();
		
		AmazonInMobile amazonInMobile = new AmazonInMobile(driverTest);
		amazonInMobile.selectCheckBox();
		amazonInMobile.selectRedmiMbl();
		Thread.sleep(3000);
		//RedmiA1_Child redmiA1_Child = new RedmiA1_Child();
		ArrayList<String> addrs1 = new ArrayList<String>( driverTest.getWindowHandles());
		driverTest.switchTo().window(addrs1.get(1));

	}
	
	@Test(priority = 0)
	public void VerifyAddTocard() throws InterruptedException
	{
		RedmiA1_Child redmiA1_Child = new RedmiA1_Child(driverTest);
		redmiA1_Child.selectAddToCard();
		
		Thread.sleep(5000);
		ProcessedToBuy processedToBuy = new ProcessedToBuy(driverTest);
		
		processedToBuy.clickOnprocessedToBuy();
		
//		Thread.sleep(3000);
//		driverTest.close();
		
	}
	
//	@Test(priority = 1)
//	public void VerifyProcessedToBuy() throws InterruptedException {
//		Thread.sleep(10000);
//		ProcessedToBuy processedToBuy = new ProcessedToBuy(driverTest);
//		Thread.sleep(3000);
//		processedToBuy.clickOnprocessedToBuy();
////		driverTest.navigate().back();
////		driverTest.navigate().back();
//		//driverTest.navigate().back();
		
		
	
	
	@AfterMethod
	public void goToSignOut() {
		System.out.println("After Method");
		SignOutAmazon signOut = new SignOutAmazon(driverTest);
		signOut.clickOnSignOut();
		
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("After class");
		driverTest.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
