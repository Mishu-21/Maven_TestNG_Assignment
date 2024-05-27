//Facebook Registration using Dataprovider

package Assignment;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.testng.Assert;

public class Assignment225_DataProvider_FbRegistration {

	
	@DataProvider(name="TestData")
	public Object method1()
	{
		Object l1[][]=new Object[5][4];
		
		l1[0][0]="Kavita";
		l1[0][1]="Chauhan";
		l1[0][2]="7834898482";
		l1[0][3]="Assignment@225";
		
		
		l1[1][0]="Kavya";
		l1[1][1]="Kumar";
		l1[1][2]="7834898482";
		l1[1][3]="Assnment@225";

		
		l1[2][0]="deepak";
		l1[2][1]="Chauhan";
		l1[2][2]="+907834898482";
		l1[2][3]="Assignment@225";

		
		l1[3][0]="pankag";
		l1[3][1]="Chauhan";
		l1[3][2]="78348808482";
		l1[3][3]="Assignment@225";

		l1[4][0]="vita";
		l1[4][1]="Chuhan";
		l1[4][2]="Hijs34898482";
		l1[4][3]="Assignment@225";

		return l1;
	}
	
	@Test(dataProvider="TestData")
	public void fb_registration(String FirstName,String Surname,String MobileNo,String PWD) throws InterruptedException
	{
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		//launch fb
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		//click on create new  user button 
	WebElement click_on_CreateNewUser	=driver.findElement(By.partialLinkText("Create new account"));
	click_on_CreateNewUser.click();
	Thread.sleep(2000);
	
	//click on first name tab and enter ur firstname
	driver.findElement(By.name("firstname")).sendKeys(FirstName);
	Thread.sleep(1000);
	
	//Click on last name and enter ur last name 
	WebElement surname=driver.findElement(By.name("lastname"));
	surname.sendKeys(Surname);
	Thread.sleep(1000);
	
	//Click on email and phone number tab n enter it 
	driver.findElement(By.name("reg_email__")).sendKeys(MobileNo);
	Thread.sleep(1000);
	
	//Click on pswd tab and enter pswd
	driver.findElement(By.id("password_step_input")).sendKeys(PWD);
	Thread.sleep(1000);
	
	
	//for each scenerio -->Enter same dob
	//now from the dropdown select dob 
	WebElement date=driver.findElement(By.id("day"));
	Select s1=new Select(date);
	s1.selectByIndex(20); //select date by using selectByIndex()
	Thread.sleep(1000);
	
	
	//select month using selectByVisbleText()
	WebElement month=driver.findElement(By.id("month"));
	Select s2=new Select(month);
	
	s2.selectByValue("1");
	Thread.sleep(1000);
	
	//select year using selectByValue()
	WebElement year=driver.findElement(By.id("year"));
	Select s3=new Select(year);
	s3.selectByValue("2000");
	Thread.sleep(1000);
	
	////for each scenerio -->Choose women
	driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
	Thread.sleep(1000);
	//driver.close();
	
	//signup
	driver.findElement(By.xpath("//div[@class='_1lch']/button")).click();
	Thread.sleep(3000);
	
	//not able to find this element 
	WebElement display=driver.findElement(By.xpath("//div[@class='_4t2a']"));
	Assert.assertEquals(display.isDisplayed(), true,"pass");
	Thread.sleep(2000);
	}
	
}
