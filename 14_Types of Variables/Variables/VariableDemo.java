package Variables;

class  VariableTest
{
    int a = 10;//Instance variable
    public void Iman()
    {
        System.out.println("Iman is the 1st piller");
        System.out.println(a);
    }
    //sout kokhono method er baire use kora jai nah...
    //System.out.println(a);
}

public class VariableDemo {
    public static void main(String[] args) {
        VariableTest variableTest1 = new VariableTest();
        variableTest1.Iman();
        variableTest1.a = 2000;
        variableTest1.Iman();

        VariableTest variableTest2 = new VariableTest();
        variableTest2.Iman();
    }
}
