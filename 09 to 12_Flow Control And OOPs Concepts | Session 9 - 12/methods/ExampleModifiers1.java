package methods;

public class ExampleModifiers1 {

    public void printDog()
    {
        //This method accessible from anywhere.
    }

    private void printCat()
    {
        //This method accessible from within class.
    }

    protected void printCar()
    {
        //This method accessible from package + subclass.
    }

    void printHuman()
    {
        //This method accessible from same package.
    }
}
