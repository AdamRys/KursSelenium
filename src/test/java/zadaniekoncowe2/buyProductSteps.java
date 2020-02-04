package zadaniekoncowe2;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class buyProductSteps {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
  }

  @Test
  public void testZadaniekoncowe2() throws Exception {
    driver.get("https://prod-kurs.coderslab.pl/index.php");
    driver.findElement(By.xpath("//div[@id='_desktop_user_info']/div/a/span")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("rys.adam@zabka.pl");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("Polopolop1!");
    driver.findElement(By.id("login-form")).submit();
    driver.findElement(By.name("s")).click();
    driver.findElement(By.name("s")).clear();
    driver.findElement(By.name("s")).sendKeys("Hummingbird Printed Sweater");
    driver.findElement(By.name("s")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//img[@alt='Brown bear printed sweater']")).click();
    driver.findElement(By.id("group_1")).click();
    new Select(driver.findElement(By.id("group_1"))).selectByVisibleText("M");
    driver.findElement(By.id("quantity_wanted")).click();
    driver.findElement(By.id("quantity_wanted")).clear();
    driver.findElement(By.id("quantity_wanted")).sendKeys("5");
    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    driver.findElement(By.linkText("Proceed to checkout")).click();
    driver.findElement(By.linkText("Proceed to checkout")).click();
    driver.findElement(By.name("confirm-addresses")).click();
    driver.findElement(By.name("confirmDeliveryOption")).click();
    driver.findElement(By.id("payment-option-1")).click();
    driver.findElement(By.id("conditions_to_approve[terms-and-conditions]")).click();
    driver.findElement(By.xpath("(//button[@type='submit'])[9]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
