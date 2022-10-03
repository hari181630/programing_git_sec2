package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5 {
@Test
public void TC1()
{
	System.out.println("Hello");
}
@Test
public void TC2()
{
	Reporter.log("Replace of Syso");
}
@Test
public void TC3()
{
	Reporter.log("Reporter",true);
}
public void TC4()
{
	Reporter.log("Reporter",false);
}
}
