//Write a program with different paramaters like priority, enabled, timeOut and innvocation Count of TestNG

package Assignment;

import org.testng.annotations.Test;

public class Assignment197_DifferentParamterOfTestAnnotation {
	@Test(priority=2,invocationCount=2)
	public void Login()
	{
		System.out.println("Login method");
	}

	@Test(priority=1,timeOut=2000,enabled=true)
	public void Logout()
	{
		System.out.println("logout method");
	}
	@Test(enabled=false)   //as we have enabled=false so it will not execute
	public void Registration()
	{
		System.out.println("Login method");
	}
}
