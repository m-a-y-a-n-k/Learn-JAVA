public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        // arithmetic
        int sum = a + b;
        int minus = a - b;
        int mul = a * b;
        int divide = a / b;
        int rem = a % b;
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(mul);
        System.out.println(divide);
        System.out.println(rem);
        // increment , decrement
        a += 2;
        --b;
        // comparison
        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        // logical
        System.out.println(a > 0 && b > 0);
        System.out.println(a > b || b > a * b || a > a * b);
        // bitwise
        System.out.println(a&b);
        System.out.println(a|b);
        // decimal remainder
        System.out.println(4.5%0.6);
    }
}