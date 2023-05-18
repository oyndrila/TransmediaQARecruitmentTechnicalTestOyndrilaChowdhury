package com.juiceshop.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
	WebDriver driver;

	private By email = By.xpath("//input[@id='email']");
	private By password = By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//button[@id='loginButton']");
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setEmail(String strEmail) {
		driver.findElement(email).sendKeys(strEmail);;
	}
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);;
	}
	public void clickButton() {
		driver.findElement(loginButton).click();
	}
	

	public void loginToJuiceShop(String email, String password) {
		this.setEmail(email);
		this.setPassword(password);
		this.clickButton();
		
	}
}
