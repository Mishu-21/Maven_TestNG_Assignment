/*Write a program for Case3 Annotation


BeforeSuite
BeforeTest
BeforeClass
BeforeMethod
Test
*/
package Assignment;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment202_Case3 {
	
	
	@BeforeSuite
	 public void BeforeSuite()
	 {
		 System.out.println("BS");
	 }
	 

	 
	 @BeforeTest
	 public void BeforeTest()
	 {
		 System.out.println("Bt");
	 }
	 
	
	 @Test 
	  public void Test() 
	  { System.out.println("Test"); }
	 

	 
	 @BeforeClass
	 public void BeforeClass()
	 {
		 System.out.println("Bc");
	 }
	 
	 
	 
	 @BeforeMethod
	 public void BeforeMethod()
	 {
		 System.out.println("BM");
	 }
	 
	

}

/*
 OUTPUT---------------------
 order of execution
 BS
Bt
Bc
BM
Test
 */
