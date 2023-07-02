package com.demowebshop.fw;

import org.openqa.selenium.*;

public class BaseHelper {
    WebDriver driver;

    public BaseHelper(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLoggedIn() {
        WebElement trueLogin = driver.findElement(By.cssSelector(".account"));
        return trueLogin.isDisplayed();
    }

    public void type(By locator, String text) {
        if (text != null) {
            driver.findElement(locator).click();
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

}