package TestNGTest;

public class TestNGamazone {
	
//	WebDriver driverTest;
//	@BeforeClass
//	public void launchBrowser()
//	{
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
//	      
//	    driverTest = new ChromeDriver();
//		driverTest.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driverTest.manage().window().maximize();
//		
//		System.out.println("Before class");
//	}
//	
//	@BeforeMethod
//	
//	public void toGetSignIn()
//	{
//		System.out.println("Before method");
//		
//		driverTest.get("https://www.amazon.in/");
//		
//		OnlineShoppingAmazon onlineShoppingAmazon = new OnlineShoppingAmazon(driverTest);
//		onlineShoppingAmazon.clickOnHelloSignIn();
//		
//		AmazonSignIn amazonSignIn = new AmazonSignIn(driverTest);
//		  
//		  amazonSignIn.sendEmailOrMobileNumber();
//	      amazonSignIn.clickOnContinueButton();
//	      amazonSignIn.sendPassword();
//	      amazonSignIn.clickKeepMeSignCheckbox();
//	      amazonSignIn.clickOnSignInButton();
//	      
//	      HomepageAmazon homepageAmazon = new HomepageAmazon(driverTest);
//	      
//		    homepageAmazon.sendSearchField();
//		    homepageAmazon.clickOnSearchClick();
//	      
//	      AmazonInBag amazonInBag = new AmazonInBag(driverTest);
//	      amazonInBag.clickOnBrandCheckbox();
//	      amazonInBag.clickOnProductBag();
//	      
//	      ArrayList<String> address1 =new ArrayList<String>(driverTest.getWindowHandles());
//	      driverTest.switchTo().window(address1.get(1));
//		  System.out.println(driverTest.getCurrentUrl());
//	
//	 }
//	
//	@Test
//	public void VerifyAddToCart()
//	{
//		
//		BagProduct_Child bagProduct_Child = new BagProduct_Child(driverTest);
//		  
//		  bagProduct_Child.clickOnAddtoCard();
//		  
//		  driverTest.close();
//		  
//		  
//		
//		System.out.println("Test");
//		
//		
//	}
//	
//	public void verifyBuyNow() throws InterruptedException
//	{
//		 
//		 BagProduct_Child2 bagProduct_Child2 = new BagProduct_Child2(driverTest);
//		  bagProduct_Child2.clickOnBuyNowButton();
//		  
//		  SelectDeliveryAddrPage selectDeliveryAddrPage = new SelectDeliveryAddrPage(driverTest);
//		  selectDeliveryAddrPage.getTextOfYourAddre();
//		  selectDeliveryAddrPage.clickOnUseThisAddrButton();
//		  selectDeliveryAddrPage.clickOnCashonDelivery();
//		  selectDeliveryAddrPage.clickOnPaymentMethodButton();
//		  Thread.sleep(5000);
//		  selectDeliveryAddrPage.getTextOfPlaceOrderButton();
//		  
//		  for(int i=0 ; i<=3 ; i++)
//		  {
//			  driverTest.navigate().back();
//		  }
//		
//		System.out.println("Test");
//	 	
//	}
//	@AfterMethod
//	
//	public void goToSignOutForm()
//	{
//		System.out.println("After method");
//		
//		 SignOut_Header signOut_Header = new SignOut_Header(driverTest);
//		 signOut_Header.clickOnSignOut();
//	
//	}
//	
//	@AfterClass
//	
//	public void closeBrowser()
//	{
//		System.out.println("After class");
//		driverTest.quit();
//	}
//
}
