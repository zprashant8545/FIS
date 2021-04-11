package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_alerts 
{
	public static void main (String [] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Prashant\\Automation support\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button")).click();
		
		Alert alrt=driver.switchTo().alert();
		
		System.out.println(alrt.getText());
		
		alrt.accept();
		
		driver.findElement(By.id("female")).click();
		
		driver.findElement(By.cssSelector("body > div > div:nth-child(14) > div > form > input.Automation")).click();
		
		driver.findElement(By.cssSelector("input[id='female']")).click();
		
		driver.findElement(By.cssSelector(".Performance")).click();
	}

}
