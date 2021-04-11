package Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Prashant\\Automation support\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator <String> itr=windows.iterator();  //ParentID ChildId
		
		String ParentID =itr.next();  //On 0 th index--ParentID
		
		String ChildId=itr.next();   //On 1 st  index--ChildID---so on
		
		driver.switchTo().window(ChildId);
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
		
		System.out.println(driver.switchTo().defaultContent().getTitle());
		
		
		
		
		
		
		
	}

}
