package Practice;
//Implement a function to determine if a given integer is even or odd
// using an if-else statement.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number  :");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n%2==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
