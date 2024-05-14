package Assignment216_ParallelTesting_Define5Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CommonClass_CheckWhichBrowserToLaunch_ParallelTesting {
	WebDriver driver;

	@Parameters("nameOfBrowser")
	@BeforeMethod
	public void launch(String which_Browser)
	{
		if(which_Browser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		if(which_Browser.equals("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		if(which_Browser.equals("edge"))
		{
			driver= new EdgeDriver();
		}
	}
}
