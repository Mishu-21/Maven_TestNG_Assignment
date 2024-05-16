//A program to scroll down till 'COVID-19 and Amazon' in Amazon Application

package Assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Assignment229_ScrollDown_TillCovid19 {

	@Test
	public void ScrollDown_TillCovid19() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoe");
		search.sendKeys(Keys.ENTER);
		
		WebElement e1=driver.findElement(By.linkText("COVID-19 and Amazon"));
		
		Point p1 = e1.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		
		
		JavascriptExecutor js1=driver;
		js1.executeScript("window.scrollBy(0,"+y+")");
		
		Thread.sleep(2000);
	}
}
