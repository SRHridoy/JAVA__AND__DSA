class ternary {
    public static void main(String[] args) {
    
        System.out.println("------------------");
        int x = 10;
        int y = 2;
        int max = (x>y)? x:y;
        System.out.println(max);

        System.out.println("------------------");
        int m = 10,n = 5;
        String s = (m>n) ? "hello" : "Java";
        System.out.println(s);

        System.out.println("------------------");
        int a = 5, b = 10, c = 15;
        int res = (a>b) ?(c>b)? c:b:(c>a)?c:a;
        System.out.println(res);

        System.out.println("------------------");
        int p = 7, q = 3, r = 5;
        int result = p < q? p > r? p : r : q;// p > q false tai p > r execute e hobe nah ans hobe q = 3; orthat p > q er jonne if holo(p > r? p : r) ar else holo (q) tai jehutu false tai q hobe...
        System.out.println(result);

        System.out.println("------------------");
        int f = 35, g = 6, h = 34;
        int rr = (f > g) ? (h > b)?h:g:(h>f)?h:f;
        System.out.println(rr);
        // ekahne (f > g) er jonne
                           // if holo (h > b)?h:g
                           //else holo (h>f)?h:f


    }
}