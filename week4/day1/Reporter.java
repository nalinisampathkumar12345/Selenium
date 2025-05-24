package week4.day1;

public class Reporter {

    // Overloaded method #1: accepts two String arguments
    public void reportStep(String msg, String status) {
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
        System.out.println("Snapshot: Not requested");
        System.out.println("--------------------------------");
    }

    // Overloaded method #2: accepts two Strings and a boolean
    public void reportStep(String msg, String status, boolean snap) {
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
        if (snap) {
            System.out.println("Snapshot: Taken");
        } else {
            System.out.println("Snapshot: Skipped");
        }
        System.out.println("--------------------------------");
    }

   
    public static void main(String[] args) {
        Reporter reporter = new Reporter();

        // Call the 2-argument version
        reporter.reportStep("Login to application", "PASS");

        // Call the 3-argument version
        reporter.reportStep("Click on Submit", "FAIL", true);
    }
}
