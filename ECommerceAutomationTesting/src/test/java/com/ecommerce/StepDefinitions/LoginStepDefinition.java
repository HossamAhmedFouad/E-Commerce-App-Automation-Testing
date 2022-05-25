package com.ecommerce.StepDefinitions;

import com.ecommerce.Pages.LoginPageModel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStepDefinition {
    WebDriver driver;
    @Given("user navigates to login page")
    public void openBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(2000);

    }
    @When("user enter valid username and password and clicks the login button")
    public void enterValidData(){
       LoginPageModel model = new LoginPageModel(driver);
       model.loginSteps("test@test.com","123456789",driver);
    }
    @Then("user login successfully")
    public void checkLogin(){

        Assert.assertEquals("Log out",driver.findElement(By.linkText("Log out")).getText());
        driver.quit();
    }
}
