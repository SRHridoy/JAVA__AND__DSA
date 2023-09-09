package ForExamples;

import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {
        /*int a = 1;
        while (a<=10)
        {
            System.out.println("a value = "+a);
            a++;
        }*/

        int i = 2;
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        while(i<=input)
        {
            System.out.println(i);
            i+=2;
        }
    }
}
