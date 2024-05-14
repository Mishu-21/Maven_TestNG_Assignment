package Assignment214_ChoosingABrowser_Define5Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
public class Class3_1TestCase extends CommonClass_CheckWhichBrowserToLaunch  {

	
	@Test
	public void LaunchAmazon_CategoryDropdwon_SelectAmazonDevice_UsingSelectByIndex() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Category=driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(Category);
		Thread.sleep(1000);
		s.selectByIndex(2);
	}
}
