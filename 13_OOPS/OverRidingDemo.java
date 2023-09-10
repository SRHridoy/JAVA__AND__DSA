class OverRiding{

    //Also possible overriding but if private doesn't work...
    /*protected void printDone()
    {
        System.out.println("Done");
    }*/
    public void printDone()
    {
        System.out.println("Done");
    }
}

class OverRidingTest extends OverRiding{
    public void printDone()
    {
        System.out.println("This is done + done from child ");
    }
}

public class OverRidingDemo {

    public static void main(String[] args) {
        //Complite Time Poly:
        OverRiding overRiding = new OverRiding();
        overRiding.printDone();

        //Runtime Poly:
        OverRidingTest overRidingTest = new OverRidingTest();
        overRidingTest.printDone();

        OverRiding p = new OverRidingTest();
        p.printDone();

    }
}
