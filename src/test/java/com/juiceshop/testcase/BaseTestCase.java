package com.juiceshop.testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseTestCase {
	protected WebDriverWait wait;
	WebDriver driver;
	public void basesetup(Duration defaultWaitTime) {
		System.setProperty("windows.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://juice-shop.herokuapp.com/#/");
		wait = new WebDriverWait(driver, defaultWaitTime);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@aria-label='Close Welcome Banner']")));
        driver.findElement(By.xpath("//button[@aria-label='Close Welcome Banner']")).click();
	}
	
}
