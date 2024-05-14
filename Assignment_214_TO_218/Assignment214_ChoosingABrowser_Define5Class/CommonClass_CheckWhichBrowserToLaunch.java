package Assignment214_ChoosingABrowser_Define5Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class CommonClass_CheckWhichBrowserToLaunch {

	//when we are choosing a browser no need to go for if else condition,only define and launch browser
	//by default choose chrome as browser
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void defineChromeBrowser()
	{
		driver =new ChromeDriver();
	}
}
