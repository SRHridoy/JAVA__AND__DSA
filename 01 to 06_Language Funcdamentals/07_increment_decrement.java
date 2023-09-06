class IncDec
{
    public static void main(String[] args)
    {
        //Increment : 
        int a = 10;
        System.out.println(a);//10
        System.out.println(a++);//Post-increment//10
        System.out.println(++a);//Pre-increment//12
        System.out.println(a--);//Post-decrement//12
        System.out.println(--a);//Pre-decrement//10

        int b = 5;
        System.out.println((++b-++b));//-1

        //BODMAS applied : 
        int c = 5;
        System.out.println((--c+--c)*(++c-c--)+(c+++--c)*(++c+c--));
    }
}