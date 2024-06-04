package com.pom.acadally;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Class_OverviewPage 
{
	WebDriver driver;
	
	By totalChapter=By.xpath("//h2[normalize-space()='Total Chapters']");
	
	public Class_OverviewPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}

	public void ClickTotal_Chapter()
	{
		driver.findElement(totalChapter).click();
	}
}
