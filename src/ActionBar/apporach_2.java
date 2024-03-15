package ActionBar;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class apporach_2 {
	
			static {
					System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				}
					public static void main(String[] args) throws InterruptedException, IOException, AWTException {
						ChromeDriver driver = new ChromeDriver();
						
						driver.get("https://www.calculator.net/date-calculator.html");
						driver.manage().window().maximize();
						Thread.sleep(2000);
						
						WebElement Month = driver.findElement(By.id("today_Month_ID"));
						WebElement Day = driver.findElement(By.id("today_Day_ID"));
						driver.findElement(By.xpath(""));
						WebElement Month1 = driver.findElement(By.id("ageat_Month_ID"));
						WebElement Day1 = driver.findElement(By.id("ageat_Day_ID"));
						
			
						Select sel = new Select(Month1);
						List<WebElement> alloptions = sel.getOptions();
						for(WebElement option :alloptions)
						{
							if(option.getText().equals("mar"))
							{
								option.click();
								break;
							}
						}
						
						Select sel_1 = new Select(Day1);
						List<WebElement> alloptions_1 = sel_1.getOptions();
						for(WebElement option :alloptions_1)
						{
							if(option.getText().equals("13"))
							{
								option.click();
								break;
							}
						}
						
						Select sel_2 = new Select(Month1);
						List<WebElement> alloptions_2 = sel_2.getOptions();
						for(WebElement option :alloptions_2)
						{
							if(option.getText().equals("mar"))
							{
								option.click();
								break;
							}
						}
						
						Select sel_3 = new Select(Day1);
						List<WebElement> alloptions_3 = sel_3.getOptions();
						for(WebElement option :alloptions_3)
						{
							if(option.getText().equals("13"))
							{
								option.click();
								break;
							}
						}
									
						Thread.sleep(2000);
						driver.findElement(By.xpath("//span[@class='cbmark']")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("//input[@value='Calculate']")).click();
						Thread.sleep(2000);
					}

}
