package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadAutomation {
    public static void main(String[] args) {

   
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nalini Sampathkumar\\Downloads\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        try {
   
            driver.get("http://leaftaps.com/opentaps/");
            driver.manage().window().maximize();

            driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
            driver.findElement(By.id("password")).sendKeys("crmsfa");
            driver.findElement(By.className("decorativeSubmit")).click();

            driver.findElement(By.linkText("CRM/SFA")).click();

      
            driver.findElement(By.linkText("Leads")).click();

        
            driver.findElement(By.linkText("Create Lead")).click();

  
            driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Inc");
            driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John");
            driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Doe");
            driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation Engineer");

   
            driver.findElement(By.className("smallSubmit")).click();

  
            WebElement titleElement = driver.findElement(By.id("viewLead_generalProfTitle_sp"));
            String displayedTitle = titleElement.getText();

            if (displayedTitle.equals("Automation Engineer")) {
                System.out.println("Lead created successfully with Title: " + displayedTitle);
            } else {
                System.out.println("Lead creation failed or Title mismatch.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
       
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

  
            driver.quit();
        }
    }
}
