package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.google.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	
}
}
