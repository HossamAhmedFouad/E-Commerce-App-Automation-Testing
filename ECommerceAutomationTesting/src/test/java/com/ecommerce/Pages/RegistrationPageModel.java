package com.ecommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageModel {
    WebDriver driver;

    public RegistrationPageModel(WebDriver driver){
        this.driver = driver;
    }

    public WebElement firstName(){
        return driver.findElement(By.id("FirstName"));
    }
    public WebElement lastName(){
        return driver.findElement(By.id("LastName"));
    }
    public WebElement email(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement password(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword(){
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerButton(){
        return driver.findElement(By.id("register-button"));
    }
}
