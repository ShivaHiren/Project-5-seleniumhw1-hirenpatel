import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");

        //Object for edge
        WebDriver driver = new EdgeDriver();

        //Launch url
        driver.get(baseUrl);

        //Maximise window
        driver.manage().window().maximize();

        //WE give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));

        //Get the page title
        String title = driver.getTitle();
        System.out.println("Page title is:"+ title);

        //Get current url
        System.out.println("Current URL is:"+driver.getCurrentUrl());

        //Get page source
        System.out.println("Curret page source is:"+ driver.getPageSource());

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