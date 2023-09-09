package methods;

public class TestMethod {
    public static void main(String[] args) {
        dua();//Direct calling

        //Create object :
        iman i1 = new iman();
        i1.printIman();
    }

    //Example print ALLAH HU AKBER
//Non static method k static method call korte pare nah
    public static void dua() {
        System.out.println("ALLAH HU AKBER");
    }
}

//When we have methods in different class or package thenw we call the method
// using objects..
class iman{

    public void printIman()
    {
        System.out.println("Iman is the 1st piller");
    }
}


