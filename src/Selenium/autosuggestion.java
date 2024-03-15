package Selenium;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		search.sendKeys("iphone");
		
		Thread.sleep(3000);
		
		List<WebElement>auto= driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax'][1]/di"));
		Thread.sleep(2000);
		System.out.println(auto.size());
		// to get text
		 for(WebElement options :auto) {
				System.out.println(options.getText());
			}
	int s = auto.size();
	Thread.sleep(2000);
	auto.get(0).click();
	

}}
