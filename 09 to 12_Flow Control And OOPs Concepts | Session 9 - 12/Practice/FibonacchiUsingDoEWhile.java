package Practice;

import java.util.Scanner;

//Implement a program that calculates
// and prints the factorial of a number using a do-while loop.
public class FibonacchiUsingDoEWhile {

    public static void Fib(int n)
    {
        long a = 0;
        long b = 1;
        int count = 0;

        do{
            System.out.println(a+" ");
            long next = a + b;
            a = b;
            b = next;
            count++;
        }while (count<n);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Fib(n);
    }

}
