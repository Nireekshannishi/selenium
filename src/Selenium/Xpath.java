package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String argd[])
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("////input[@name='username']")).sendKeys("mr.smilyking1303_");
		//driver.findElement(By.xpath(""))
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		driver.findElement(By.xpath("//div[@class='bwc__sc-1nbn7v6-14 khhVFa']")).click();
		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("8688490161");
	}

}
