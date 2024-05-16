//ScrollDown infinite time by giving y axis values as 200

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment228_ScrollDownTillInfityTime_YAxis200 {
	
	public static void main(String[] args) throws InterruptedException {
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
	//	js1.executeScript("window.scrollBy(0,200)");
		for(int i=0;i>=-1;i++)
		{
			js1.executeScript("window.scrollBy(0,200)");
			Thread.sleep(2000);
			
		}
		
		
		Thread.sleep(2000);
	}
	
}
