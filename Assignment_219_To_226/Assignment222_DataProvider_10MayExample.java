//DataProvider example2  on 10th may class

package Assignment;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment222_DataProvider_10MayExample {

	@DataProvider(name="data1")
	public Object test_data1()
	{
		return new Object[][] {{"shoe"},{"mobile"},{"Laptop"},{"Webcamera"},{"kurta set"},{"pencil"},{"pen"},{"tablet"}};
	}
	
	
	@DataProvider(name="data2")
	public Object test_data2()
	{
		return new Object[][] {{11},{12},{13},{15},{19},{90},{80},{10}};
	}
	
	
	@Test(dataProvider="data1") 
	//pass in camel case
	public void amazon_search(String input) 
	{
		
		System.out.println(input);
		
	}
	
	
	@Test(dataProvider="data2") 
	//pass in camel case
	public void amazon_search(int input) 
	{
		
		System.out.println(input);
		
	}
	
}
