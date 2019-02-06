package com.testproject.pages;

import com.testproject.env.baseClass;
import org.openqa.selenium.By;

public class NotLoggedInPage {

    baseClass baseClass = new baseClass();

    public void enterEmail (String email){
        baseClass.$().findElement(By.id("")).sendKeys(email);
    }

    public void enterPass (String password){
        baseClass.$().findElement(By.id("")).sendKeys(password);
    }

    public void clickLogin (){
        baseClass.$().findElement(By.xpath("")).click();
    }
}
