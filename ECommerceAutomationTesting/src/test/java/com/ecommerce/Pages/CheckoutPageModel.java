package com.ecommerce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPageModel {
    WebDriver driver;
    public CheckoutPageModel(WebDriver driver){
        this.driver = driver;
    }
    public WebElement firstName(){
        return driver.findElement(By.cssSelector("#BillingNewAddress_FirstName"));
    }
    public WebElement lastName(){
        return driver.findElement(By.cssSelector("#BillingNewAddress_LastName"));
    }
    public WebElement email(){
        return driver.findElement(By.cssSelector("#BillingNewAddress_Email"));
    }
    public WebElement country(){
        return driver.findElement(By.cssSelector("#BillingNewAddress_CountryId"));
    }
    public WebElement city(){
        return driver.findElement(By.cssSelector("#BillingNewAddress_City"));
    }
    public WebElement address1(){
        return driver.findElement(By.cssSelector("#BillingNewAddress_Address1"));
    }
    public WebElement zipCode(){
        return driver.findElement(By.cssSelector("#BillingNewAddress_ZipPostalCode"));
    }
    public WebElement phoneNumber(){
        return driver.findElement(By.cssSelector("#BillingNewAddress_PhoneNumber"));
    }
    public WebElement continueButton1(){
        return driver.findElement(By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button"));
    }
    public WebElement continueButton2(){
        return driver.findElement(By.cssSelector("#shipping-method-buttons-container > button"));
    }
    public WebElement continueButton3(){
        return driver.findElement(By.cssSelector("#payment-method-buttons-container > button"));
    }
    public WebElement continueButton4(){
        return driver.findElement(By.cssSelector("#payment-info-buttons-container > button"));
    }
    public WebElement confirmButton(){
        return driver.findElement(By.cssSelector("#confirm-order-buttons-container > button"));
    }

}
