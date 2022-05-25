package com.ecommerce.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrencyStepDefinition {
    WebDriver driver;
     @Given("User clicks on drop list")
    public void dropListClick(){
         String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
         System.setProperty("webdriver.chrome.driver",chromePath);
         driver = new ChromeDriver();
         driver.navigate().to("https://demo.nopcommerce.com/");
         driver.manage().window().maximize();
         driver.findElement(By.cssSelector("#customerCurrency")).click();
     }

     @When("User clicks on Euro")
    public void selectEuro(){
         driver.findElement(By.cssSelector("#customerCurrency > option:nth-child(2)")).click();
     }
     @Then("User find the price of products in Euro")
    public void currencyConfirmation(){
         driver.navigate().to("https://demo.nopcommerce.com/desktops");
         Assert.assertTrue(driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-body > div.products-container > div.products-wrapper > div > div > div:nth-child(1) > div > div.details > div.add-info > div.prices > span")).getText().contains("€"));
         driver.quit();
     }
}
