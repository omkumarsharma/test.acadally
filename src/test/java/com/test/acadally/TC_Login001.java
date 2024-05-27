package com.test.acadally;

import org.testng.annotations.Test;

import com.pom.acadally.Login_page;

public class TC_Login001 extends Base_class
{

	@Test
	public void Login_Test()
	{
		
		driver.get(base_url);
		Login_page login= new Login_page(driver);

		login.SetUsername("uat10"); 
		login.SetPassword("Trial@123");
		login.HitLogin();

		  
	}

	
	
}
