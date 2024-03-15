package ActionBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class canva {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.canva.com/");
		driver.manage().window().maximize();
		WebElement designspotlight = driver.findElement(By.xpath("//span[@class='_38oWvQ'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(designspotlight).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Presentations']")).click();
}}
