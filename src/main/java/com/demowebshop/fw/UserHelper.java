package com.demowebshop.fw;

import model.Login;
import model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {

    public UserHelper(WebDriver driver) {
        super(driver);
    }
    public void fillRegistrationForm(User user) {
        type(By.cssSelector("input#FirstName"), user.getFirstName());
        type(By.cssSelector("input#LastName"), user.getLastName());
        type(By.cssSelector("input#Email"), user.getEmail());
        type(By.cssSelector("input#Password"), user.getPassword());
        type(By.cssSelector("input#ConfirmPassword"), user.getConfirmPassword());
    }

    public void fillLoginForm(Login login) {
        type(By.cssSelector("input#Email"), login.getEmail());
        type(By.cssSelector("input#Password"), login.getPassword());
    }

}
