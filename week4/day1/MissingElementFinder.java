package week4.day1;

import java.util.*;

public class MissingElementFinder {
    public static void main(String[] args) {
        // Step 1: Declare the array
        Integer[] arr = {1, 2, 3, 4, 10, 6, 8};

        // Step 2: Convert array to List
        List<Integer> numList = Arrays.asList(arr);

        // Step 3: Sort the list in ascending order
        Collections.sort(numList);

        // Step 4: Loop to find missing elements
        System.out.println("Missing numbers in the sequence:");
        for (int i = 0; i < numList.size() - 1; i++) {
            int current = numList.get(i);
            int next = numList.get(i + 1);

            // Check for a gap
            if (next != current + 1) {
                for (int missing = current + 1; missing < next; missing++) {
                    System.out.println(missing);
                }
            }
        }
    }
}
