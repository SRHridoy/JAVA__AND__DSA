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

        if((a++==10)|(b++==10))
        {
            System.out.println(a+"  "+b);
        }

        
    }
}
