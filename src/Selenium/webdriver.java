package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/"); 
			driver.manage ().window().maximize ();
		//driver. findElement (By.id("email") ).sendKeys ("125466") ;
			driver.findElement(By.id("email")).sendKeys("nireekshannishi");
		System.out.println(driver.getCurrentUrl ());
		System.out.println(driver.getPageSource ());
		System.out.println(driver.getTitle());
		driver.switchTo ().activeElement () ;
		//driver.close ();
	}
	
}
