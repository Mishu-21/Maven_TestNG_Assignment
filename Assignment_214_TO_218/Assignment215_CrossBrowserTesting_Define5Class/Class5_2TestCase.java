package Assignment215_CrossBrowserTesting_Define5Class;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Class5_2TestCase extends CommonClass_CheckWhichBrowserToLaunch_CrossBrowserTesting {
	@Test
	public void LaunchGoogle_GmailLink()
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
	}
	
	
	@Test
	public void LaunchGoogle_ClickImageLink()
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//click on image link 
		driver.findElement(By.className("lnXdpd")).click();
	}
}
