package com.demowebshop.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterHelper extends BaseHelper{
    public RegisterHelper(WebDriver driver) {
        super(driver);
    }

    public void selectDepartment() {
        click(By.cssSelector(".ico-register"));
    }

    public void categoryType() {
        click(By.cssSelector("label[for='gender-female']"));

    }
}
