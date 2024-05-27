//IRetryAnalyzer program

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class Assignment220_IRetryAnalyzer implements IRetryAnalyzer{

	int initial_count=0;
	int retry_count=3;
	@Override
	public boolean retry(ITestResult result) {
		 while(initial_count<retry_count) //can use for loop too
		 {
			 initial_count++;
			 return true;
		 }
		return false;
	}

}
class LaunchGoogle_ClickonGmail
{
@Test(retryAnalyzer =Assignment.Assignment220_IRetryAnalyzer.class )
public void LaunchGoogle_ClickonGmail_Method()
   {
	   ChromeDriver driver=new ChromeDriver();
	
	   driver.get("https://www.google.com/");
	
    	driver.manage().window().maximize();
    	//will fail 
    	driver.findElement(By.linkText("GmMail")).click();
    }
}