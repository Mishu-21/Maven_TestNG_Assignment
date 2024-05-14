package Assignment215_CrossBrowserTesting_Define5Class;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Class4_1TestCase extends CommonClass_CheckWhichBrowserToLaunch_CrossBrowserTesting {

	@Test
	public void LaunchGoogle_ClickRegister_ClickContinueGoogle()
	{
               driver.get("https://www.naukri.com/");
		       driver.manage().window().maximize();
			   driver.findElement(By.linkText("Register")).click();
               driver.findElement(By.className("google-text")).click();	
	}
}
