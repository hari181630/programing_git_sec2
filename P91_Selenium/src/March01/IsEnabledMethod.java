package March01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\SELENIUM\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		boolean result=driver.findElement(By.xpath("//a[@role='button' and @id='u_0_2_wn']")).isEnabled();
		System.out.println(result);
		Thread.sleep(2000);
		if(result==true)
		{
			System.out.println("element is enabled");
		}
		else
		{
			System.out.println("element is disabled");
		}
	}




}
