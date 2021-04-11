package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_FireFox 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Prashant\\Automation support\\Test Geckodriver\\geckodriver.exe");

		WebDriver D=new FirefoxDriver();
		
		D.get("https://www.google.com/");
		
		
	}

}
