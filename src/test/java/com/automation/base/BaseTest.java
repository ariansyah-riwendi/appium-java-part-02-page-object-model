package com.automation.base;

import com.automation.pages.LoginPage;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends BaseSetup {

    protected LoginPage loginPage;

    @BeforeMethod
    public void setUpPageObjects() {
        loginPage = new LoginPage(driver);
    }
}
