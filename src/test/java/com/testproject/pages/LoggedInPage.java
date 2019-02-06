package com.testproject.pages;

import com.testproject.env.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.testproject.pages.LocatorsList.BUTTON;

public class LoggedInPage {

    baseClass baseClass = new baseClass();

    public WebElement UploadButton(){
        return baseClass.$().findElement(By.id(BUTTON));
    }


}
