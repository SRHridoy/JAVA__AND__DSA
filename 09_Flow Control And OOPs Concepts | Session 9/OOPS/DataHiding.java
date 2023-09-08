package OOPS;

public class DataHiding {
    public static void main(String[] args) {

        Balance b = new Balance();
        int balance = b.getX();
        System.out.println(balance);
    }
}

class Balance
{
    private int x = 10000;

    public int getX() {
        //Validation
        //Authorization
        return x;
    }

}