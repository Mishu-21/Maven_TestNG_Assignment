//Write a program with all the 9 annotations in TestNG

package Assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment199_AnnotationAll9 {

	 @BeforeSuite
	 public void BeforeSuite()
	 {
		 System.out.println("BS");
	 }
	 
	 @AfterSuite
	 public void AfterSuite()
	 {
		 System.out.println("AS");
	 }
	 
	 @BeforeTest
	 public void BeforeTest()
	 {
		 System.out.println("Bt");
	 }
	 
	 @AfterTest
	 public void AfterTest()
	 {
		 System.out.println("At");
	 }
	 
	 
	 @BeforeClass
	 public void BeforeClass()
	 {
		 System.out.println("Bc");
	 }
	 
	 @AfterClass
	 public void AfterClass()
	 {
		 System.out.println("Ac");
	 }
	 
	 
	 @BeforeMethod
	 public void BeforeMethod()
	 {
		 System.out.println("BM");
	 }
	 
	 @AfterMethod
	 public void AfterMethod()
	 {
		 System.out.println("AM");
	 }
	 
	 
		  @Test 
		  public void Test() 
		  { System.out.println("Test"); }
}
