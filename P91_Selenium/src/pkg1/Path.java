package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Path {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

	
	
	
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.youtube.com/watch?v=hcMzwMrr1tE&list=RDhcMzwMrr1tE&start_radio=1");
	Thread.sleep(5000);
	WebElement selectsong = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[34]/div[2]/div[1]/button"));
	selectsong.click();
	Thread.sleep(5000);
	selectsong.click();
	Thread.sleep(5000);
	selectsong.click();
	Thread.sleep(5000);
	//driver.quit();
	
	
	}
}
