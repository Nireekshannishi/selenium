package ActionBar;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nyka {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException, AWTException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaafashion.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Men']"));

}}
