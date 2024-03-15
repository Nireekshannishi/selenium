package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
public class navigate {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
    public static void main(String[] args) throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	Navigation nav = driver.navigate();
	nav.to("https://www.facebook.com/");
	nav.back();
	nav.refresh();
	nav.forward();
	Thread.sleep(2000);
}
}
