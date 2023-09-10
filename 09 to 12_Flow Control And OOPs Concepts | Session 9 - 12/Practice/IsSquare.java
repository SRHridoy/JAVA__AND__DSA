package Practice;

import java.util.Scanner;

//Create a method that checks whether a given number is a perfect square
// using a loop.
public class IsSquare {

    public static boolean isSquare(int n){
        if(n<0)
        {
            return false;
        }
        for (int i = 0; i * i <= n; i++) {
            if(i * i == n)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        boolean isPerfect = isSquare(n);
        if(isPerfect)
        {
            System.out.println(n+" is a perfect Square.");
        }
        else
        {
            System.out.println(n+" is not a perfect Square.");
        }
    }

}
