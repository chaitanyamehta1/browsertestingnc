package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Chrome {
    public static void main(String[] args) {
        String baseurl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseurl);
        String title = driver.getTitle();
        System.out.println("Main Page"+ title);
        driver.quit();
    }
}
