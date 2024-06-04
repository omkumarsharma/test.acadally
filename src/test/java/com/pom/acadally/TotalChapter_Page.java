package com.pom.acadally;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TotalChapter_Page
{
	WebDriver driver;
	
	By StartAssignbtn=By.xpath("//a[@id='3802']");
	
	public TotalChapter_Page(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	public void CLickTotal()
	{
		driver.findElement(StartAssignbtn).click();
	}

}
