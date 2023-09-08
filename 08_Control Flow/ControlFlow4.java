public class ControlFlow4 {
    public static void main(String[] args) {
        int a = 10;
        //NESTED IF ELSE :
        if (a==10)
        {
            System.out.println("a==10");
            if(a<100)
            {
                System.out.println("Yes less than 100");
                if (a%2==0)
                {
                    System.out.println("even");
                    if(a>10)
                    {
                        System.out.println("No");
                    }
                    else
                    {
                        System.out.println("Yes");
                        if(a>2)
                        {
                            System.out.println("Yes a is greater than 2");
                            if(a%2!=0)
                            {
                                System.out.println("Odd");
                            }
                            else
                            {
                                System.out.println("Yes");
                                if (a==10)
                                {
                                    System.out.println("THE END");
                                }
                            }
                        }
                    }
                }
            }
            else
            {
                System.out.println("a is greater than 100");
            }
        }
    }
}
