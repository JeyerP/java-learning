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

    public static void main(String[] args) {
        System.out.println(max(3, 8));    // 8
        System.out.println(max(10, 2));   // 10
        System.out.println(max(5, 5));    // 5
        System.out.println(max(-4, -9));  // -4
    }
}
