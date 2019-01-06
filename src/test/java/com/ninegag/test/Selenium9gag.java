package com.ninegag.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Selenium9gag {
    protected MyDriverWrapper myDriverWrapper;

    @BeforeEach
    public void setUp() {
        myDriverWrapper = new MyDriverWrapper();
    }

    @AfterEach
    public void tearDown() {
        myDriverWrapper.quit();
    }

    public WebDriver $() {
        return myDriverWrapper.getDriver();
    }

    public void login() {
        $().findElement(By.id("jsid-login-button")).click();
        $().findElement(By.id("login-email-name")).sendKeys("przeplatka@gmail.com");
        $().findElement(By.id("login-email-password")).sendKeys("password");
        $().findElement(By.xpath("//*[@id=\"login-email\"]/div[3]/input")).click();
    }

    public void fuckGDPR() {
        $().findElement(By.xpath("/html/body/div[7]/div[1]/div[2]/div/div[3]/button[2]/span")).click();
    }

    public void openPage() {
        $().get("http://9gag.com/");
    }

    public void switchTheDarkModeButton() {
        $().findElement(By.id("jsid-header-darkmode-btn")).click();
    }

    public void searchText(Object searchedText) {
        $().findElement(By.id("jsid-header-search-btn")).click();
        $().findElement(By.id("jsid-search-input")).sendKeys((CharSequence) searchedText);
        $().findElement(By.id("jsid-search-input")).sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(myDriverWrapper.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-hero")));
    }
}