package OOPS;

public class Account {

    public static void main(String[] args) {
        BalanceN b = new BalanceN();
        int bal = b.getX();
        System.out.println(bal);

        b.setX(2525);
        int bel1 = b.getX();
        System.out.println(bel1);
    }
}

class BalanceN
{
    private int x = 10000;

    public int getX() {
        //Validation
        return x;
    }

    public void setX(int x) {
        //Validation
        this.x = x;
    }

}