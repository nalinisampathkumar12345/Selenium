package week4.day1;


//SuperClass
public class OverriddingCalss {

 public void takeSnap() {
     System.out.println("SuperClass: Taking a snapshot");
 }

 public void reportStep(String msg, String status) {
     System.out.println("SuperClass Report:");
     System.out.println("Message: " + msg);
     System.out.println("Status: " + status);
     System.out.println("----------------------------");
 }
}


class SubClass extends OverriddingCalss {

 @Override
 public void takeSnap() {
     System.out.println("SubClass: Taking a high resolution snapshot ");
 }


 public static void main(String[] args) {
    //Super class
	 OverriddingCalss superObj = new OverriddingCalss();
     superObj.takeSnap();  
     superObj.reportStep("Login attempt", "PASS");

   // Subclass
     SubClass subObj = new SubClass();
     subObj.takeSnap();    
     subObj.reportStep("Click button", "FAIL");  
 }

}
