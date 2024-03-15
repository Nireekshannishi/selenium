package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandles {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(2000);
		searchbox.sendKeys("mobiles");
		searchbox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//img[@class='_396cs4'][1]")).click();
		Thread.sleep(2000);
		Set<String> win = driver.getWindowHandles();
		Iterator<String>it=win.iterator();
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
		//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		//driver.close();
	}
	
}
