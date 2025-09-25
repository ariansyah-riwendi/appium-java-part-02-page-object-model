package com.automation.tests;

import com.automation.base.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        loginPage.isLogoDisplayed();
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLogin();
        loginPage.isMenuDisplayed();
        loginPage.isCartDisplayed();
    }
}
