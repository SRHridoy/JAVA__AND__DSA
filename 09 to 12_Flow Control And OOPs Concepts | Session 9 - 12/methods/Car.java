package methods;

public class Car {

    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.accelerate();
        car.horn();
        car.stopEngine();
    }

    public void startEngine()
    {
        System.out.println("Engine is Started...");
    }

    private void stopEngine()
    {
        System.out.println("Engine is Stopped...");
    }

    protected void accelerate()
    {
        System.out.println("Car is Running");
    }
    void horn()
    {
        System.out.println("Peeep peeeep peeep");
    }
}
