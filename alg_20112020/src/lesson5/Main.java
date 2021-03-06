package lesson5;

public class Main {
    public static void main(String[] args) {
//        System.out.println(fact(15));
        System.out.println(recFact(10));

//        System.out.println(fibo(46));
//        System.out.println(recFibo(10));

//        System.out.println(triangleNum(5));
//        System.out.println(recTriangleNum(5));

//        System.out.println(multiply(3, 8));
//        System.out.println(recMultiply(3, 8));

    }

    public static int fact(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value *= i;
        }
        return value;
    }

    public static int recFact(int n) {
        System.out.print(n + " ");
        if (n <= 1) {
            return 1;
        }
        return recFact(n - 1) * n;
    }

    public static long fibo(int n) {
        long a = 1;
        long b = 1;
        for (int i = 3; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }

    public static long recFibo(int n) {
        System.out.print(n + " ");
        if (n <= 2) {
            return 1;
        }
        return recFibo(n - 2) + recFibo(n - 1);
    }

    public static int triangleNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int recTriangleNum(int n) {
        if (n == 1) {
            return 1;
        }
        return recTriangleNum(n - 1) + n;
    }

    public static int multiply(int a, int b) {
        int value = 0;
        for (int i = 0; i < b; i++) {
            value += a;
        }
        return value;
    }

    public static int recMultiply(int a, int b) {
        if (b == 1) {
            return a;
        }
        return recMultiply(a, b - 1) + a;
    }


    public static int expo(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            a *= expo(a, n - 1);
        }

        return a;
    }

    private static double exponentiation(double value, int power) {
        if (value == 0 && power <= 0) {
            throw new ArithmeticException("Неопределённость");
        }
        if (power == 0) {
            return 1;
        } else if (power < 0) {
            return 1 / value * exponentiation(value, ++power);
        } else {
            return value * exponentiation(value, --power);
        }
    }

}
