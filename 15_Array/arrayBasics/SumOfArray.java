package arrayBasics;

public class SumOfArray {

    public static void main(String[] args) {

        int arr[] = {10, 20, 11, 12, 13, 14};
        //Sum Using for loop:
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
