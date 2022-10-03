package framework;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_Annotations2 {
	
//	open Browser
//	login To App
//	running add To Wishlist TC
//	logout from App
//	login To App
//	running verify Profile Name TC
//	logout from App
//	close Browser

	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("open Browser",true);
	}
	
	@BeforeMethod
	public void loginToApp() 
	{
		Reporter.log("login To App",true);
	}

	@Test
	public void verifyProfileName()
	{
		Reporter.log("running verify Profile Name TC",true);
	}
	
	@Test
	public void addToWishlist()
	{
		Reporter.log("running add To Wishlist TC",true);
	}
			
	@AfterMethod
	public void logoutFromApp() 
	{
		Reporter.log("logout from App",true);
	}	

	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("close Browser",true);
	}
	
}
