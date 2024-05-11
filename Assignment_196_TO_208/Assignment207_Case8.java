/*Write a program for Case8 
AM
 BM
Test1
Test2
Test3

and see output


so order of execution is 
@BM
@TEST-1
@BM
@TEST-2
@BM
@TEST-3



*/

package Assignment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment207_Case8 {
	@BeforeMethod
	 public void BeforeMethod()
	 {
		 System.out.println("BM");
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
BM
Test2
BM
Test3
PASSED: Test2
PASSED: Test3
PASSED: Test1

===============================================
    Default test
    Tests run: 3, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 3, Passes: 3, Failures: 0, Skips: 0
===============================================


*/