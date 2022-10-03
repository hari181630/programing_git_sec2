package pkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	//Pre-condition annotations--Starting with @Before
	

	@BeforeSuite//1
	public void setUp()//1
	{
		System.out.println("setUp system property for chrome");
	}
	@BeforeTest//2
	public void launchBrowser() {
		System.out.println("launchBrowser");
	}

//@:annotations each and every ann start with method
@BeforeClass
public void login() //3
{
	System.out.println("login to app");
}



@BeforeMethod
public void enterUrl()//4
{
	System.out.println("enter Url");
}
//test cases--starting with @Test
@Test
public void googleTitleTest() //5
{
	System.out.println("Google Title Test");
}
//post conditions --starting with @after

@AfterMethod
public void logOut()//6
{
	System.out.println("logout from the app");
}
//@AfterMethod
//public void logOut()
//{
//	System.out.println("logout from app");
//}
@AfterTest
public void delectedAllCookies()
{
	System.out.println("delect all cookies");
}
WebDriver driver;
@AfterSuite
public void generateTestReport()
{
	System.out.println("generate test Report");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterClass
public void classBrowser()
{
	System.out.println();
}



}
