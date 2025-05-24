package week3.day1;

//Interface
interface DatabaseConnection {
 void connect();
 void disconnect();
 void executeUpdate();
}

//Concrete class
public class JavaConnection implements DatabaseConnection {

 @Override
 public void connect() {
     System.out.println("Connected to Java DB");
 }

 @Override
 public void disconnect() {
     System.out.println("Disconnected from Java DB");
 }

 @Override
 public void executeUpdate() {
     System.out.println("Update query executed in Java DB");
 }

 public static void main(String[] args) {
     JavaConnection db = new JavaConnection();
     db.connect();
     db.executeUpdate();
     db.disconnect();
 }
}
