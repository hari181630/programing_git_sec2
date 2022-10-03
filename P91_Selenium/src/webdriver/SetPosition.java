package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.filpcart.com/");
	Thread.sleep(2000);
	 Point p = new Point(500,500);//point class object having two parameter x and y
	driver.manage().window().setPosition(p);
	System.out.println("x coordinates "+driver.manage().window().getPosition().getX());
	System.out.println("y coordinates "+driver.manage().window().getPosition().getY());
}
}
