package Assignment215_CrossBrowserTesting_Define5Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Class1_1TestCase extends CommonClass_CheckWhichBrowserToLaunch_CrossBrowserTesting {
	@Test
	public void LaunchGoogle_TypeIndia_PressEnter()
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.className("gLFyf"));
		search.sendKeys("India");
		search.sendKeys(Keys.ENTER);
	}
}
