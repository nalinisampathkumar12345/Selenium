package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginAutomation {

    public static void main(String[] args) {
        // Setup the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Load Facebook
            driver.get("https://www.facebook.com/");

            // Maximize the window (do this *after* browser successfully opens)
            driver.manage().window().maximize();

            // Enter Email
            driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");

            // Enter Password
            driver.findElement(By.id("pass")).sendKeys("Tuna@321");

            // Click Login
            driver.findElement(By.name("login")).click();

            // Wait for 3 seconds
            Thread.sleep(3000);

            // Click on "Find your account and log in." link (use partialLinkText in case full text fails)
            driver.findElement(By.partialLinkText("Find your account")).click();

            // Get and print title
            String title = driver.getTitle();
            System.out.println("Current Page Title: " + title);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close browser
            driver.quit();
        }
    }
}
