package ActionBar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class aaproach_3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();

			driver.get("https://www.calculator.net/date-calculator.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement Month = driver.findElement(By.id("today_Month_ID"));
			selectOptionFromDropdown(Month,"mar");
			
			WebElement Day = driver.findElement(By.id("today_Day_ID"));
			selectOptionFromDropdown(Day,"13");
			
			WebElement Month1 = driver.findElement(By.id("ageat_Month_ID"));
			selectOptionFromDropdown(Month1,"mar");
			WebElement Day1 = driver.findElement(By.id("ageat_Day_ID"));
			selectOptionFromDropdown(Day1,"13");
			

}
		private static void selectOptionFromDropdown(WebElement month, String string) throws InterruptedException {
			Select drp = new Select(month);
			List<WebElement> alloptions = drp.getOptions();
			Thread.sleep(2000);
			for(WebElement option :alloptions) {
				if(option.getText().equals(month)) {
					option.click();
					break;
				}
			}
			// TODO Auto-generated method stub
			
		}}
