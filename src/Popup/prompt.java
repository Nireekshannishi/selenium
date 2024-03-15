package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://omayo.blogspot.com/search?q=ghg");
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,800)");
			driver.findElement(By.id("prompt")).click();
			//Alert a = driver.switchTo().alert();
			//System.out.println(a.getText());
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_N);
			r.keyPress(KeyEvent.VK_I);
			r.keyRelease(KeyEvent.VK_I);
			r.keyPress(KeyEvent.VK_S);
			r.keyRelease(KeyEvent.VK_S);
			r.keyPress(KeyEvent.VK_H);
			r.keyRelease(KeyEvent.VK_H);
			r.keyPress(KeyEvent.VK_I);
			r.keyRelease(KeyEvent.VK_I);
	
}}
