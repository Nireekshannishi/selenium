package ActionBar;

//import java.awt.AWTException;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodsofwebelement {
	
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String args[])
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nireekshannishi88@gmail.com");
			driver.findElement(By.xpath("//input[@id='email']")).clear();
			System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("id"));
			System.out.println(driver.findElement(By.xpath("//button[@name='login']")).getCssValue("background"));
			System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getSize());
			System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getLocation());
			System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso']")).getText());
			System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getTagName());
			System.out.println(driver.findElement(By.xpath("//button[@name='login']")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//button[@name='login']")).isEnabled());
			System.out.println(driver.findElement(By.xpath("//button[@name='login']")).isSelected());
			
			
		}

}
