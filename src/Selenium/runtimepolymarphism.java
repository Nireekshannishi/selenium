package Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class runtimepolymarphism {
	public static WebDriver driver;
	public static void main (String args)
	{
	System.out.println ("Enter the browser to open") ;
	Scanner scan = new Scanner (System. in) ;
	String input = scan.next () ;
	if (input. equalsIgnoreCase ("СВ") )
	{
	System. setProperty ("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	driver= new ChromeDriver () ;
	}
	else if (input. equalsIgnoreCase ("FF"))
	{
	System. setProperty ("webdriver.gecko.driver", "./driver/geckodriver.exe") ;
	driver = new FirefoxDriver();
	}
	else
	{
	System.out.println("Invalid input");
	}
	driver.get ("https://web.whatsapp.com/");
	driver. close () ;

}}
