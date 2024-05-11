/*Write a program for Case5 Annotation 


give @Test the priority

AS
BS
Test (priority =2)
Test  (priority =1)
AC

and see output
*/
package Assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assignment204_Case5 {

	@AfterSuite
	 public void AfterSuite()
	 {
		 System.out.println("AS");
	 }
	 
	 @BeforeSuite
	 public void BeforeSuite()
	 {
		 System.out.println("BS");
	 }
	 
	 @Test (priority=2)
     public void Test1() 
     { 
		 System.out.println("Test1"); 
	 }
	 
	 @Test (priority=1)
     public void Test2() 
     { 
		 System.out.println("Test2"); 
	 }
	 
	 
	 @AfterClass
	 public void AfterClass()
	 {
		 System.out.println("Ac");
	 }
}


/*
 OUTPUT----------------------------
 [RemoteTestNG] detected TestNG version 7.4.0
BS
Test2
Test1
Ac
PASSED: Test2
PASSED: Test1

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================

AS

===============================================
Default suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
===============================================


 */
