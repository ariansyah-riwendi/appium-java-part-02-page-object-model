package com.automation.pages;

import com.automation.utils.Utils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPage {

    private final Utils utils;

    private final By logoImage = AppiumBy.xpath("//android.widget.ScrollView[@content-desc='test-Login']/android.view.ViewGroup/android.widget.ImageView[1]");
    private final By usernameField = AppiumBy.accessibilityId("test-Username");
    private final By passwordField = AppiumBy.accessibilityId("test-Password");
    private final By loginButton = AppiumBy.accessibilityId("test-LOGIN");
    private final By menuButton = AppiumBy.accessibilityId("test-Menu");
    private final By cartButton = AppiumBy.accessibilityId("test-Cart");

    public LoginPage(AppiumDriver driver) {
        this.utils = new Utils(driver);
    }

    public void isLogoDisplayed() {
        utils.isElementDisplayed(logoImage);
    }

    public void inputUsername(String username) {
        utils.inputText(usernameField, username);
    }

    public void inputPassword(String password) {
        utils.inputText(passwordField, password);
    }

    public void clickLogin() {
        utils.tap(loginButton);
    }

    public void isMenuDisplayed() {
        utils.isElementDisplayed(menuButton);
    }

    public void isCartDisplayed() {
        utils.isElementDisplayed(cartButton);
    }
}
