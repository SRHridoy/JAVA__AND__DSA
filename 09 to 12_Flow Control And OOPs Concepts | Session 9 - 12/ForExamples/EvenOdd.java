package ForExamples;

public class EvenOdd {
    public static void main(String[] args) {
        int i = 10;
        for (int j = 0; j <= i; j++) {

            if(j%2==0)
            {
                System.out.println("Even "+j);
            }
            else
            {
                System.out.println("Odd "+j);
            }
        }
    }
}
