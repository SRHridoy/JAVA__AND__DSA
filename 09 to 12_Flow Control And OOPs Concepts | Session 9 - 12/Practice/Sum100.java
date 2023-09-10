package Practice;
//Write a Java method that calculates the sum of all
// numbers from 1 to 100 using a while loop.
public class Sum100 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i<=100)
        {
            sum+=i;
            i++;
        }
        System.out.println("The sum from 1 to 100 is : "+sum);
    }
}
