package week4.day1;

import java.util.*;

public class CompanySorter {
    public static void main(String[] args) {
    
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

     
        List<String> companyList = Arrays.asList(companies);


        Collections.sort(companyList);

      
        System.out.println("Reversed sorted company names:");
        for (int i = companyList.size() - 1; i >= 0; i--) {
            System.out.println(companyList.get(i));
        }
    }
}
