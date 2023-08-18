class ternary {
    public static void main(String[] args) {
        int x = 10;
        int y = 2;
        int max = (x>y)? x:y;
        System.out.println(max);

        int a = 5, b = 10, c = 15;
        int res = (a>b) ?(c>b)? c:b:(c>a)?c:a;
        System.out.println(res);
    }
}