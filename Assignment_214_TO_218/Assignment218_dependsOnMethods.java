//Create 2 method login and logout and try to  skip logout method using dependsOnMethods Parameter

package Assignment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment218_dependsOnMethods {

	@Test
	public void login() //fail 
	{
		Assert.assertEquals(false, true);
	}
	

	@Test(dependsOnMethods="login") //will skip as dependent on login() and it is failing
	public void logout()
	{
		System.out.println("logout");
	}
	

	@Test
	public void Login() //pass
	{
		Assert.assertEquals(true, true);
	}
	
	@Test(dependsOnMethods="Login") //will run as dependent on Login() and it is passing
	public void Logout()
	{
		System.out.println("Logout");
	}
	
}
