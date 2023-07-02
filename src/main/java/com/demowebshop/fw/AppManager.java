package com.demowebshop.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class AppManager {
    String browser;
    WebDriver driver;
    RegisterHelper register;
    UserHelper user;

    public UserHelper getUser() {
        return user;
    }

    public AppManager(String browser) {
        this.browser = browser;
    }


    public void init() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        register = new RegisterHelper(driver);
        user = new UserHelper(driver);
    }

    public void stop() {
        driver.quit();
    }

    public RegisterHelper getSelect() {
        return register;
    }
}