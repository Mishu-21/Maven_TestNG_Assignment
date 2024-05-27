/*Add 2 product to cart and compare its total price with assertion.


Before adding any product to cart->gettext price


*/

//prices can change 
package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assignment219_Add2ProductToCart_CompareTotalPriceWithAssertion_Explanation {

	
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
		
		//add 2 products---mainly try to add those products whose price are same so that in future it wont change 
		
		/*product 1  Apple iPhone 15 Pro (1 TB) - White Titanium
		
		Add the product to the cart 
		Used id locator to add above product to the cart
		*/
		Thread.sleep(1000);
		driver.findElement(By.id("a-autoid-2-announce")).click();
		
		
		//now using the locator store the price of the the above product which is ₹1,77,990
		WebElement price_Product1_InString=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
		System.out.println(price_Product1_InString.getText());  //as return type of getText() is String so we cant add string directly
		//output --->1,77,990
		//first replace , from the price
		String Price1=price_Product1_InString.getText().replace(",", "");
		System.out.println(Price1); //Output 177900 which is in string
		
		/*
		 As now we want to add the price of product 1 with product 2 so for that my price is in string 
		 need to convert it in int 
		 so in java to convert string to int we use  parseInt() Method
		 */
		
		 int price_Product1 = Integer.parseInt(Price1); //converted string price to String price to int  price
		 System.out.println(price_Product1); //Output 177900 which is in int
		 
		 
		 /*Now add product2 -->Which is Apple iPhone 15 Pro Max (1 TB) - White Titanium
		  
		  Locator to add product to cart 
		  */	
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("a-autoid-1-announce")).click();
		 
		 //now same as above take its price and convert it into int 
		 
		 WebElement price_Product2_InString=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
			System.out.println(price_Product2_InString.getText());  //output --->1,99,900
			String Price2=price_Product2_InString.getText().replace(",", "");
			System.out.println(Price2); //Output 199900 which is in string
			
			int price_Product2 = Integer.parseInt(Price2); //converted string price to String price to int  price
			 System.out.println(price_Product2); //Output 199900 which is in int
			 
			 //Now Add price of both the product
			 int TotalPrice_OfProduct1And2= price_Product1+ price_Product2;
			 System.out.println(TotalPrice_OfProduct1And2);
			 
			 /*
			  Now we got the price for both the the items  
			  */
			 
			 //Now let's go to cart page and check the amount which is showing on the cart page we is equal to the TotalPrice_OfProduct1And2
 
			 //click on the cart page
			 
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
			 
			 //Amount extracted from the cart page 
			 WebElement TotalAmount=driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-buybox']"));
			String TotalAmount_String =TotalAmount.getText();
			System.out.println(TotalAmount_String);//output--> 3,26,800.00
			TotalAmount_String =TotalAmount.getText().replace(",", "").substring(3,9);
	System.out.println(TotalAmount_String); //output---> 377890
	//convert it intp string 
	int TotalAmount1= Integer.parseInt(TotalAmount_String); //converted string price to String price to int  price
	  
	Assert.assertEquals(TotalPrice_OfProduct1And2,TotalAmount1,"pass");
	}
}
