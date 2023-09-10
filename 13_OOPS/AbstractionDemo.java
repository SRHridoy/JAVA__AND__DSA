
abstract class  AbstractionTest
{
    //Abstract method holo tara jader implementation child e thake...
    //kono class k abstract korar mane holo at least 1ta method abstract hobe...
    //concreate method o thakte pare...
    abstract int sum();
}

class Test extends AbstractionTest
{
    @Override
    int sum() {
        System.out.println("Hello Sum");
        return 10;
    }
    //eta create korar stahe stahei bolbe method implement korte but na korle
    // etakeo abstract class banate hobe...
}

public class AbstractionDemo {

    public static void main(String[] args) {
        Test t = new Test();
        int res = t.sum();
        System.out.println(res);

    }
}
