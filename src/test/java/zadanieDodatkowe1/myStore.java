package zadanieDodatkowe1;

import org.openqa.selenium.WebDriver;

import java.util.Random;

public class myStore {
    private WebDriver driver;
    public String[] products=new String[]{"mug","t-shirt","notebook","frame"};

    Random random = new Random();
    int randomInteger = random.nextInt(50);

    int productsId=randomInteger%(products.length);



}
