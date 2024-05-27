package com.pom.acadally;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{

	 WebDriver driver;
	 	 
	 By username= By.id("username");
	 By password= By.id("password");
	 By loginbtn= By.id("loginbtn");
	 
	 public Login_page(WebDriver remote_driver)
	 {
		 driver= remote_driver;
		 PageFactory.initElements(remote_driver, this);
	 }
	  
	 public void SetUsername(String user_name)
	 {
		 driver.findElement(username).sendKeys(user_name);
	 }
	 
	 public void SetPassword(String pass_word) 
	 {
		 driver.findElement(password).sendKeys(pass_word);
	 }
	 
	 public void HitLogin()
	 {
		 driver.findElement(loginbtn).click();
	 }
}
