package methods;

public class Animal {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeNoise();
    }
    protected void makeNoise()
    {
        System.out.println("Animal make noise...");
    }
}

class Dog extends Animal{

    protected void makeNoise()
    {
        System.out.println("Dog is barking...");
    }
}