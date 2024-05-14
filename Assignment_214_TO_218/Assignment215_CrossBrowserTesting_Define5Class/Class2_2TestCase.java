package Assignment215_CrossBrowserTesting_Define5Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Class2_2TestCase extends CommonClass_CheckWhichBrowserToLaunch_CrossBrowserTesting {
	@Test(priority=1)
	public void LaunchAmazon_CategoryDropdwon_SelectAmazonDevice_UsingSelectByVisible() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Category=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(Category);
		Thread.sleep(1000);
		s.selectByVisibleText("Amazon Devices");
	}
	
	@Test
	public void LaunchAmazon_CategoryDropdwon_SelectAmazonDevice_UsingSelectByValue() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Category=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(Category);
		Thread.sleep(1000);
		s.selectByValue("search-alias=amazon-devices");
	}
	
}
