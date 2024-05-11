
/*Write a program for Case6 Annotation
 


AM
BM
Test1
Test2

and see output


so mainly AM and BM are not normal annotation they are bit different which means
they act as a bodyguard to each @Test Annotaion which means if we have above annotation present in my class
so order of execution is 
@BM
@TEST-1
@AM
@BM
@TEST-2
@AM

*/

package Assignment;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment205_Case6 {

	
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
PASSED: Test2
PASSED: Test1

===============================================
    Default test
    Tests run: 2, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 2, Passes: 2, Failures: 0, Skips: 0
===============================================


 */
