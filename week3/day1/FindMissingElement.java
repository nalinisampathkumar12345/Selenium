package week3.day1;

import java.util.Arrays;

public class FindMissingElement {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 8, 6, 7};

        // Sort the array to make comparison easier
        Arrays.sort(arr);

        // Loop through the sorted array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current value matches its expected value (i + 1)
            if (arr[i] != i + 1) {
                System.out.println("The missing number is: " + (i + 1));
                return;
            }
        }

        // If no number is missing in sequence
        System.out.println("No number is missing in the expected sequence.");
    }
}

