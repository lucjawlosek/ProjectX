package com.ninegag.test.pageobjects;

import com.ninegag.test.LocatorsList;
import org.junit.platform.commons.util.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.ninegag.test.LocatorsList.*;

public class LoginPage {
    private WebDriver $;

    public LoginPage(WebDriver $) {
        this.$ = $;
    }

    public void login(String email, String password) {
        $.findElement(By.id(SIGN_IN_BUTTON)).click();
        $.findElement(By.id(LocatorsList.LOG_IN_USERNAME_EMAIL)).sendKeys(email);
        $.findElement(By.id(LOG_IN_PASSWORD)).sendKeys(password);
        $.findElement(By.xpath(LOG_IN_BUTTON)).click();
    }

    public boolean hasErrorMessage() {
        String text = $.findElement(By.id("fancy > css > to > error:message")).getText();
        return StringUtils.isNotBlank(text);
    }
}
