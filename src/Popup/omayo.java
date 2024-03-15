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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class omayo {
	//private static final String OlderNewsletters = null;
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://omayo.blogspot.com/search?q=ghg");
			
			
			driver.findElement(By.id("ta1")).sendKeys("mr.smilyking1303_");
			
			driver.findElement(By.id("but2")).click();
			
			driver.findElement(By.id("radio1")).click();
			
			driver.findElement(By.id("checkbox2")).click();
			
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,800)");
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nishi");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nishi");
			driver.findElement(By.xpath("//input[@type='button']")).click();
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			
		//PROMPT//
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
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			
			driver.findElement(By.id("confirm")).click();
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("nishi");
			
			JavascriptExecutor js1= (JavascriptExecutor)driver;
			js1.executeScript("window.scrollBy(0,300)");
			
			driver.findElement(By.xpath("//form[@action='demo_form.asp']")).click();
			Robot r1 = new Robot ();
			StringSelection str = new StringSelection("C:\\Users\\OrCon\\Desktop\\Hybrid model");
			Thread.sleep (3000);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			JavascriptExecutor js11= (JavascriptExecutor)driver;
			js11.executeScript("window.scrollBy(0,300)");
			
			driver.findElement(By.xpath("//input[@name='vehicle'][1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='accessories'][1]")).click();
			Thread.sleep(1000);
			
			JavascriptExecutor js111= (JavascriptExecutor)driver;
			js111.executeScript("window.scrollBy(0,300)");
			
			driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("nishi");
			driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("nishi");
			driver.findElement(By.xpath("//input[@type='button']")).click();
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			WebElement doubleclick = driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
			Actions act =new Actions(driver);
			act.doubleClick(doubleclick).perform();
			driver.switchTo().alert().accept();
			
			
			

}
}