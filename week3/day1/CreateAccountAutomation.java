package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountAutomation {

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

           
            driver.findElement(By.linkText("Accounts")).click();

           
            driver.findElement(By.linkText("Create Account")).click();

            
            driver.findElement(By.id("accountName")).sendKeys("MyTestAccount");

          
            driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");

           
            WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
            new Select(industryDropdown).selectByVisibleText("Computer Software");

           
            WebElement ownershipDropdown = driver.findElement(By.name("ownershipEnumId"));
            new Select(ownershipDropdown).selectByVisibleText("S-Corporation");

          
            WebElement sourceDropdown = driver.findElement(By.id("dataSourceId"));
            new Select(sourceDropdown).selectByValue("LEAD_EMPLOYEE");

            
            WebElement marketingDropdown = driver.findElement(By.id("marketingCampaignId"));
            new Select(marketingDropdown).selectByIndex(6); // eCommerce Site Internal Campaign

           
            WebElement stateDropdown = driver.findElement(By.id("generalStateProvinceGeoId"));
            new Select(stateDropdown).selectByValue("TX");

            
            driver.findElement(By.className("smallSubmit")).click();

           
            String createdAccountName = driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
            if (createdAccountName.contains("MyTestAccount")) {
                System.out.println("Account created successfully: " + createdAccountName);
            } else {
                System.out.println("Account creation failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            driver.quit();
        }
    }
}
