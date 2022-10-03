package WebDriver;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example2_EmailableReport1 {


	@Test                  //test case or test method
	public void TC1() 
	{
		Reporter.log("running TC1", true);
	}
	
	@Test                  //test case or test method
	public void TC2() 
	{
		Reporter.log("running TC2", true);
	}
	@Test
	public void TC3() {
		System.out.println("Hari");
	}
	@Test
	public void TC4() {
		Reporter.log("running tc3",false);
	}
	@Test
	public void TC5() {
		Reporter.log("running tc5",false);
	}
}
