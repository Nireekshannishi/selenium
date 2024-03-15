package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartlogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String args[])
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");
		driver.findElement(By.cssSelector("input[class='_2IX_2- VJZDxU']")).sendKeys("8688490161");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	}

}
