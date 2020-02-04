package zadanieDodatkowe1;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyStore1 {
  private WebDriver driver;
  public String[] products=new String[]{"mug","t-shirt","notebook","frame"};

  Random random = new Random();
  int randomInteger = random.nextInt(50);

  int productsId=randomInteger%(products.length);

  @Before
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMyStore1() throws Exception {
    driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
    WebElement search = driver.findElement(By.name("s"));
    search.clear();
    search.click();
    search.sendKeys(products[productsId]);
    search.submit();
   // WebElement submitButton = driver.findElement(By.)
  }
  @After
  public void tearDown() throws Exception {
    driver.quit();

    }

}
