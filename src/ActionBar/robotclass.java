package ActionBar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotclass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException, AWTException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement grocery = driver.findElement(By.xpath("//span[text()='Grocery']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		//act.moveToElement(grocery).perform();
		act.contextClick(grocery).perform();
		
		Robot r = new Robot() ;
		r.keyPress(KeyEvent.VK_T) ;
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String > winhan = driver.getWindowHandles();
		Iterator<String> i = winhan.iterator();
		String win1 = i.next();
		String win2= i.next(); 
		driver.switchTo().window(win2) ;

}}
