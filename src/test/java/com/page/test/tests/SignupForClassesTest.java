package com.page.test.tests;

import com.page.test.Helper;
import com.page.test.LocatorsList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SignupForClassesTest extends Helper {


    @BeforeEach
    void logInPage() {
        openLogInPage();
    }

    @Test
    void signUpTest() {
        logIn("lucja.wlosek@gmail.com", "reklamjga1");
        openClassesPage();
        do {
            refreshPage();
        }
        while ($().findElement(By.id(LocatorsList.FREE_SPOTS_NUMBER)).getText().equals(0));
        signUpForClasses();
    }
}
