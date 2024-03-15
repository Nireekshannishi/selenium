package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String argd[]) throws InterruptedException, IOException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1600)");
		
		driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/w_163,c_limit,fl_progressive,dpr_2.0/assets/images/2023/7/31/bfab4827-0ea6-4a5b-8b8d-167d497ae78e1690787339167-Shop-By-Category_HP-4_03.jpg']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js1.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("//img[@src='https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/13765688/2021/6/7/7a242a4e-b4fe-4fbc-b9f3-6299b52ef2a21623056937843INVICTUSMenGreyRegularFitSolidCasualShirtShirtsINVICTUSMenSh1.jpg']")).click();
		Thread.sleep(2000);
		Set<String> win = driver.getWindowHandles();
		Iterator<String>it=win.iterator();
		String win1=it.next();
		String win2=it.next();
		driver.switchTo().window(win2);
		Thread.sleep(2000);
		
		JavascriptExecutor js11= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js11.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("//p[@class='size-buttons-unified-size']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")).click();
		Thread.sleep(1000);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\OrCon\\Desktop\\SELENIUM\\myntra_1.png");
		FileUtils.copyFile(src,dest);

	}

}
