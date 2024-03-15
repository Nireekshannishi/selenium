package ActionBar;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException, AWTException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.xpath("//span[text()='Mobiles']"));
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		//act.moveToElement(grocery).perform();
		act.contextClick(mobile).perform();
		
		Robot r = new Robot() ;
		r.keyPress(KeyEvent.VK_T) ;
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String > winhan = driver.getWindowHandles();
		Iterator<String> i = winhan.iterator();
		String win1 = i.next();
		String win2= i.next(); 
		driver.switchTo().window(win2) ;
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src='https://rukminim2.flixcart.com/fk-p-flap/844/140/image/85d4f5e4123f9c8c.jpg?q=50']")).click();
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js1.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\OrCon\\Desktop\\SELENIUM\\cart2.png");
		FileUtils.copyFile(src,dest);
		driver.quit();
}

}
