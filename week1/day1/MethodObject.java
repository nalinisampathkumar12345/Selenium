package week1.day1;

public class MethodObject {

   
    public String addBook(String bookTitle) {
        System.out.println("Book added successfully");
        return bookTitle;
    }

    
    public void issueBook() {
        System.out.println("Book issued successfully");
    }

   
    public static void main(String[] args) {
    	MethodObject lib = new MethodObject();
        String title = lib.addBook("Java Programming");
        System.out.println("Added Book: " + title);
        lib.issueBook();
    }
}
