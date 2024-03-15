package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage ().window().maximize ();
		//driver.findElement(By. name("username")).sendKeys("mr.smilyking1303_");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mr.smilyking1303_");
		System.out.println(driver.getCurrentUrl ());
		System.out.println(driver.getPageSource ());
		System.out.println(driver.getTitle());
		driver.switchTo ().activeElement () ;
		driver.close ();
	}

}
