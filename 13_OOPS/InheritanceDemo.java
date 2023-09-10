class Dhani//Parent
{
    //Final use korle change kora jai nah pore...orthat override hoi nah...
   // final int a = 10;
    int a = 10;
    public void house()
    {
        System.out.println("Parents Normal House");
    }
}
//Child
class DhaniKaBeta extends Dhani
{
    public void house()
    {
        System.out.println("Modified Child House");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        Dhani dhani = new Dhani();
        dhani.house();

        DhaniKaBeta dhaniKaBeta = new DhaniKaBeta();
        dhaniKaBeta.house();
        System.out.println(dhaniKaBeta.a);
        dhaniKaBeta.a = 20;
        System.out.println(dhaniKaBeta.a);

    }
}

