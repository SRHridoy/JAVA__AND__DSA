package Practice;
//9.Design a function to find the
// largest of three given integers using nested if statements.
public class LargestAmongThree {
    public static void main(String[] args) {
        int a = 10, b = 30, c = 50;
        largest(a,b,c);
    }

    public static void largest(int a, int b, int c)
    {
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is greater than "+b+" and "+c);
            }
            else
            {
                System.out.println(c+" is greater than "+b+" and "+c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" is greater than "+a+" and "+c);
            }
            else
            {
                System.out.println(c+" is greater than "+a+" and "+b);
            }
        }
    }
}
