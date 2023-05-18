package com.juiceshop.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToBasketPage {
	WebDriver driver;
	public By itemSelector = By.xpath("(//span[contains(text(),'Add to Basket')])[1]");
	private By yourBasket = By.xpath("//span[normalize-space()='Your Basket']");
	public By checkOut = By.xpath("//button[@id='checkoutButton']");
	private By addToAddress = By.xpath("//button[@aria-label='Add a new address']");
	public By popup = By.xpath("//span[normalize-space()='X']");
	public By addPopup = By.xpath("//div[@class='cdk-overlay-container bluegrey-lightgreen-theme']");
	public AddToBasketPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickButton() {
		driver.findElement(itemSelector).click();
	}
	public void clickYourBasket() {
		driver.findElement(yourBasket).click();
	}
	public void clickCheckOut() {
		System.out.println(driver.findElement(checkOut).getText());
		driver.findElement(checkOut).click();
	}
	public void clickAddToAddress() {
		driver.findElement(addToAddress).click();
	}
	
}
