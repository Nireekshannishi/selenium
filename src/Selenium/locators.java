package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.tagName("textarea")).click();
		driver.findElement(By.id("email")).sendKeys("nishibannu");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("nishi@123");
	}
}
