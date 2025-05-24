package week4.day1;

import java.util.*;

public class SecondLargestFinder 
{
    public static void main(String[] args) 
    {
      
        Integer[] arr = {3, 2, 11, 4, 6, 7};

    
        List<Integer> numList = Arrays.asList(arr);

  
        Collections.sort(numList);


        int secondLargest = numList.get(numList.size() - 2);


        System.out.println("The second largest number is: " + secondLargest);
    }
}
