class Practice
{
    public static void main(String[] args)
    {
        int a = 6;
        int b = ++a * 2 + a++  + --a - a--;
        // 7 * 2 = 14 + 7 = 21(a = 8) + 7 = 28 - 7 = 21...
        System.out.println(b);
        
        int x = 6;
        int y = x-- + --x + x++ - ++x;
        //6 + 4 + 4 - 6 = 8
        System.out.println(y);

        int q = 3;
        int q1 = q-- + q++ - --q * ++q + q--;
        //3 + 2 - 2 * 3 + 3 = 2
        // age jog biyog gun vag na kore only post ar pre calc kore then precedency onujai agaite hobe
        System.out.println(q1);

        int l = 10;
        int l1 = l-- * --l * l++ - l-- * l++;
        //10 * 8 * 8 - 9 * 8 = 640 - 72 = 568
        System.out.println(l1);

        int g = 4;
        int g1 = g-- / ++g * --g + g++ * g-- - --g / g++;
        //4 / 4 * 3 + 3 * 4 - 2 / 2 = 3 + 12 - 1 = 14
        System.out.println(g1);

    }
}