package week3.day1;


//Superclass
public class TestData {

 public void enterCredentials() {
     System.out.println("Entering user credentials...");
 }

 public void navigateToHomePage() {
     System.out.println("Navigating to home page...");
 }
}

//Subclass
class LoginTestData extends TestData {

 public void enterUsername() {
     System.out.println("Username entered.");
 }

 public void enterPassword() {
     System.out.println("Password entered.");
 }

 public static void main(String[] args) {
     // Creating object of superclass
     TestData test = new TestData();
     test.enterCredentials();
     test.navigateToHomePage();

     System.out.println("----");

     // Creating object of subclass
     LoginTestData login = new LoginTestData();
     login.enterCredentials();     // inherited from TestData
     login.navigateToHomePage();   // inherited from TestData
     login.enterUsername();        // defined in LoginTestData
     login.enterPassword();        // defined in LoginTestData
 }
}
