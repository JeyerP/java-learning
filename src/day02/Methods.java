package day02;

public class Methods {
    static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    static void printMultiplicationTable(int n ) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
    static int max(int a, int b, int c) {
        int biggerOfBC = max(b, c);
        if (a > biggerOfBC) {
            return a;
        } else  {
            return biggerOfBC;
        }
    }
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isPrime(i)) {
            System.out.println(i);}
        }
    }
}
