package ForExamples;

public class Sum {

    public static void main(String[] args) {
        //Write a program to find the sum of natural numbers from 1 to 1000.
        int sum = 0;
        int number = 1000;
        for (int i = 1; i <= number; i++) {
            //sum = sum + i;
            sum+=i;
        }
        System.out.println("The sum is  : " +sum);
    }
}
