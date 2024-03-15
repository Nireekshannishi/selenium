package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String argd[]) throws InterruptedException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		Thread.sleep(2000);
		searchbox.sendKeys("mobiles");
		searchbox.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//img[@class='_396cs4'][1]")).click();
		Thread.sleep(2000);
		Set<String> win = driver.getWindowHandles();
		Iterator<String>it=win.iterator();
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\OrCon\\Desktop\\SELENIUM\\cart1.png");
		FileUtils.copyFile(src,dest);
		driver.quit();
		
	}
}
