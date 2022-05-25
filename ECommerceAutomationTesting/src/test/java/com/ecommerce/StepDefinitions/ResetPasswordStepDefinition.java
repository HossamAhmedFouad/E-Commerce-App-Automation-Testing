package com.ecommerce.StepDefinitions;

import com.ecommerce.Pages.ResetPasswordPageModel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResetPasswordStepDefinition {
    WebDriver driver;
    @Given("User navigates to login page")
    public void openBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(2000);
    }
    @When("User Clicks on Forgot Password")
    public void clickForgotButton(){
        driver.findElement(By.linkText("Forgot password?")).click();
    }
    @And("User enters his email address and clicks on recover")
    public void recoverySteps(){
        ResetPasswordPageModel model = new ResetPasswordPageModel(driver);
        model.email().sendKeys("test@test.com");
        model.recoverButton().click();
    }
    @Then("A message appears that says \"Email with instructions has been sent to you.\"")
    public void recoverPassword(){
        Assert.assertEquals("Email with instructions has been sent to you.", driver.findElement(By.cssSelector("#bar-notification > div > p")).getText());
        driver.quit();
    }

}
