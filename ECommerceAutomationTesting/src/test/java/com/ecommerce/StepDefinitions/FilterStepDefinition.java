package com.ecommerce.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilterStepDefinition {
    WebDriver driver;
    @Given("User at Apparel category and shoes sub category")
    public void navigateToShoes(){
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/shoes");
        driver.manage().window().maximize();
    }

    @When("User filters color to red")
    public void redFilter(){
        driver.findElement(By.cssSelector("#attribute-option-15")).click();
    }

    @Then("User sees red shoes only")
    public void filterConfirmation(){
        Assert.assertTrue(driver.findElement(By.linkText("adidas Consortium Campus 80s Running Shoes")).isDisplayed());
        driver.quit();
    }
}
