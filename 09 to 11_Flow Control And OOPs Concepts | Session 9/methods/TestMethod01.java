package methods;

public class TestMethod01 {

    public static void main(String[] args) {
        TestMethod01 t = new TestMethod01();
        t.iman();
        //if we don't iman() as static then this work otherwise doesn't work.
        // ..then we have to use onlu iman() without creating object of the
        // class.
    }

    public void iman()
    {
        System.out.println("Iman is the 1st pillar of Islam");
    }
}
