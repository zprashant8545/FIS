package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testAssignment {

	
	
	public static void main(String[] args) 
	{
		//1. Go to "http://automationpractice.com/index.php" and click on Sign-In.
		System.setProperty("webdriver.chrome.driver", "D:\\Prashant\\Automation support\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		
		//2. Sign-In using following credentials:  --->Username: scttest@grr.la   Password: Spring@123
		driver.findElement(By.xpath("//*[@class='login']")).click();
		
		driver.findElement(By.id("email")).sendKeys("scttest@grr.la");
		
		driver.findElement(By.id("passwd")).sendKeys("Spring@123");
		
		
		/*3. Explore within Women >> Dresses >> Evening Dresses
		   Once page uploaded, go to Catalog and filter out dress:
		   Size(M) >> Color(Pink) >> Set Range: $50.00 - $52.28 */ 
		
		driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("(//*[@title='Women'])[1]"))).build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("(//*[@title='Evening Dresses'])[1]"))).click().build().perform();
		
		driver.findElement(By.id("layered_id_attribute_group_2")).click();   //M
		
		driver.findElement(By.id("layered_id_attribute_group_24")).click();  //pink
		
		//WebElement slider=driver.findElement(By.xpath("(//*[@class='ui-slider-handle ui-state-default ui-corner-all'])[2]"));
				
		//act.moveByOffset(xOffset, yOffset) //Set Range: $50.00 - $52.28
		
		//driver.close();
	}
	

}
