package com.testproject.helpers;

import com.testproject.env.baseClass;
import com.testproject.pages.NotLoggedInPage;
import org.openqa.selenium.By;

public class someHelper {


    NotLoggedInPage notLoggedInPage = new NotLoggedInPage();
    baseClass baseClass = new baseClass();

    public void someLoginMethod(String email, String password) {
        notLoggedInPage.enterEmail(email);
        notLoggedInPage.enterPass(password);
        notLoggedInPage.clickLogin();
        baseClass.wait(10);
        baseClass.waitForElementToLoad("", 10);
    }

    public String getDarkModeToggleAttribute(String attribute){
        return baseClass.$().findElement(By.id("")).getAttribute(attribute);
    }

    public String getBackgroundCssValue(String cssvalue){
        return baseClass.$().findElement(By.id("")).getCssValue(cssvalue);
    }
}
