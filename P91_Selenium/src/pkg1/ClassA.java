package pkg1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		//webdriver is an interface wwie dont create object so we create reference and get child 
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		//System.out.println(k);
		String k1=driver.getTitle();//getting title of all website
		System.out.println(k1);
		

	}
}
