package ActionBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdown {
	
		
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String args[]) throws InterruptedException
		{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.calculator.net/date-calculator.html");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			WebElement month = driver.findElement(By.xpath("//select[@id='today_Month_ID']"));
			WebElement day = driver.findElement(By.xpath("//select[@id='today_Day_ID']"));
			
			driver.findElement(By.id("today_Year_ID")).clear();
			driver.findElement(By.id("today2_Year_ID")).sendKeys("2000");
			
			 Select sel = new Select(month);
			 sel.selectByIndex(04);
			 Select sel1 = new Select( day);
			 sel1.selectByIndex(14);
			
			 Thread.sleep(3000);
		  driver.findElement(By.xpath("//span[@class='cbmark']")).click();
			 Thread.sleep(2000);
			// driver.findElement(By.xpath("//input[@value='Calculate']")).click();
			
			 
			 JavascriptExecutor js= (JavascriptExecutor)driver;
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0,300)");
				Thread.sleep(2000);
				
				WebElement bigtext = driver.findElement(By.id("c2op"));
				Select sel11 = new Select(bigtext) ;
				sel11.selectByIndex(0);
				
				
				driver.findElement(By.xpath("//input[@id='c2year']")).clear();
				driver.findElement(By.xpath("//input[@id='c2year']")).sendKeys("2000");
				
				driver.findElement(By.xpath("//input[@name='c2month']")).clear();
				driver.findElement(By.xpath("//input[@name='c2month']")).sendKeys("03");
				
				driver.findElement(By.xpath("//input[@name='c2week']")).clear();
				driver.findElement(By.xpath("//input[@name='c2week']")).sendKeys("03");
				
				driver.findElement(By.xpath("//input[@name='c2day']")).clear();
				driver.findElement(By.xpath("//input[@name='c2day']")).sendKeys("13");
				
				//input[@name='x'][1]
				 //driver.findElement(By.xpath("//input[@name='x'][1]")).click();
										 
}
}
