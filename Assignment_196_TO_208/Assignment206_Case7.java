/*Write a program for for Case7 Annotation 


AM
 BM
Test1
Test2
Test3

and see output


so order of execution is 
@BM
@TEST-1
@AM
@BM
@TEST-2
@AM
@BM
@TEST-3
@AM

*/

package Assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment206_Case7 {

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
     public void Test1() 
     { 
		 System.out.println("Test1"); 
	 }
	 
	 @Test 
     public void Test2() 
     { 
		 System.out.println("Test2"); 
	 }
	 
	 @Test 
     public void Test3() 
     { 
		 System.out.println("Test3"); 
	 }
}


/*
OUTPUT---------------------------------
[RemoteTestNG] detected TestNG version 7.4.0
BM
Test1
AM
BM
Test2
AM
BM
Test3
AM
PASSED: Test1
PASSED: Test3
PASSED: Test2

===============================================
    Default test
    Tests run: 3, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================


*/
