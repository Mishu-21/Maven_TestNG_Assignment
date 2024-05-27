//Google Search field with 10 politician name and confirm the testcase is pass or fail using Assertion

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment223_DataProvider_10Politician_GoogleSearch_CheckAssertion {

	@DataProvider(name = "search_result")
	public Object method1() {
		return new Object[][] { {"Akhilesh Yadav"},{"Narender modi"},{"Vallabhbhai Patel"},{"Jawaharlal Nehru"},{"Indira Gandhi"},{"Nitish Kumar"},{"Amit Shah"},{"Priyanka Gandhi"},{"Mohan Bhagwat"},{"Rajnath Singh"} };

	}

	@Test(dataProvider="search_result")
	public void Googlesearch_Politician(String input) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		
		   driver.get("https://www.google.com/");
		
	    	driver.manage().window().maximize();
	    	WebElement search=driver.findElement(By.name("q"));
			search.sendKeys(input);
			search.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			
			  WebElement display=driver.findElement(By.xpath("//div[@class='MDY31c']"));
			  
			  Assert.assertEquals(display.isDisplayed(), true,"pass");
			  Thread.sleep(2000);
			 
	}
}
