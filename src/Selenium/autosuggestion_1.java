package Selenium;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion_1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// enter Hari in text box
		 driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("hari");
		 Thread.sleep(3000);		
		 List<WebElement> auto = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		 // get size
		 System.out.println(auto.size());
		// to get text
		 for(WebElement options :auto) {
				System.out.println(options.getText());
			}
	int s = auto.size();
		System.out.println(s);
		auto.get(2).click();
		
		}

}
