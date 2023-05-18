package com.juiceshop.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TopBarSubPage {
	WebDriver driver;
	WebElement search,searchApple;
	By account = By.xpath("//button[@id='navbarAccount']");
	By login = By.xpath("//button[@id='navbarLoginButton']//span[contains(text(),'Login')]");
	By searchButton = By.xpath("//mat-icon[normalize-space()='search']");
	By searchField = By.xpath("//input[@id='mat-input-0']");
			
	public TopBarSubPage(WebDriver driver) {
		this.driver = driver;
		search = driver.findElement(searchButton);
		searchApple = driver.findElement(searchField);
	}
	public void clickaccount() {
		driver.findElement(account).click();
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}

	public void goToLoginPage() {
		this.clickaccount();
		this.clickLogin();
	}
	public void clickSearchButton() {
		search.click();
	}
	public void setSearchField(String searchQuery){
		searchApple.sendKeys(searchQuery);
	}
	public boolean isSearchEnabledAndDisplayed() {
		boolean isDisplayed = search.isDisplayed();
		boolean	isEnabled = search.isEnabled();
		return isDisplayed && isEnabled;
		
	}
	public void performSearch(String searchQuery){
		this.clickSearchButton();
		this.setSearchField(searchQuery);
		searchApple.sendKeys(Keys.ENTER);
	}
	
}
