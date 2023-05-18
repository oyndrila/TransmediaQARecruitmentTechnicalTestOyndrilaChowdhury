package com.juiceshop.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAddressPage {
	private WebDriver driver;
	
	private By country = By.xpath("//input[@id='mat-input-3']");
	private By name = By.xpath("//input[@id='mat-input-4']");
	private By mobileNumber = By.xpath("//input[@id='mat-input-5']");
	private By zipCode = By.xpath("//input[@id='mat-input-6']");
	private By address = By.xpath("//textarea[@id='address']");
	private By city = By.xpath("//input[@id='mat-input-8']");
	private By state = By.xpath("//input[@id='mat-input-9']");
	public By submit = By.xpath("//button[@id='submitButton']//span[@class='mat-button-wrapper']");
	
	public AddAddressPage(WebDriver driver) {
		this.driver=driver;
	}
	public void setCountry(String strCountry) {
		driver.findElement(country).sendKeys(strCountry);;
	}
	public void setName(String strName) {
		driver.findElement(name).sendKeys(strName);;
	}
	public void setMobileNumbey(String strMobileNumber) {
		driver.findElement(mobileNumber).sendKeys(strMobileNumber);;
	}
	public void setZipCod(String strZipCode) {
		driver.findElement(zipCode).sendKeys(strZipCode);;
	}
	public void setAddress(String strAddress) {
		driver.findElement(address).sendKeys(strAddress);;
	}
	public void setCity(String strCity) {
		driver.findElement(city).sendKeys(strCity);;
	}
	public void setState(String setState) {
		driver.findElement(state).sendKeys(setState);;
	}
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
	public void addNewAddress(String country, String name, String mobilenumber, String zipcode, String address, String city, String state) {
		this.setCountry(country);
		this.setName(name);
		this.setMobileNumbey(mobilenumber);
		this.setZipCod(zipcode);
		this.setAddress(address);
		this.setCity(city);
		this.setState(state);
	}
}
