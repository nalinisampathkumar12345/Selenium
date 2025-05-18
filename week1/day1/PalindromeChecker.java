package week1.day1;

public class PalindromeChecker {

    public static void main(String[] args) {
        int input = 121;       
        int original = input;  
        int output = 0;        

       
        for (int i = input; i > 0; i = i / 10) {
            int rem = i % 10;             // Get last digit
            output = (output * 10) + rem; // Build reversed number
        }

       
        if (original == output) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}
