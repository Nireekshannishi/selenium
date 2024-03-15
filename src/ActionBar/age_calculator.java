package ActionBar;

import java.time.Duration;

//import java.awt.AWTException;
//import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class age_calculator {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.calculator.net/age-calculator.html");
			driver.manage().window().maximize();
			
			WebElement month = driver.findElement(By.id("today_Month_ID"));
			WebElement day = driver.findElement(By.id("today_Day_ID"));
			
			WebElement year = driver.findElement(By.id("today_Year_ID"));
			year.sendKeys(Keys.BACK_SPACE);
			year.sendKeys(Keys.BACK_SPACE);
			year.sendKeys(Keys.BACK_SPACE);
			year.sendKeys(Keys.BACK_SPACE);
			year.sendKeys("2000");
		
			 driver.findElement(By.xpath("//input[@value='Calculate']")).click();
			 
			
}}
