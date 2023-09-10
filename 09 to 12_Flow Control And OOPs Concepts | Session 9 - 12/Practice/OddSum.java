package Practice;
//Create a Java method that calculates the sum of all
// odd numbers between 1 and 50 using a for loop.

public class OddSum {

    public static void main(String[] args) {
        oddSum();
    }

    static void oddSum()
    {
        int sum = 0;
        for (int i = 1; i <= 50; i+=2) {
            sum+=i;
        }
        System.out.println("The odd sum is : "+sum);
    }
}
