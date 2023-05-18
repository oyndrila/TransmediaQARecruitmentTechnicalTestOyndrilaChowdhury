package com.juiceshop.testcase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.juiceshop.page.TopBarSubPage;

import static org.testng.Assert.*;

public class TestCaseProblem2 extends BaseTestCase {
    TopBarSubPage objSearch;

    @BeforeTest
    public void setup() {
        basesetup(Duration.ofSeconds(10));
        objSearch = new TopBarSubPage(driver);
    }

    @Test(priority = 0)
    public void isSearchButtonDisplayedAndEnabled() {
        assertTrue(objSearch.isSearchEnabledAndDisplayed());
    }

    @Test(priority = 1)
    public void verifySearch() {
        objSearch.performSearch("apple");
        List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//*[@class='item-name']")));
        assertEquals(list.size(), 2);
        for (WebElement el : list) {
            assertTrue(el.getText().toLowerCase().contains("apple"));
            assertFalse(el.getText().toLowerCase().contains("banana"));
        }
    }
    @AfterTest
    public void quit(){
        driver.quit();
    }
}
