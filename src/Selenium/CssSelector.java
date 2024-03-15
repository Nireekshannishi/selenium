package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("nireekshannishi88@gmail.com");
		//driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Nishibannu88@");
	   // driver.findElement(By.cssSelector("input[name='login")).click();
	   driver.findElement(By.name("login")).click();
	
		driver.findElement(By.cssSelector("input[placeholder^='Email']")).sendKeys("nireekshannishi88@gmail.com");
		//driver.findElement(By.cssSelector("input[placeholder$=' phone number']")).sendKeys("8688490161");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Nishibannu88@");
		Thread.sleep(2000);
		
	}

}
