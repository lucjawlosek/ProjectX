package com.ninegag.test;

public class LocatorsList {
    //-------------menu bar-------------
    public final static String SIGN_UP_BUTTON = "jsid-signup-button";
    public final static String SIGN_IN_BUTTON = "jsid-login-button";
    public final static String DARK_MODE_SWITCH = "jsid-header-darkmode-btn";
    public final static String SEARCH_ICON = "jsid-header-search-btn";
    public final static String SEARCH_FIELD = "jsid-search-input";
    public final static String UPLOAD_BUTTON = "jsid-upload-btn";
    public final static String PROFILE_PICTURE = "jsid-avatar";
    public final static String PROFILE_SETTINGS = "#jsid-header-user-menu-items > ul > li:nth-child(2) > a";
    public final static String PROFILE_LOGOUT_BUTTON = "badge-logout-btn";

    //-------------register window-------------
    public final static String SIGN_UP_WITH_EMAIL = "//*[@id=\"signup-fb\"]/p[2]/a";
    public final static String SIGN_UP_USERNAME = "signup-email-name";
    public final static String SIGN_UP_EMAIL = "signup-email-email";
    public final static String SIGN_UP_PASSWORD = "signup-email-password";
    public final static String CAPTCHA = "//*[@id=\"recaptcha-anchor\"]/div[5]";
    public final static String SIGN_UP_WITH_DATA_BUTTON = "//*[@id=\"signup-email\"]/form/div[5]/input";

    //-------------logIn window-------------
    public final static String LOG_IN_USERNAME_EMAIL = "login-email-name";
    public final static String LOG_IN_PASSWORD = "login-email-password";
    public final static String LOG_IN_BUTTON = "//*[@id=\"login-email\"]/div[3]/input";

    //-------------annoying pop-ups-------------
    public final static String ACCEPT_GDPR_POPUP = "/html/body/div[7]/div[1]/div[2]/div/div[3]/button[2]/span";
    public final static String I_DONT_WANT_AN_APP = "#overlay-contianer > section > div > a.link";

    //-------------page-------------
    public final static String BACKGROUND = "container";
    public final static String SEARCH_FIELD_ON_PAGE = "search-hero";

    //-------------profile page-------------
    public final static String DELETE_MY_ACCOUNT = "jsid-delete-account-btn";
    public final static String DELETE_MY_ACCOUNT_CONFIRM = "jsid-show-form-btn";
    public final static String DELETE_MY_ACCOUNT_PASSWORD = "#delete-account > div.field > input[type=\"password\"]";
    public final static String DELETE_MY_ACCOUNT_CONFIRM_BUTTON = "#delete-account > div.btn-container > input[type=\"submit\"]";
}
