package com.ninegag.test.features;

import com.ninegag.test.Selenium9gag;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UpvoteFeatureTest extends Selenium9gag {


    @BeforeEach
    void setUpPage() {
        openPage();
        fuckGDPR();
        login();
    }

    @Test
    void loginTest() {
        assertTrue($().findElement(By.id("jsid-upload-btn")).isDisplayed());
    }

    @Test
    void darkModeTest() {
        switchTheDarkModeButton();
        assertEquals($().findElement(By.id("jsid-header-darkmode-btn")).getAttribute("class"), "darkmode-toggle active");
        switchTheDarkModeButton();
        assertEquals($().findElement(By.id("jsid-header-darkmode-btn")).getAttribute("class"), "darkmode-toggle");
    }

    @Test
    void searchForMemes() {
        searchText("duck");
        assertTrue($().findElement(By.id("search-hero")).isDisplayed());
    }
}
