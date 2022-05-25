package com.ecommerce.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchStepDefinition {
    WebDriver driver;
    @Given("User clicks on search bar")
    public void search(){
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#small-searchterms")).click();
    }
    @When("User enters name of a product")
    public void enterProductName(){
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Apple");
    }
    @And("User clicks on search button")
    public void clickSearch(){
        driver.findElement(By.cssSelector("#small-search-box-form > button")).click();
    }
    @Then("User finds product")
    public void searchConfirm(){
        Assert.assertTrue(driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).isDisplayed());
        driver.quit();
    }
}
