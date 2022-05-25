package com.ecommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordPageModel {
    WebDriver driver;
    public ResetPasswordPageModel(WebDriver driver){
        this.driver = driver;
    }
    public WebElement email(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement recoverButton(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button"));
    }
}
