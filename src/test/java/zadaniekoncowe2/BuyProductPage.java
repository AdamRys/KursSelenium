package zadaniekoncowe2;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class BuyProductPage {
    public static WebDriver driver;

    @FindBy(name="email")
    WebElement loginInput;

    @FindBy(name="password")
    WebElement passwordInput;

    @FindBy(id="submit-login")
    WebElement submit;

    @FindBy(name="s")
    WebElement search;

    @FindBy(xpath="//*[@id='js-product-list']/div[1]/article[1]/div/div[1]/div/span[3]")
    WebElement discount;

    @FindBy(xpath="//*[@id='js-product-list']/div[1]/article[1]/div/a/img")
    WebElement product;

    @FindBy(id="group_1")
    WebElement size;

    @FindBy(name="qty")
    WebElement quantity;

    @FindBy(xpath="//*[@id='add-to-cart-or-refresh']/div[2]/div/div[2]/button")
    WebElement addToCardButton;

    @FindBy(xpath="//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a/i")
    WebElement proceed;

    @FindBy(xpath="//*[@id='main']/div/div[2]/div[1]/div[2]/div/a")
    WebElement proceed1;

    @FindBy(xpath="//*[@id='checkout-addresses-step']/div/div/form/div[2]/button")
    WebElement confirmaddressbutton;

    //@FindBy(id="delivery_option_1")
    //WebElement radioPresta;

    @FindBy(name = "confirmDeliveryOption")
    WebElement continuetopayment;

    @FindBy(id="payment-option-1")
    WebElement paybycheckbutton;

    @FindBy(name="conditions_to_approve[terms-and-conditions]")
    WebElement terms;

    @FindBy(xpath = "//*[@id='payment-confirmation']/div[1]/button")
    WebElement finishbutton;


    @FindBy(xpath = "//*[@id='content-hook_order_confirmation']/div/div/div/h3")
    WebElement success;
    public void loginAs(String email, String password){
        loginInput.clear();
        loginInput.click();
        loginInput.sendKeys(email);

        passwordInput.clear();
        passwordInput.click();
        passwordInput.sendKeys(password);

        submit.submit();
    }

    public BuyProductPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    public void SearchAndChoseProduct(){
        search.clear();
        search.click();
        search.sendKeys("Hummingbird Printed Sweater");
        search.submit();
    }
    public void CheckDiscountAndClickProduct(){
        //Assert.assertEquals("20%", discount);
        product.click();
    }
    public void ChooseSizeOfProduct(){
        size.sendKeys("M");
    }
    public void DefineQuantity(){
        quantity.clear();
        quantity.click();
        quantity.sendKeys("5");
    }
    public void ClickAddToCartButton(){
        addToCardButton.click();
    }
    public void GoToCheckout() {
        proceed.click();

        proceed1.click();
    }
    public void ConfirmAddressButton(){
        confirmaddressbutton.click();
    }
    public void ContinueToPayment() {
        //radioPresta.click();
        continuetopayment.click();
    }
    public void OrderWithAnObligationToPay(){
        paybycheckbutton.click();
        terms.click();
        finishbutton.click();
    }
    public void CreateScreenShot() throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        // Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("/Users/adamrys/IdeaProjects/screen1.png"));
    }
    public String getSuccess(){
        return success.getText();
    }
}
