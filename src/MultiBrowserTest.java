import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("wrong browser");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        //Give the implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Print the current URL
        System.out.println("current URL :" + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source :" + driver.getPageSource());
        //Enter the username to username field
        driver.findElement(By.id("user-name")).sendKeys("patel1234@gmail.com");
        //Enter the Password to the password field
        driver.findElement(By.name("password")).sendKeys("abc1234");
        //Close the browser
        driver.close();


    }
}