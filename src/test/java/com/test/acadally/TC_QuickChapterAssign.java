package com.test.acadally;

import org.testng.annotations.Test;

import com.pom.acadally.Class_OverviewPage;
import com.pom.acadally.Dashboard_page;
import com.pom.acadally.Login_page;
import com.pom.acadally.TotalChapter_Page;

public class TC_QuickChapterAssign extends Base_class
{
	@Test
	public void AssignChapter() throws InterruptedException
	{
		driver.get(base_url); 
		Login_page login= new Login_page(driver);

		login.SetUsername("uat80"); 
		login.SetPassword("Uat40@80");
		login.HitLogin();
		
		Dashboard_page home= new Dashboard_page(driver);
		home.ClickDashboard();
		Thread.sleep(2000);
		home.ClickClass();
		
		Class_OverviewPage classOverview= new Class_OverviewPage(driver);
		classOverview.ClickTotal_Chapter();
		
		TotalChapter_Page totalChapter=new TotalChapter_Page(driver);
		totalChapter.CLickTotal();
		
	}

}
