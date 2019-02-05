package com.ninegag.test;

import com.ninegag.test.pageobjects.LoginPage;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.ninegag.test.LocatorsList.*;
import static org.junit.Assert.assertTrue;


public class Selenium9gag {
    private MyDriverWrapper myDriverWrapper = new MyDriverWrapper();
    private LoginPage loginPage;

    @BeforeEach
    public void setUp() {
        this.myDriverWrapper = new MyDriverWrapper();
        this.loginPage = new LoginPage(myDriverWrapper.getDriver());
    }

    @AfterEach
    public void tearDown() {
        myDriverWrapper.quit();
    }

    @Test
    void should_login_to_9gag() {
        loginPage.login("dupa@cycki.pl", "d6a7s8d67as8");
    }

    @Test
    void should_show_error_message_when_logging_in_to_9gag() {
        loginPage.login("dupa@cycki.pl", "d6a7s8d67as8");
        boolean hasError = loginPage.hasErrorMessage();

        assertTrue(hasError);
    }

    //    public WebDriver $() {
//        return myDriverWrapper.getDriver();
//    }

//    public void signUp(String name, String email, String password) {
//        $().findElement(By.id(SIGN_UP_BUTTON)).click();
//        $().findElement(By.xpath(SIGN_UP_WITH_EMAIL)).click();
//        $().findElement(By.id(SIGN_UP_USERNAME)).sendKeys(name);
//        $().findElement(By.id(SIGN_UP_EMAIL)).sendKeys(email);
//        $().findElement(By.id(SIGN_UP_PASSWORD)).sendKeys(password);
//        $().findElement(By.xpath(CAPTCHA)).click();
//        wait(10);
//        $().findElement(By.xpath(SIGN_UP_WITH_DATA_BUTTON)).click();
//        $().findElement(By.xpath(I_DONT_WANT_AN_APP)).click();
////    }
//
//    public void logIn(String email, String password) {
//        $().findElement(By.id(SIGN_IN_BUTTON)).click();
//        $().findElement(By.id(LocatorsList.LOG_IN_USERNAME_EMAIL)).sendKeys(email);
//        $().findElement(By.id(LOG_IN_PASSWORD)).sendKeys(password);
//        $().findElement(By.xpath(LOG_IN_BUTTON)).click();
//    }

//    public void logOut() {
//        waitForElementToLoad(PROFILE_PICTURE, 10);
//        $().findElement(By.id(PROFILE_PICTURE)).click();
//        $().findElement(By.className(PROFILE_LOGOUT_BUTTON)).click();
//    }
//
//    public void deleteAccount() {
//        $().findElement(By.id(PROFILE_PICTURE)).click();
//        $().findElement(By.id(PROFILE_SETTINGS)).click();
//        $().findElement(By.id(DELETE_MY_ACCOUNT)).click();
//        $().findElement(By.id(DELETE_MY_ACCOUNT_CONFIRM)).click();
//        $().findElement(By.id(DELETE_MY_ACCOUNT_PASSWORD)).sendKeys("password123");
//        $().findElement(By.id(DELETE_MY_ACCOUNT_CONFIRM_BUTTON)).click();
//    }
//
//    public void fuckGDPR() {
//        $().findElement(By.xpath(ACCEPT_GDPR_POPUP)).click();
//    }
//
//    public void openPage() {
//        $().get("http://9gag.com/");
//    }
//
//    public void switchTheDarkModeButton() {
//        $().findElement(By.id(DARK_MODE_SWITCH)).click();
//    }
//
//    public void searchText(Object searchedText) {
//        $().findElement(By.id(SEARCH_ICON)).click();
//        $().findElement(By.id(SEARCH_FIELD)).sendKeys((CharSequence) searchedText);
//        $().findElement(By.id(SEARCH_FIELD)).sendKeys(Keys.ENTER);
//    }
//
//    public void waitForElementToLoad(String elementId, int timeoutSeconds) {
//        WebDriverWait wait = new WebDriverWait(myDriverWrapper.getDriver(), timeoutSeconds);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
//    }
//
//    public void wait(int waitingSeconds) {
//        WebDriverWait wait = new WebDriverWait(myDriverWrapper.getDriver(), waitingSeconds);
//    }

}