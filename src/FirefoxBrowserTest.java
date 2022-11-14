import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gheko.driver", "drivers/geckodriver.exe");

        //Object for firefox
        WebDriver driver = new FirefoxDriver();

        //Launch URL
        driver.get(baseUrl);

        //Maximise windows
        driver.manage().window().maximize();

        //We give implicit time to windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));

        //Get current URL
        System.out.println("Curent URL is:"+ driver.getCurrentUrl());

        //Get page source
        System.out.println("Page source is:"+ driver.getPageSource());

        //Find username link element
        WebElement userNameField = driver.findElement(By.id("user[email]"));

        //Type username address in username field
        userNameField.sendKeys("England123");

        //Find password link element
        WebElement passwordField = driver.findElement(By.name("user[password]"));

        //Type password in passwprd link
        passwordField.sendKeys("Chrome@123");

        //Close the window
        driver.close();

}
}
