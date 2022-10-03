package sanjay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Spicejet {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

				WebDriver driver = new ChromeDriver();

				driver.get("https://www.spicejet.com/");//to open this site in browser
				
				boolean checkbox = driver.findElement(By.xpath("(//div[@class=\"css-1dbjc4n r-zso239\"])[1]")).isEnabled();
				System.out.println(checkbox);
				
				

	}

}
