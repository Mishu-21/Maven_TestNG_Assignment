/*Write a program for Case2 Annotation 

  BeforeSuite
BeforeTest
BeforeClass
BeforeMethod

AfterMethod
AfterClass
AfterTest
AfterSuite

and see output
*/
package Assignment;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Assignment201_Case2 {

	
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
}

/*
 * OUTPUT----->
 Working Directory: C:\Users\UFL IT 2\eclipse-workspace\MavenProject
Gradle user home: C:\Users\UFL IT 2\.gradle
Gradle Distribution: Gradle wrapper from target build
Gradle Version: 8.1.1
Java Home: C:\Users\UFL IT 2\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.11.v20240426-1830\jre
JVM Arguments: None
Program Arguments: None
Build Scans Enabled: false
Offline Mode Enabled: false
Tests: Assignment.Assignment201_Case2

FAILURE: Build failed with an exception.

* What went wrong:
No matching tests found in any candidate test task.
    Requested tests:
        Test class Assignment.Assignment201_Case2

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 30s
 
 */
