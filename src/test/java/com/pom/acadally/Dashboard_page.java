package com.pom.acadally;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_page 
{

	WebDriver driver;
	
	By dashboard=By.xpath("//span[normalize-space()='Dashboard']");
	By classCard=By.xpath("(//p[contains(text(),'Total Students : 9')])[1]");
	
	public Dashboard_page(WebDriver d)
	{
		driver= d;
		PageFactory.initElements(driver, this);
	}
	
	

	public void ClickDashboard()
	{
		driver.findElement(dashboard).click();
	}
	
	public void ClickClass()
	{
		driver.findElement(classCard).click();
	}
}
