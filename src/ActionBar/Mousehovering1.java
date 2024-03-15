package ActionBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehovering1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		WebElement jobs = driver.findElement(By.xpath("//a[@class='nI-gNb-menuItems__anchorDropdown'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(jobs).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='IT jobs']")).click();

}}
