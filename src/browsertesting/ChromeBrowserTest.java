package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

/**
 * Project-1 - Project Name: com-nopcommerce
 * BaseUrl =
 * https://demo.nopcommerce.com/login?returnUrl=%2F
 * 1. Setup chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
public class ChromeBrowserTest {
    public static void main(String[] args) {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";
        // Launch the chrome browser
        WebDriver drive = new ChromeDriver();
        // open the url into the browser
        drive.get(baseUrl);

        // get the title of the page
        String title= drive.getTitle();
        System.out.println(title);

        // implicit wait to driver
       drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));

        // get the current URL
        drive.getCurrentUrl();

        // print current url
        System.out.println("CurrentUrl :" + drive.getCurrentUrl());

        // print the page source
        System.out.println("Page source :" + drive.getPageSource());

        // find the email
         WebElement emailField =drive.findElement(By.id("Email"));
         emailField.sendKeys("Prime123@gmail.com");

         // Enter the password field
         drive.findElement(By.name("Password")).sendKeys("Prime123");

         // close the browser
          drive.close();





    }

}
