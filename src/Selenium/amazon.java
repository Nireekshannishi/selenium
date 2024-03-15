package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();	
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nireekshannishi88@gmail.com");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		driver.quit();
		}
	

}
