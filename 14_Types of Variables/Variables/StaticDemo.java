package Variables;

class StaticTest
{
    static int b = 2121;
    public void Demo()
    {
        System.out.println(b);
    }
    public static void Print()
    {
        System.out.println(b);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        StaticTest s1 = new StaticTest();
        s1.Demo();
        //Static variable k object diyeo access kora jai but eta best
        // practice nah...
        //s1.b = 20;
        StaticTest.b = 2000;
        StaticTest.Print();

        StaticTest s2 = new StaticTest();
        StaticTest.Print();
        s2.Demo();
    }
}
