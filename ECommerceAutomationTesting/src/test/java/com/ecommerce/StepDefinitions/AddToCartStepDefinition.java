package com.ecommerce.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCartStepDefinition {
    WebDriver driver;
    @Given("User navigates to Books category one")
    public void openBrowser1() throws InterruptedException {
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Books")).click();
    }
    @And("User selects First Prize Pies book one")
    public void selectBook(){
        driver.findElement(By.linkText("First Prize Pies")).click();
    }
    @When("User clicks on add to cart")
    public void addToCart() throws InterruptedException {
        driver.findElement(By.cssSelector("#add-to-cart-button-38")).click();
        Thread.sleep(1000);
    }
    @Then("Confirmation message appears that product has been added to shopping car")
    public void addToCartConfirmation(){
        Assert.assertEquals("(1)",driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[2]")).getText());
        driver.quit();
    }

}
