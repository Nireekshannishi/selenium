package ActionBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement mobiles = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act = new Actions(driver);
		act.moveToElement(mobiles).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Laptop Accessories']")).click();

}}
