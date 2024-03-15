package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		Thread.sleep(2000);
		List <WebElement> checkbox =driver.findElements(By.xpath("//input[@type='checkbox']"));
		Thread.sleep(2000);
		int count = checkbox.size();
		for(int z=0;z<count;z++)
		{
			checkbox.get(z);
		}
		for(WebElement we: checkbox)
		{
			we.click();
		}
	}

}
