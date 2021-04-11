package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown 
{
	public static void main (String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Prashant\\Automation support\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		
		Select drpd=new Select(driver.findElement(By.id("testingDropdown")));  //To handle static dropdown 
		
		drpd.selectByVisibleText("Database Testing");
		
		drpd.selectByIndex(2);
		
	}

}
