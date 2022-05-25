package com.ecommerce.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagStepDefinition {
    WebDriver driver;
    @Given("User navigates to electronics category")
    public void electronicsCategory(){
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/electronics");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#small-searchterms")).click();

    }
    @When("User selects camera tag")
    public void tagSelection(){
        driver.findElement(By.linkText("camera")).click();
    }
    @Then("User finds cameras products")
    public void tagConfirmation(){
        Assert.assertTrue(driver.findElement(By.linkText("Nikon D5500 DSLR")).isDisplayed());
        driver.quit();
    }
}
