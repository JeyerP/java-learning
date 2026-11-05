package day02;

public class Methods {
    static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(7));
        System.out.println(isEven(0));
        System.out.println(isEven(-3));
    }
}
