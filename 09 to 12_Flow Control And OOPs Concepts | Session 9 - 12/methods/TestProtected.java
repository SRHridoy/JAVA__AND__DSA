package methods;

import testMethod.DemoPro;

public class TestProtected {
    public static void main(String[] args) {

        TestPro t = new TestPro();//Parent class object
        t.printPro();

        TestProAgain t1 = new TestProAgain();//Child Class object
        t1.printPro();

        DemoPro dempPro = new DemoPro();//Different package class object
        dempPro.printPro();
    }
}


