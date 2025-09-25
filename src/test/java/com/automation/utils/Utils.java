package com.automation.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utils {

    private final AppiumDriver driver;

    public Utils(AppiumDriver driver) {
        this.driver = driver;
    }

    public void tap(By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public void inputText(By locator, String text) {
        WebElement element = driver.findElement(locator);
        element.clear();
        element.sendKeys(text);
    }

    public void isElementDisplayed(By locator) {
        try {
            driver.findElement(locator).isDisplayed();
        } catch (Exception ignored) {
        }
    }
}
