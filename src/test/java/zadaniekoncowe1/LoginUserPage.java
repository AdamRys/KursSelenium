package zadaniekoncowe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LoginUserPage {
    private static WebDriver driver;
    @FindBy(name="email")
    WebElement loginInput;

    @FindBy(name="password")
    WebElement passwordInput;

    @FindBy(id="submit-login")
    WebElement submit;

    @FindBy(xpath="//div[@id='_desktop_user_info']/div/a[2]/span")
    WebElement profile;

    @FindBy(id="addresses-link")
    WebElement addressesButton;

    @FindBy(xpath = "//div[@class='addresses-footer']/a")
    WebElement createAddressButton;

    @FindBy(name ="alias")
    WebElement aliasInput;

    @FindBy(name="address1")
    WebElement addressInput;

    @FindBy(name="city")
    WebElement cityInput;

   // @FindBy(name = "id_country")
  //  Select country;

    @FindBy(name="id_country")
    WebElement countryElement;

    @FindBy(name="postcode")
    WebElement postcode;

    @FindBy(name="phone")
    WebElement phone;

    @FindBy(name="submitAddress")
    WebElement submitButton;

    @FindBy(id="notifications")
    WebElement successInfo;

    public LoginUserPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void loginAs(String email, String password){
        loginInput.clear();
        loginInput.click();
        loginInput.sendKeys(email);

        passwordInput.clear();
        passwordInput.click();
        passwordInput.sendKeys(password);

        submit.submit();
    }
    public void clickProfile(){ //kliknięcie w profil
        profile.click();
    }
    public void clickForAddressesCreation (){ // kliknięcie w "Addresses"
        addressesButton.click();
    }
    public void clickForAddNewAddress (){ //kliknięcie w "Create New Address"
        createAddressButton.click();
    }

    public void fillDataInForm(String aliasInput, String addressInput, String cityInput, String postcode, String country, String phone){
       this.aliasInput.clear();
       this.aliasInput.click();
       this.aliasInput.sendKeys(aliasInput);

       this.addressInput.clear();
       this.addressInput.click();
       this.addressInput.sendKeys(addressInput);

       this.cityInput.clear();
       this.cityInput.click();
       this.cityInput.sendKeys(cityInput);

    /*    Actions actions = new Actions(driver);
        actions.moveToElement(countryElement);
        actions.perform();
       this.country.selectByVisibleText(country);*/




       this.postcode.clear();
       this.postcode.click();
       this.postcode.sendKeys(postcode);

       this.countryElement.sendKeys(country);

       this.phone.clear();
       this.phone.click();
       this.phone.sendKeys(phone);

       submitButton.submit();

    }
    public String getSuccessInformation(){
        return successInfo.getText();
    }

}
