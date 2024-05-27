//DataProvider example1 using google Search

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment221_DataProvider_UsingGoogleSearch {

	@DataProvider(name="search_result")
	public Object method1() 
	{
		return new Object[][]   
				{{"India"},{"School"},{"Pencil"}};		
				
				
	}
	
	@Test(dataProvider="search_result")
	public void Google_search(String input) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		   driver.get("https://www.google.com/");
		
	    	driver.manage().window().maximize();
	    	WebElement search=driver.findElement(By.className("gLFyf"));
			search.sendKeys(input);
			search.sendKeys(Keys.ENTER);
	}
}
