//Facebook login with 5 user credentials class Program

package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment224_DataProvider_5UserCredentials {
	
	@DataProvider(name="data3")
	
	public Object method1()
	{
		
		Object l1[][]=new Object[5][2];
		
		l1[0][0]= "ramsing@gmail.com";
		l1[0][1]="ramsing123";
	
		l1[1][0]= "Himang@gmail.com";
		l1[1][1]="ram 19y";
			
		l1[2][0]= "Kavitasing@gmail.com";
		l1[2][1]="ramsing123@@@";
			
		l1[3][0]= "singal@gmail.com";
		l1[3][1]="ram$sing12";
			
		l1[4][0]= "029798ng@gmail.com";
		l1[4][1]="ram79g123";
				
		return l1;		
	}
	
	
	@Test(dataProvider="data3")  
	
	public void Login_Fb(String UN,String PWD)
	{
       ChromeDriver driver=new ChromeDriver();
		
	   driver.get("https://www.facebook.com/");
		
	   driver.findElement(By.id("email")).sendKeys(UN);
		
	   driver.findElement(By.id("pass")).sendKeys(PWD);
				
	   driver.findElement(By.name("login")).click();
	
	  driver.close();
				
	}
	

}
