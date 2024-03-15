package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldownAmazon {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String argd[]) throws InterruptedException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("8688490161");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Nishibannu88@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Explore all']")).click();
		WebElement search = driver.findElement(By.xpath("//img[@alt='CVANU Birds & Branch Self-Adhesive Vinyl Wall Sticker for Wall Decoration (13inX35in)_S270']"));
		Thread.sleep(2000);
		 Point loc = search.getLocation();
		 int x = loc.getX();
		 int y = loc.getY();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("scrollBy("+x+","+y+")");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\OrCon\\Desktop\\SELENIUM\\amazon.png");
		FileUtils.copyFile(src,dest);
	}

}
