package ActionBar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class artoftesting {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		driver.findElement(By.id("fname")).sendKeys("Mr.smilyking1303_");
		driver.findElement(By.id("idOfButton")).click();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,500)");
		
	List <WebElement>checkbox=	driver.findElements(By.xpath("//input[@type='checkbox']"));
	driver.findElement(By.xpath("//input[@id='male']")).click();
	int count = checkbox.size();
	for(int z=0;z<count;z++) {
		checkbox.get(z);
	}
	for(WebElement we: checkbox)
	{
		we.click();
	}
	JavascriptExecutor js1= (JavascriptExecutor)driver;
	
	js1.executeScript("window.scrollBy(0,200)");
	Thread.sleep(1000);
	
	WebElement draganddrop = driver.findElement(By.id("testingDropdown"));
	Select sel = new Select(draganddrop);
	List<WebElement> alloptions = sel.getOptions();
	for(WebElement option :alloptions)
	{
		if(option.getText().equals("Manual Testing"))
		{
			option.click();
			break;
		}
	}
	
	JavascriptExecutor js11= (JavascriptExecutor)driver;
	Thread.sleep(1000);
	js11.executeScript("window.scrollBy(0,500)");
	WebElement elementtobedragged = driver.findElement (By.id("myImage"));
	WebElement elementtobedropped = driver.findElement (By.id("targetDiv"));
	Actions act = new Actions(driver) ;
	act.dragAndDrop (elementtobedragged, elementtobedropped).perform();
	Thread.sleep(5000);

}

}
