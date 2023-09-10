package Practice;

import java.util.Scanner;
//1. Write a Java method to calculate the factorial of a given non-negative integer using a for loop.

class FactorialClass {
    void factorial(int n)
    {
        long mul = 1;
        for (int i = 1; i <= n; i++) {
            mul*=i;
        }
        System.out.println("The Factorial of "+n+" is "+mul);
    }
}

public class Fact extends FactorialClass{

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        FactorialClass factorialClass = new FactorialClass();
        factorialClass.factorial(n);

    }
}

