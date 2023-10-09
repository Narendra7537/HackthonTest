package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class SubmitForm extends TestBase{
	public void SubmitForm(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//textarea[@name=\"comments\"]")
	WebElement comments;
	
	@FindBy(xpath="//input[@value=\"cb1\"]")
	WebElement checkbox;
	
	@FindBy(xpath="//input[@value=\"rd2\"]")
	WebElement radiobutton;
	
	@FindBy(xpath="//select[@name=\"dropdown\"]")
	WebElement dropdown;
	
	@FindBy(xpath="//input[@value=\"submit\"]")
	WebElement submitbutton;
	
	public void submitForm(String UserName, String Password, String Comments) {
		
		username.sendKeys(UserName);
		password.sendKeys(Password);
		comments.sendKeys(Comments);
		checkbox.click();
		radiobutton.click();
		submitbutton.click();
		
	}
	
	
	
}
