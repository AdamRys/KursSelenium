package zadaniekoncowe2;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BuyProductSteps {
    WebDriver driver;
    BuyProductPage buyProductPage;
    @Given("^User logged in CodersLab shop$")
    public void userLoggedInCodersLabShop() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");

        BuyProductPage loginPage = new BuyProductPage(driver);
        loginPage.loginAs("rys.adam@zabka.pl", "Polopolop1!");
        buyProductPage = new BuyProductPage(driver);
    }

    @When("^Chose product - Hummingbird Printed Sweater with discount$")
    public void choseProductHummingbirdPrintedSweaterWithDiscount() {
        buyProductPage.SearchAndChoseProduct();
        buyProductPage.CheckDiscountAndClickProduct();
    }

    @And("^Chose size M and quantity$")
    public void choseSizeMAndQuantity() {
        buyProductPage.ChooseSizeOfProduct();
        buyProductPage.DefineQuantity();
    }

    @And("^Added product to cart$")
    public void addedProductToCart() {
        buyProductPage.ClickAddToCartButton();
    }

    @And("^Went to checkout$")
    public void wentToCheckout() throws InterruptedException {
        Thread.sleep(1000);
        buyProductPage.GoToCheckout();
    }

    @And("^Confirmed address$")
    public void confirmedAddress() {
        buyProductPage.ConfirmAddressButton();
    }

    @And("^Chose PrestaShop shipping method - pick up in store$")
    public void chosePrestaShopShippingMethodPickUpInStore() {
        buyProductPage.ContinueToPayment();
    }


    @And("^Pay by check and clicked order with an obligation to pay$")
    public void clickedOrderWithAnObligationToPay() {
        buyProductPage.OrderWithAnObligationToPay();
    }

    @And("^Created Screenshot with conformation of order and price$")
    public void createdScreenshotWithConformationOfOrderAndPrice() throws IOException {
        buyProductPage.CreateScreenShot();

    }
    @Then("^Customer sees info \"([^\"]*)\"$")
    public void customerSeesInfo(String message){
        Assert.assertEquals(message.contains("YOUR ORDER IS CONFIRMED"), buyProductPage.getSuccess().contains("YOUR ORDER IS CONFIRMED"));
    }
    @When("^Chose product - \"([^\"]*)\" with discount$")
    public void choseProductWithDiscount(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
