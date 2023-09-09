package methods;

public class AddNum {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int result = addNumbers(x,y);
        System.out.println(result);
//Using publicly decleared method from different place :
        //Public method call:
        iman i = new iman();
        i.printIman();

        //Private method call:
        ModifiersTest m = new ModifiersTest();
        //m.printHello(); kaj korbe nah...
    }

    public static int addNumbers(int a, int b)
    {
        return  a+b;
    }
}
