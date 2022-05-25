package com.ecommerce.StepDefinitions;

import com.ecommerce.Pages.RegistrationPageModel;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationStepDefinition {
    WebDriver driver;
    RegistrationPageModel model;
    @Given("User navigates to register page")
    public void openBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Register")).click();
        model = new RegistrationPageModel(driver);
    }
    @When("User enters first name and last name")
    public void enterName(){
        model.firstName().sendKeys("test");
        model.lastName().sendKeys("test");
    }
    @And("User enters email")
    public void enterEmail(){
        model.email().sendKeys("test@test.com");
    }

    @And("User enters password")
    public void enterPassword(){
        model.password().sendKeys("123456789");
    }
    @And("User confirms password and clicks register button")
    public void confirmPassword(){
        model.confirmPassword().sendKeys("123456789");
        model.registerButton().click();
    }
    @Then("User registers successfully")
    public void registeredSuccessfully(){
        Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());
        driver.quit();
    }
}
