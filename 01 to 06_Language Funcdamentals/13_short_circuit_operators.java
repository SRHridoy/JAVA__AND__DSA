class short_circuit_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        //Ekhane 2 tai compare hobe ...1st ta flase holeo ...2nd tao dekhbe
        if(a<6 & b>1)
        {
            System.out.println("True");
        }
        //Ekhane 1st ta false dekhlei ar porer ta dekhbe nah
        if(a<6 && b>1)
        {
            System.out.println("True");
        }
//Bitwise or: 
        int m = 30, n = 20;
        if(++m>30|++n>20)
        {
            m++;
        }
        else
        {
            n++;
        }
        System.out.println(m+"  "+n);// 32 21

//Shortcircuit or:
        int p = 30, q = 20;
        if(++p>30||++q>20)
        {
            p++;
        }
        else
        {
            q++;
        }
        System.out.println(p+"  "+q);// 32 20

        int x = 30, y = 20;
//first e if e dhuke ++x er jonne 31 then eta 30 er theke choto nah tai && er jonne ++y>20 check e hobe nah direct else e jabe o y++ kore 21 korbe...
        if(++x<30 && ++y>20)
        {
            x++;
        }
        else
        {
            y++;
        }
        System.out.println(x+ " " +y);//31 21

//But in this case :hudai check kore & porer ta tai eta time consuming...
        if(++x<30 & ++y>20)
        {
            x++;
        }
        else
        {
            y++;
        }
        System.out.println(x+ " " +y);//32 23
    }
}