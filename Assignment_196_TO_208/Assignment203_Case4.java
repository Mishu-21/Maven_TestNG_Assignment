
/*Write a program for Case4 Annotation 


AS
BM
AC
Test

and see output
*/

package Assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment203_Case4 {

	@AfterSuite
	 public void AfterSuite()
	 {
		 System.out.println("AS");
	 }
	
	@BeforeMethod
	 public void BeforeMethod()
	 {
		 System.out.println("BM");
	 }
	
	@AfterClass
	 public void AfterClass()
	 {
		 System.out.println("Ac");
	 }
	
	@Test 
	  public void Test() 
	  { 
		System.out.println("Test"); 
	  }
	 

}

/*
OUTPUT-----------------
BM
Test
Ac
PASSED: Test

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================

AS

===============================================
Default suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================


 */
