package Popup;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingwindowpopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) throws InterruptedException, IOException, AWTException {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://omayo.blogspot.com/search?q=ghg");
			//JavascriptExecutor js= (JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,1300)");
			
Runtime.getRuntime().exec(new String[] {"C:\\Users\\OrCon\\Documents\\windowpopup.exe"});		
			
}}
