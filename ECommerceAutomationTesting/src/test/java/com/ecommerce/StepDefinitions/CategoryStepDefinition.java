package com.ecommerce.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CategoryStepDefinition {
    WebDriver driver;
    Actions actions;
    WebElement element;
    @Given("User hovers on computers category")
    public void openBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        actions = new Actions(driver);
        element = driver.findElement(By.linkText("Computers"));
        actions.moveToElement(element).build().perform();
        Thread.sleep(2000);
    }
    @When("User selects Desktop item category")
    public void selectDesktop(){
        actions.moveToElement(driver.findElement(By.linkText("Desktops"))).click().build().perform();
    }
    @Then("User finds Desktop products")
    public void categoryConfirmation(){
        Assert.assertTrue(driver.findElement(By.linkText("Build your own computer")).isDisplayed());
        driver.quit();
    }

}
