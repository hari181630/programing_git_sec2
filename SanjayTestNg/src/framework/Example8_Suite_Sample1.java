package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example8_Suite_Sample1 {
	@Test
	public void TC1() 
	{
		Reporter.log("running TC1..",true);
	}
	
	@Test
	public void TC2() 
	{
		Reporter.log("running TC2..",true);
	}
}
