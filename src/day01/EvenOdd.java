package day01;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }
}