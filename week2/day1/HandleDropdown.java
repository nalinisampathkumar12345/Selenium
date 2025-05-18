package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

    public static void main(String[] args) {

        // Set up the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Load the URL
        driver.get("http://leaftaps.com/opentaps/");
        driver.manage().window().maximize();

        // Enter username and password
        driver.findElement(By.id("username")).sendKeys("demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");

        // Click on Login
        driver.findElement(By.className("decorativeSubmit")).click();

        // Click CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        // Click Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // Click Create Lead
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter mandatory fields
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("John");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Doe");

        // Handle dropdown: Source (select by index)
        WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select sourceSelect = new Select(sourceDropdown);
        sourceSelect.selectByIndex(2); // e.g., "Employee"

        // Handle dropdown: Marketing Campaign (select by visible text)
        WebElement marketingDropdown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select marketingSelect = new Select(marketingDropdown);
        marketingSelect.selectByVisibleText("Automobile");

        // Handle dropdown: Ownership (select by value)
        WebElement ownershipDropdown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select ownershipSelect = new Select(ownershipDropdown);
        ownershipSelect.selectByValue("OWN_CCORP"); // "Corporation"

        // Click Create Lead
        driver.findElement(By.name("submitButton")).click();

        // Verify title
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        // Close the browser
        driver.close();
    }
}
