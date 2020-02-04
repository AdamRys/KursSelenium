package przyklad1;

import java.util.List;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class KatalonFormularz {
  private WebDriver driver;


  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
  }

  @Test
  public void testKatalonFormularz() throws Exception {
    driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");

    WebElement firstName =driver.findElement(By.id("first-name"));
    firstName.clear();
    firstName.sendKeys("Jan");

    WebElement lastName =driver.findElement(By.id("last-name"));
    lastName.clear();
    lastName.sendKeys("Kowalski");

    List<WebElement> genders = driver.findElements(By.name("gender"));
    genders.get(0).click();

    WebElement dateOfBirth = driver.findElement(By.id("dob"));
    dateOfBirth.clear();
    dateOfBirth.sendKeys("01/01/2010");

    WebElement address = driver.findElement(By.id("address"));
    address.clear();
    address.sendKeys("Prosta 1");

    WebElement email = driver.findElement(By.id("email"));
    email.clear();
    email.sendKeys("niepodam@niepodam.pl");

    WebElement pass = driver.findElement(By.id("password"));
    email.clear();
    email.sendKeys("Pass123");

    WebElement company = driver.findElement((By.id("company" +
            "")));
    company.clear();
    company.sendKeys("comment");

    WebElement submitButton = driver.findElement(By.id("submit"));
    submitButton.click();




//    driver.findElement(By.id("first-name")).click();
//    driver.findElement(By.id("first-name")).clear();
//    driver.findElement(By.id("first-name")).sendKeys("Karol");
//    // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
//    driver.findElement(By.id("last-name")).click();
//    driver.findElement(By.id("last-name")).clear();
//    driver.findElement(By.id("last-name")).sendKeys("Kowalski");
//    // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
//    driver.findElement(By.name("gender")).click();
//    driver.findElement(By.id("dob")).click();
//    driver.findElement(By.id("dob")).clear();
//    driver.findElement(By.id("dob")).sendKeys("05/22/2010");
//    // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
//    driver.findElement(By.id("address")).click();
//    driver.findElement(By.id("address")).clear();
//    driver.findElement(By.id("address")).sendKeys("Prosta 51");
//    // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
//    driver.findElement(By.id("email")).clear();
//    driver.findElement(By.id("email")).sendKeys("karol.kowalski@mailinator.com");
//    // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
//    driver.findElement(By.id("password")).click();
//    driver.findElement(By.id("password")).clear();
//    driver.findElement(By.id("password")).sendKeys("Pass123");
//    // ERROR: Caught exception [unknown command [echo ]]
//    // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
//    driver.findElement(By.id("company")).click();
//    driver.findElement(By.id("company")).clear();
//    driver.findElement(By.id("company")).sendKeys("CodersLab");
//    System.out.println("foteczka cyk");
//    // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
//    driver.findElement(By.id("role")).click();
//    new Select(driver.findElement(By.id("role"))).selectByVisibleText("QA");
//    driver.findElement(By.id("infoForm")).click();
//    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | id=expectation | label=Challenging]]
//    driver.findElement(By.xpath("//select[@id='expectation']/option[6]")).click();
//    driver.findElement(By.xpath("//input[@value='']")).click();
//    driver.findElement(By.id("comment")).click();
//    driver.findElement(By.id("comment")).clear();
//    driver.findElement(By.id("comment")).sendKeys("To mój pierwszy automat testowy");
//    System.out.println("foteczka cyk");
//    // ERROR: Caught exception [ERROR: Unsupported command [captureEntirePageScreenshot |  | ]]
//    driver.findElement(By.id("submit")).click();
//    assertEquals("Successfully submitted!", driver.findElement(By.id("submit-msg")).getText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();

    }
  }

