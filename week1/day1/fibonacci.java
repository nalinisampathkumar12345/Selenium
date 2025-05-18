package week1.day1;

public class fibonacci {

   
    public void printFibonacci(int count) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series up to " + count + " terms: ");
        
        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args) {
    	fibonacci fib = new fibonacci(); 
        fib.printFibonacci(10); 
    }
}