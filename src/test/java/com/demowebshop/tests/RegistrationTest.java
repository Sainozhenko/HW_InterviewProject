package com.demowebshop.tests;

import model.Login;
import model.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase{




    @Test
    public void registreted(){
        app.getSelect().selectDepartment();
        app.getSelect().categoryType();
        app.getUser().fillRegistrationForm(new User()
                .setFirstName("Karl")
                .setLastName("Adam")
                .setEmail("adam@gm.com")
                .setPassword("Koblenz1234$")
                .setConfirmPassword("Koblenz1234$"));
        app.getSelect().click(By.cssSelector("#register-button"));
        app.getSelect().click(By.cssSelector(".ico-login"));
        app.getUser().fillLoginForm(new Login().setEmail("adam@gm.com").setPassword("Koblenz1234$"));
        app.getSelect().click(By.cssSelector(".login-button"));

        Assert.assertTrue(app.getUser().isLoggedIn());
    }
    }

