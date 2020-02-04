package zadaniekoncowe1;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;


public class AddAddressSteps {
    LoginUserPage loginUserPage;
    WebDriver driver;
    @Given("^User logged in to CodersLab shop$")
    public void userLoggedInToCodersLabShop() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");

        LoginUserPage loginPage = new LoginUserPage(driver);
        loginPage.loginAs("rys.adam@zabka.pl", "Polopolop1!");
        loginUserPage = new LoginUserPage(driver);
    }
    @When("^User goes to Profile$")
    public void userGoesToProfile() {
        loginUserPage.clickProfile();
    }

    @And("^User goes to Addresses$")
    public void userGoesToAddresses() throws InterruptedException {
        Thread.sleep(1500);
        loginUserPage.clickForAddressesCreation(); // po tym jestem już w widoku wszystkich utworzonych dotychczas adresów
    }

    @And("^User creates new address$")
    public void userCreatesNewAdress() {
        loginUserPage.clickForAddNewAddress(); // po tym jestem już w tworzeniu nowego adresu
    }

    @And("^User fill (.*), (.*), (.*), (.*), (.*) and (.*) info$")
    public void userFillAliasAddressCityPostcodeCountryAndPhoneInfo(String alias, String address, String city, String postcode, String country, String phone) {
        loginUserPage.fillDataInForm(alias, address, city, postcode, country, phone);
    }

    @Then("^User sees info \"([^\"]*)\"$")
    public void userSeesInfo(String message) {

        Assert.assertEquals(message, loginUserPage.getSuccessInformation());
        driver.quit();

    }
}
