package arrayBasics;

public class ArrayProg1 {

    public static void main(String[] args) {
        //int type array
        //declare
        //initialization

        int arr[];
        //int []arr; Same...

        //int arr[] = {10, 11, 12, 13}//Not Recommended...
        arr = new int [5];//Sobgula 0 dara initialize hobe...
        //Fetch :
        System.out.println(arr[3]);//O(1)
        //Insert:
        arr[3] = 99;//O(1)
        System.out.println(arr[3]);

        System.out.println(arr.length);

        System.out.println(arr);
    }
}
