package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FacebookRegistrationAutomation {
    public static void main(String[] args) {

 
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nalini Sampathkumar\\Downloads\\chromedriver.exe");

   
        WebDriver driver = new ChromeDriver();

        try {
    
            driver.get("https://en-gb.facebook.com/");
            driver.manage().window().maximize();

     
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    
            driver.findElement(By.linkText("Create new account")).click();


            driver.findElement(By.name("firstname")).sendKeys("John");

   
            driver.findElement(By.name("lastname")).sendKeys("Doe");


            driver.findElement(By.name("reg_email__")).sendKeys("johndoe@example.com");

   
            Thread.sleep(1000); 

        
            driver.findElement(By.id("password_step_input")).sendKeys("MySecurePassword123");

       
            WebElement dayDropdown = driver.findElement(By.id("day"));
            new Select(dayDropdown).selectByValue("10");

          
            WebElement monthDropdown = driver.findElement(By.id("month"));
            new Select(monthDropdown).selectByVisibleText("May");

        
            WebElement yearDropdown = driver.findElement(By.id("year"));
            new Select(yearDropdown).selectByVisibleText("1995");

  
            WebElement genderMale = driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input"));
            genderMale.click();

            System.out.println("Form filled successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}
