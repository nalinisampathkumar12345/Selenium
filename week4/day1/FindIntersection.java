package week4.day1;

import java.util.ArrayList;
import java.util.List;


public class FindIntersection {
	
	
	 
	 public static void main(String[] arg)
	 {
		 int[] arr1 = {3, 2, 11, 4, 6, 7};
		 int[] arr2 =  {1, 2, 8, 4, 9, 7};
		 List<Integer> list1 = new ArrayList<Integer>();
		 
	     for (int num : arr1) {
	         list1.add(num);
	     }
	
	     // Convert second array to list
	     List<Integer> list2 = new ArrayList<Integer>();
	     for (int num : arr2) {
	         list2.add(num);
	     }
	 }

}
