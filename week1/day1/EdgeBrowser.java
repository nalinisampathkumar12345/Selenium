package week1.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EdgeBrowser {

    public static void main(String[] args) {
        
        // Set the path to your ChromeDriver executable if not already in system PATH
  

     
        WebDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/control/login");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Get and print the title of the page
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Close the browser
        driver.close();
    }
}