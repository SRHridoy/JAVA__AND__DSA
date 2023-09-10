package Practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n+"X"+i+" = "+n*i);
        }
    }
}
