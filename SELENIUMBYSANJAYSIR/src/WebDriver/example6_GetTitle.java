package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6_GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("https://www.google.com");
		
		String title = driver.getTitle();     //return type of getTitle() type is String
		System.out.println(title);
		

	}

}
