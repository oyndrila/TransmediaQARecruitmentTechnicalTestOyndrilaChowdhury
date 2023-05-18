package com.juiceshop.testcase;

import java.time.Duration;

import com.juiceshop.page.TopBarSubPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.juiceshop.page.AddAddressPage;
import com.juiceshop.page.AddToBasketPage;
import com.juiceshop.page.LoginPage;

public class TestCaseProblem1 extends BaseTestCase{
	TopBarSubPage objTobBarSubPage;
	LoginPage objLoginPage;
	AddToBasketPage objAddToBasketPage;
	AddAddressPage objAddressPage;

	private String loginUserName="Ashleigh89@gmail.com";
	private static String loginPassword="Ab1!2345";


	@BeforeTest
	public void setup() {
		basesetup(Duration.ofSeconds(30));
	}
	@Test(priority=0)
	public void enterLoginPage() {
		objTobBarSubPage = new TopBarSubPage(driver);
		objLoginPage = new LoginPage(driver);
		objTobBarSubPage.goToLoginPage();
		objLoginPage.loginToJuiceShop(loginUserName,loginPassword);
	}
	@Test(priority=1)
	public void addItem(){
		objAddToBasketPage= new AddToBasketPage(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(objAddToBasketPage.itemSelector));
		objAddToBasketPage.clickButton();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(objAddToBasketPage.addPopup));
		objAddToBasketPage.clickYourBasket();
		WebElement button = wait.until(ExpectedConditions.elementToBeClickable(objAddToBasketPage.checkOut));
		button.click();
     	objAddToBasketPage.clickAddToAddress();
		
	}
	@Test(priority=2)
	public void addAddress() {
		objAddressPage = new AddAddressPage(driver);
		objAddressPage.addNewAddress("America", "Mina", "01826537121", "123", "Los Angeles", "Los Angeles", "Los Angeles");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(objAddToBasketPage.popup));
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(objAddressPage.submit)).click().perform();
	}
	@AfterTest
	public void quit(){
		driver.quit();
	}
}
