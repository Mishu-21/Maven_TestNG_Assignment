//Facebook or Amazon login with Different Scenarios which is on Notes 

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment226_DataProvider_FbLogin_5Scenerio {

	
	@DataProvider(name="TestData")
	public Object method1()
	{
		Object l1[][]=new Object[5][2];
		
		//scenerio 1: With right gmail id and right password-->expected result : will login but actual result:not login
        l1[0][0]="mishachauhan41@gmail.com";
        l1[0][1]="Assignment@226";
		
		//scenerio 2: With right MobileNumber and right password-->Will login actual and expected result 
		l1[1][0]="9667203182";
		l1[1][1]="Assignment@226";
		
		//scenerio 3: With right MobileNumber with countrycode and right password-->Will login actual and expected result 
				l1[2][0]="+919667203182";
				l1[2][1]="Assignment@226";
				
		
		//Scenerio 4:wrong un and anypassword--->Will not login actual and expected result  
		l1[3][0]="9667203&98u";
		l1[3][1]="Assignmen23226";
		
		//Scenerio 5:Right un and wrong password--->Will not login actual and expected result  
		l1[4][0]="mishachauhan41@gmail.com";
		l1[4][1]="Assignmen23226";
		
		
		
		return l1;
	}
	
	
	@Test(dataProvider="TestData")
	public void fb_login(String UN,String PWD) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		//send keys on email field
				driver.findElement(By.id("email")).sendKeys(UN);
				Thread.sleep(1000);
				//send keys on password field
						driver.findElement(By.id("pass")).sendKeys(PWD);
						
				//click on login button
						driver.findElement(By.name("login")).click();
						
						Thread.sleep(2000);
						
						WebElement display=driver.findElement(By.xpath("(//div[@class='x78zum5 x1s65kcs xl56j7k']/ul/li)[2]"));
						  Assert.assertEquals(display.isDisplayed(), true,"pass");
							
					
						  
						   Reporter.log("successfully Login to facebook");// will print only for those where we are successfully login ie scenerio which are pass 

		
	}
}
