package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_IE 
{
 public static void main (String[] args)
 {
	 System.setProperty("webdriver.ie.driver", "D:\\Prashant\\Automation support\\Internet Explorer\\IEDriverServer.exe");
	 
	 WebDriver drive=new InternetExplorerDriver();
	 
	 drive.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	 
	 drive.get("https://www.javatpoint.com/selenium-webdriver-running-test-on-ie-browser");
			             
 }
}
