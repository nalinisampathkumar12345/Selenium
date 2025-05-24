package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class CheckBoxTest {

    public static void main(String[] args) throws InterruptedException {


        ChromeDriver driver = new ChromeDriver();


        driver.get("https://leafground.com/checkbox.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

  
        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]")).click();
        WebElement notificationCheckBox = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt91_input']"));
        System.out.println("Notification checkbox selected: " + notificationCheckBox.isSelected());
        if (notificationCheckBox.isSelected()) {
            System.out.println("Notification checkbox is checked.");
        } else {
            System.out.println("Notification checkbox is not checked.");
        }

   
        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[1]")).click();
        WebElement basicCheckBox = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt89_input']"));
        if (basicCheckBox.isSelected()) {
            System.out.println("Basic checkbox is selected.");
        } else {
            System.out.println("Basic checkbox is not selected.");
        }

    
        driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]")).click();

      
        WebElement triStateCheckBox = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
        triStateCheckBox.click();
        String triStateStatus = driver.findElement(By.xpath("//p[contains(text(),'State')]")).getText();
        System.out.println("Tri-State checkbox status: " + triStateStatus);

     
        driver.findElement(By.className("ui-toggleswitch-slider")).click();
        Thread.sleep(2000);
        String toggleStatus = driver.findElement(By.xpath("//span[contains(text(),'Checked')]")).getText();
        System.out.println("Toggle status: " + toggleStatus);

   
        WebElement disabledCheckBox = driver.findElement(By.id("j_idt87:j_idt102_input"));
        if (disabledCheckBox.isEnabled()) {
            System.out.println("The checkbox is enabled.");
        } else {
            System.out.println("The checkbox is disabled.");
        }

    
        driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
        driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
        driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
        driver.findElement(By.className("ui-icon-circle-close")).click();


        driver.quit();
    }
}
