package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class craftvilla {
	
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String args[]) throws InterruptedException, IOException 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.craftsvilla.com/");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//input[@name='citysearch']")).sendKeys("hyderabad");
			driver.findElement(By.xpath("//div[@id='locator-button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@src='https://cdn1.plotch.io/assets/images/1702618249_MS5wbmc=.png'][1]")).click();
	Thread.sleep(2000);
//JavascriptExecutor js=(JavascriptExecutor)driver;
//Thread.sleep(2000);
//js.executeScript("Window.scrollBy(0,200)");
//js.executeScript("Window.scrollBy(0,300)");
 driver.findElement(By.xpath("//img[@src='https://cdnaz.plotch.io/image/upload/w_301,h_301/C/V/PLOR2PJ3iS1701524056_9d45d89cfa09c0869f3f68a2a0083b74bf081e92c1133d6ada23a18fd1726389.png?product_id=1108837650&s=1']")).click();
 Thread.sleep(2000);
TakesScreenshot ts=(TakesScreenshot)driver;
WebElement makeup = driver.findElement(By.xpath("//img[@src='https://cdnaz.plotch.io/image/upload/w_301,h_301/C/V/PLOR2PJ3iS1701524056_9d45d89cfa09c0869f3f68a2a0083b74bf081e92c1133d6ada23a18fd1726389.png?product_id=1108837650&s=1']"));
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\OrCon\\Desktop\\SELENIUM\\craftvilla.png");
	FileUtils.copyFile(src,dest);
}}
