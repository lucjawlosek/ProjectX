package com.ninegag.test;

public class LocatorsList {
    public final static String
            //-------------menu bar-------------
            SIGN_UP_BUTTON = "jsid-signup-button",
            SIGN_IN_BUTTON = "jsid-login-button",
            DARK_MODE_SWITCH = "jsid-header-darkmode-btn",
            SEARCH_ICON = "jsid-header-search-btn",
            SEARCH_FIELD = "jsid-search-input",
            UPLOAD_BUTTON = "jsid-upload-btn",
            PROFILE_PICTURE = "jsid-avatar",
            PROFILE_SETTINGS = "#jsid-header-user-menu-items > ul > li:nth-child(2) > a",
            PROFILE_LOGOUT_BUTTON = "badge-logout-btn",

    //-------------register window-------------
    SIGN_UP_WITH_EMAIL = "//*[@id=\"signup-fb\"]/p[2]/a",
            SIGN_UP_USERNAME = "signup-email-name",
            SIGN_UP_EMAIL = "signup-email-email",
            SIGN_UP_PASSWORD = "signup-email-password",
            CAPTCHA = "//*[@id=\"recaptcha-anchor\"]/div[5]",
            SIGN_UP_WITH_DATA_BUTTON = "//*[@id=\"signup-email\"]/form/div[5]/input",

    //-------------logIn window-------------
    LOG_IN_USERNAME_EMAIL = "login-email-name",
            LOG_IN_PASSWORD = "login-email-password",
            LOG_IN_BUTTON = "//*[@id=\"login-email\"]/div[3]/input",

    //-------------annoying pop-ups-------------
    ACCEPT_GDPR_POPUP = "/html/body/div[7]/div[1]/div[2]/div/div[3]/button[2]/span",
            I_DONT_WANT_AN_APP = "#overlay-contianer > section > div > a.link",

    //-------------page-------------
    BACKGROUND = "container",
            SEARCH_FIELD_ON_PAGE = "search-hero",
    //-------------profile page-------------
    DELETE_MY_ACCOUNT = "jsid-delete-account-btn",
            DELETE_MY_ACCOUNT_CONFIRM = "jsid-show-form-btn",
            DELETE_MY_ACCOUNT_PASSWORD = "#delete-account > div.field > input[type=\"password\"]",
            DELETE_MY_ACCOUNT_CONFIRM_BUTTON = "#delete-account > div.btn-container > input[type=\"submit\"]";
}
