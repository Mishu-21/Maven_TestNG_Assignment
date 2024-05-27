package Assignment;

/*Add 2 product to cart and compare its total price with assertion.

Before adding any product to cart->gettext price

*/
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment219_Add2ProductToCart_CompareTotalPriceWithAssertion {

WebDriver driver;
	
	@Test
	public void launch_Amazon_Add2ProductToCart_CompareTotalPriceWithAssertion() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Search=driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("iphone 15 pro max");
		Search.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.findElement(By.id("a-autoid-2-announce")).click();
		
		WebElement price_Product1_InString=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
		System.out.println(price_Product1_InString.getText());
		
		String Price1=price_Product1_InString.getText().replace(",", "");
		
		
		 int price_Product1 = Integer.parseInt(Price1); 
		 System.out.println(price_Product1); 
		 
         Thread.sleep(1000);
		 driver.findElement(By.id("a-autoid-1-announce")).click();
		 
		 WebElement price_Product2_InString=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
			System.out.println(price_Product2_InString.getText()); 
			String Price2=price_Product2_InString.getText().replace(",", "");
			
			
			int price_Product2 = Integer.parseInt(Price2); 
			 System.out.println(price_Product2); 
			 
			
			 int TotalPrice_OfProduct1And2= price_Product1+ price_Product2;
			 System.out.println(TotalPrice_OfProduct1And2);
			 
			 
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
			 
			
			 WebElement TotalAmount=driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']"));
			String TotalAmount_String =TotalAmount.getText();
			
			TotalAmount_String =TotalAmount.getText().replace(",", "").substring(3,9);
	
	
	int TotalAmount1= Integer.parseInt(TotalAmount_String);
	  System.out.println(TotalAmount1);
	Assert.assertEquals(TotalPrice_OfProduct1And2,TotalAmount1,"pass");
	}	
}
