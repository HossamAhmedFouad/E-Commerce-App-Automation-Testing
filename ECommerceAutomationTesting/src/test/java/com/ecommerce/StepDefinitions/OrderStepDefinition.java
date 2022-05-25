package com.ecommerce.StepDefinitions;

import com.ecommerce.Pages.CheckoutPageModel;
import com.ecommerce.Pages.LoginPageModel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderStepDefinition {
        WebDriver driver;
    CheckoutPageModel model;
        @Given("User navigates to shopping cart and shopping cart has items")
        public void navigateToShoppingCart(){
            String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver",chromePath);
            driver = new ChromeDriver();
            driver.navigate().to("https://demo.nopcommerce.com/");
            driver.findElement(By.linkText("Log in")).click();
            LoginPageModel model = new LoginPageModel(driver);
            model.loginSteps("test@test.com","123456789",driver);
            driver.navigate().to("https://demo.nopcommerce.com/");
            driver.findElement(By.linkText("Books")).click();
            driver.findElement(By.linkText("First Prize Pies")).click();
            driver.findElement(By.cssSelector("#add-to-cart-button-38")).click();
            driver.findElement(By.linkText("Shopping cart")).click();
            driver.manage().window().maximize();
        }
        @And("User clicks on agree terms of service")
        public void agreeTerms(){
            driver.findElement(By.cssSelector("#termsofservice")).click();
        }
        @When("User clicks on checkout button")
        public void checkout(){
            driver.findElement(By.cssSelector("#checkout")).click();
        }
        @And("Fills shipment and payment data")
        public void validData() throws InterruptedException {
            model = new CheckoutPageModel(driver);
            model.address1().sendKeys("test");
            model.country().sendKeys("Egypt");
            model.city().sendKeys("test");
            model.zipCode().sendKeys("test");
            model.phoneNumber().sendKeys("test");
            model.continueButton1().click();
            Thread.sleep(2000);
            model.continueButton2().click();
            Thread.sleep(2000);
            model.continueButton3().click();
            Thread.sleep(2000);
            model.continueButton4().click();
            Thread.sleep(2000);
        }

        @And("Clicks on confirm button")
        public void confirmOrder() throws InterruptedException {
            model.confirmButton().click(); Thread.sleep(2000);
        }
        @Then("Order Success Message Appears")
        public void confirmationMessage(){
            Assert.assertEquals("Your order has been successfully processed!",driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body.checkout-data > div > div.title > strong")).getText());
            driver.quit();
        }


}
