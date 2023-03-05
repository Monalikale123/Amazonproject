package Amazone;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomClasses.AmazonInMobile;
import PomClasses.AmozonSignIn;
import PomClasses.Homepage;
import PomClasses.OnlineShoppingSite;
import PomClasses.ProcessedToBuy;
import PomClasses.RedmiA1_Child;
import PomClasses.SignOutAmazon;

public class OnlineClass1 {

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driverTest = new ChromeDriver();
		driverTest.get("https://www.amazon.in/");
		driverTest.manage().window().maximize();
		
		
		
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
		
		//RedmiA1_Child redmiA1_Child = new RedmiA1_Child();
		ArrayList<String> addrs1 = new ArrayList<String>( driverTest.getWindowHandles());
		driverTest.switchTo().window(addrs1.get(1));
		RedmiA1_Child redmiA1_Child = new RedmiA1_Child(driverTest);
		redmiA1_Child.selectAddToCard();
		
		Thread.sleep(10000);
		ProcessedToBuy processedToBuy = new ProcessedToBuy(driverTest);
		Thread.sleep(3000);
		processedToBuy.clickOnprocessedToBuy();
		
		driverTest.navigate().back();
	    driverTest.navigate().back();

		Thread.sleep(3000);
		
		SignOutAmazon signOut = new SignOutAmazon(driverTest);
		signOut.clickOnSignOut();
		
		
	}

}
