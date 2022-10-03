package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.filpcart.com/");
	Thread.sleep(2000);
	Dimension d = new Dimension(100,200);
	driver.manage().window().setSize(d);
	System.out.println(d);
	Thread.sleep(2000);
	 Point p = new Point(100,200);//point class object having two parameter x and y
		driver.manage().window().setPosition(p);
		System.out.println("x coordinates "+driver.manage().window().getPosition().getX());
		System.out.println("y coordinates "+driver.manage().window().getPosition().getY());
	
	
}
}
