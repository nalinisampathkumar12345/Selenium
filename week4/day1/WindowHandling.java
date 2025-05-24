package week4.day1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver (ensure chromedriver is in system PATH or specify path here)
        WebDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        // Maximize the browser
        driver.manage().window().maximize();

        // Add an implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Step 1: Login
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();

        // Step 2: Click on CRM/SFA
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Step 3: Click on Contacts
        driver.findElement(By.linkText("Contacts")).click();

        // Step 4: Click on Merge Contacts
        driver.findElement(By.linkText("Merge Contacts")).click();

        // Step 5: Click on widget of From Contact
        driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
        switchToNewWindow(driver);
        driver.findElement(By.xpath("//a[@class='linktext']")).click();
        driver.switchTo().defaultContent();

        // Step 6: Click on widget of To Contact
        driver.findElement(By.xpath("//input[@id='partyIdTo']/following-sibling::a")).click();
        switchToNewWindow(driver);
        driver.findElement(By.xpath("(//a[@class='linktext'])[2]")).click();
        driver.switchTo().defaultContent();

        // Step 7: Click Merge
        driver.findElement(By.className("buttonDangerous")).click();

        // Step 8: Accept the alert
        driver.switchTo().alert().accept();

        // Step 9: Verify the title
        String title = driver.getTitle();
        if (title.contains("View Contact")) {
            System.out.println("Merge successful. Page title: " + title);
        } else {
            System.out.println("Merge may have failed. Page title: " + title);
        }

        // Close browser
        driver.quit();
    }

    // Helper function to switch to new window
    private static void switchToNewWindow(WebDriver driver) {
        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(parent)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }
}
