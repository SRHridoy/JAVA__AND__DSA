package arrayBasics;

import java.util.Scanner;

public class ArrayProg2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number for the index = "+i);
            int data = scan.nextInt();
            arr[i] = data;
        }

        display(arr);
    }

    public static void display(int arr[])
    {
        //for each loop:
        for (int a:arr)
        {
            System.out.println(a);
        }
    }
}
