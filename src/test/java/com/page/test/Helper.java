package com.page.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.page.test.LocatorsList.*;


public class Helper {
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

    public void openLogInPage() {
        $().get(LOG_IN_PAGE);
    }

    public void openClassesPage() {
        $().get(CLASSES_PAGE);
    }

    public void refreshPage() {
        myDriverWrapper.getDriver().navigate().refresh();
    }

    public void logIn(String email, String password) {
        $().findElement(By.id(LOGIN)).sendKeys(email);
        $().findElement(By.id(PASSWORD)).sendKeys(password);
        $().findElement(By.xpath(LOG_IN_BUTTON)).click();
    }

    public void signUpForClasses() {
        $().findElement(By.id(SIGN_UP_BUTTON)).click();
    }

    public void waitForElementToLoad(String elementId, int timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(myDriverWrapper.getDriver(), timeoutSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
    }

    public void wait(int waitingSeconds) {
        WebDriverWait wait = new WebDriverWait(myDriverWrapper.getDriver(), waitingSeconds);
    }

}
