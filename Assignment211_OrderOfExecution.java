//create method with login,logout,registration and check Order of execution


package Assignment;

import org.testng.annotations.Test;

public class Assignment211_OrderOfExecution {

	@Test
	public void login() 
	{
		System.out.println("login");
	}

	@Test
	public void logout() 
	{
		System.out.println("logout");
	}
	
	@Test
	public void registration() 
	{
		System.out.println("registration");
	}
	
	
}

/*
Order of Execution 
login
logout
registration


*/