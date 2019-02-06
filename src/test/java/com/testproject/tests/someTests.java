package com.testproject.tests;

import com.testproject.env.baseClass;
import com.testproject.helpers.someHelper;
import com.testproject.pages.LoggedInPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class someTests {

    someHelper someHelper;
    baseClass baseClass;
    LoggedInPage loggedInPage;

    @BeforeEach
    void setUpPage() {
        someHelper = new someHelper();
        baseClass = new baseClass();
        baseClass.openPage();
        someHelper.someLoginMethod("przeplatka@gmail.com", "password");
    }

    @Test
    void isDisplayedTest() {
        loggedInPage = new LoggedInPage();
        boolean uploadButton = loggedInPage.UploadButton().isDisplayed();
        assertTrue(uploadButton);
    }

    @Test
    void assertEqualsTest() {
        String getDarkModeToggleAttribute = someHelper.getDarkModeToggleAttribute("class");
        String getBackgroundCssValue = someHelper.getBackgroundCssValue("color");
        assertEquals(getDarkModeToggleAttribute, "darkmode-toggle active");
        assertEquals(getBackgroundCssValue, "rgba(255, 255, 255, 1)");
    }
}
