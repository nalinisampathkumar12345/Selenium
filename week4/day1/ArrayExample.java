package week4.day1;



import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
       
        int[] data = {2, 5, 7, 7, 5, 9, 2, 3};

        
        Arrays.sort(data);

        System.out.println("Duplicate values in the array are:");

        
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] == data[i + 1]) {
               
                if (i == 0 || data[i] != data[i - 1]) {
                    System.out.println(data[i]);
                }
            }
        }
    }
}
