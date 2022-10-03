package testng;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



@Test
public class example8_Keyword5_DependsOnMethod1 {
	public void login()
	{	Assert.fail();
		Reporter.log("running login test case.......",true);
		
	}

	public void logout()
	{
		Reporter.log("running logout test case.......",true);
	}
}
