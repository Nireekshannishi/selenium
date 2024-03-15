package ActionBar;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitway {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Enable button after 10 seconds']"))).click();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Check Checkbox after 10 seconds']"))).click();
}}
