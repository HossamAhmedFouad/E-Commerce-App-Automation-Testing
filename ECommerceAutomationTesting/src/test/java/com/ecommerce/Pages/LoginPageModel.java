package com.ecommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageModel {

    WebDriver driver;

    public LoginPageModel(WebDriver driver){
        this.driver = driver;
    }

    public WebElement loginEmailField(){
        return driver.findElement(By.id("Email"));
    }

    public WebElement loginPasswordField(){
        return driver.findElement(By.id("Password"));
    }

    public WebElement loginButton(){
        return driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button"));
    }

    public WebElement loginForgotPasswordButton(){
        return driver.findElement(By.linkText("Forgot password?"));
    }

    public void loginSteps(String email, String pass, WebDriver driver){
        LoginPageModel model = new LoginPageModel(driver);
        model.loginEmailField().sendKeys(email);
        model.loginPasswordField().sendKeys(pass);
        model.loginButton().click();
    }

}
