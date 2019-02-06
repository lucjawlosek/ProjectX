package com.testproject.env;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class baseClass {
    protected DriverWrapper driverWrapper;

    @BeforeEach
    public void setUp() {
        driverWrapper = new DriverWrapper();
    }

    @AfterEach
    public void tearDown() {
        driverWrapper.quit();
    }

    public WebDriver $() {
        return driverWrapper.getDriver();
    }

    public void openPage() {
        $().get("http://9gag.com/");
    }

    public void waitForElementToLoad(String elementId, int timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driverWrapper.getDriver(), timeoutSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementId)));
    }

    public void wait(int waitingSeconds) {
        WebDriverWait wait = new WebDriverWait(driverWrapper.getDriver(), waitingSeconds);
    }

}