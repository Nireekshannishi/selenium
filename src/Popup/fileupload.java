package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://omayo.blogspot.com/search?q=ghg");
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1300)");
			
			driver.findElement(By.xpath("//form[@action='demo_form.asp']")).click();
			Thread.sleep(2000);
			Robot r = new Robot ();
			Thread.sleep(2000);
			StringSelection str = new StringSelection("C:\\Users\\OrCon\\Downloads\\picture.jpg");
			Thread.sleep (3000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
			Thread.sleep(2000);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(3000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			//driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\OrCon\\Desktop\\Hybrid model.png");
}
}