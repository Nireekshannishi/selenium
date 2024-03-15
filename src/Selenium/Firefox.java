package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {static
	{
    //DRIVER EXECUTE EXECUTABLE
System.setProperty("webdriver.chrome.driver","./driver/geckodriver.exe");
}
public static void main(String[] args)
{
  //OPEN BROWSER
FirefoxDriver driver = new FirefoxDriver();
  //ENTER URL
driver.get("https://www.google.com/");
driver.close();
}
	

}
