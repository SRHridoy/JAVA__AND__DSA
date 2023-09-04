class logi
{
    public static void main(String[] args)
    {
        boolean s1 = true;
        boolean s2 = false;

        System.out.println("______________Logical AND Operator_______________");
        //Sob gula true hole true...
        System.out.println(s1&s2);
        System.out.println(s1&s1);
        System.out.println(s2&s2);
        System.out.println(s2&s1);

        //Jekono ekta true hole true
        System.out.println("______________Logical OR Operator_______________");
        System.out.println(s1|s2);
        System.out.println(s1|s1);
        System.out.println(s2|s2);
        System.out.println(s2|s1);

        //2 tai same hole false ...
        System.out.println("______________Logical XOR Operator_______________");
        System.out.println(s1^s2);
        System.out.println(s1^s1);
        System.out.println(s2^s2);
        System.out.println(s2^s1);
    }
        
}