package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment208_Upcaste_ChromeDriverToWebDriver {

	@Test
	public void upcaste()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
	}
}
