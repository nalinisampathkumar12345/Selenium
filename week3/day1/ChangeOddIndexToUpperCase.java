package week3.day1;

public class ChangeOddIndexToUpperCase {
    public static void main(String[] args) {


        String test = "changeme";

        char[] charArray = test.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {

            if (i % 2 != 0) {
    
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }


        System.out.print("Result: ");
        for (char ch : charArray) {
            System.out.print(ch);
        }
    }
}
