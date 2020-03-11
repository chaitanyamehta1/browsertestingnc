package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class IE {
    public static void main(String[] args) {
        String baseurl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.ie.driver", "driver/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseurl);
        String title = driver.getTitle();
        System.out.println("Main Page" + title);
        driver.quit();
    }
}
