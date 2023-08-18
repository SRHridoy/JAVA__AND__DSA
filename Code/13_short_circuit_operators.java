class short_circuit_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        if((a++==10)|(b++==10))
        {
            System.out.println(a+"  "+b);
        }
    }
}
