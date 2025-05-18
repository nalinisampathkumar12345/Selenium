package week3.day1;

//Interface
interface DatabaseConnectionForAbstract {
 void connect();
 void disconnect();
 void executeUpdate();

}

//Abstract class
abstract class MySqlConnection implements DatabaseConnection {

 abstract void executeQuery();
}

//Concrete class
public class JavaConnectionAbstract extends MySqlConnection {

 @Override
 public void connect() {
     System.out.println("Connected to MySQL DB");
 }

 @Override
 public void disconnect() {
     System.out.println("Disconnected from MySQL DB");
 }

 @Override
 public void executeUpdate() {
     System.out.println("Update executed in MySQL DB");
 }

 @Override
 public void executeQuery() {
     System.out.println("Query executed in MySQL DB");
 }

 public static void main(String[] args) {
	 JavaConnectionAbstract conn = new JavaConnectionAbstract();
     conn.connect();
     conn.executeQuery();
     conn.executeUpdate();
     conn.disconnect();
 }
}
