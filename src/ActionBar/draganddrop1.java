package ActionBar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.manage().window().maximize();
		List<WebElement> draganddrop = driver.findElements(By.xpath("//div[@class='ui-widget ui-helper-clearfix']"));
		Thread.sleep(2000);
		WebElement elementtobedragged = driver.findElement(By.xpath("///h5[@class='ui-widget-header']"));
		Thread.sleep(1000);
		WebElement elementtobedropped = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act = new Actions(driver) ;
		act.dragAndDrop (elementtobedragged, elementtobedropped).perform();
		Thread.sleep(2000);

}
}