package com.ecommerce.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToWishlistStepDefinition {
    WebDriver driver;
    @Given("User navigates to Books category three")
    public void openBrowser3(){
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Books")).click();
    }
    @And("User selects First Prize Pies book three")
    public void selectBook(){
        driver.findElement(By.linkText("First Prize Pies")).click();
    }
    @When("User clicks on wishlist")
    public void addToWishlist() throws InterruptedException {
        driver.findElement(By.cssSelector("#add-to-wishlist-button-38")).click();
        Thread.sleep(1000);
    }
    @Then("Confirmation message appears that product has been added to wishlist")
    public void addToWishlistConfirmation(){
        Assert.assertEquals("The product has been added to your wishlist",driver.findElement(By.cssSelector("#bar-notification > div > p")).getText());
        driver.quit();
    }
}
