package Variables;

class LocalTest
{
    public void printLocal()
    {
        String s = "DSA With Java";//Local variable ...
        System.out.println(s);
    }
}

public class LocalVariableDemo {

    public static void main(String[] args) {
        LocalTest l1 = new LocalTest();
        l1.printLocal();
    }
}

