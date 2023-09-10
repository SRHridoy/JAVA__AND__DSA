package Practice;

import java.util.Scanner;

//Write a Java function to print the Fibonacci series up
// to the nth term using a while loop.
public class FibonacchiSeries {
    public static void fibonacci(int n)
    {
        long a = 0;
        long b = 1;
        int count = 0;

        while (count<n)
        {
            System.out.println(a + " ");

            long next = a + b;
            a = b;
            b = next;
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        fibonacci(n);
    }
}
