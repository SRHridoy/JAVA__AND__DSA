package methods;

public class ModifiersTest {
    public static void main(String[] args) {
        printHello();
    }
    private static void printHello()
    {
        System.out.println("Hello from private");
    }
}

class TestModi{

    public void callHello()
    {
        ModifiersTest m = new ModifiersTest();
        //m.printHello(); Not possible
    }
}