package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch 
{
	
    public static void main (String[] args)
	{
		//Stricly implements methos of WebDriver interface
    	System.setProperty("webdriver.chrome.driver","D:\\Prashant\\Automation support\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();   //Create driver object for ChromeBrowser
		
		driver.get("https://www.spicejet.com/");  //Launching Browser by get method.
		
		System.out.println(driver.getCurrentUrl());    //Validate landded on correct page by website title
		
		System.out.println(driver.getTitle());         //Validate landded on correct page
		
		//System.out.println(driver.getPageSource());      //Get page source in HTML format in Console
		
		//driver.get("https://edflylearn.com/training/for-teachers/registration/login/");
	
		driver.navigate().back();  //Navigate method used to back operation
	
		driver.navigate().forward();//Navigate method used to  forward operation
		
		driver.close();                       //Closing current active rowser by selenium 
		
		driver.quit();                     //Closing all open browser by selenium 
	}
}
