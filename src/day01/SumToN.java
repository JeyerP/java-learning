package day01;

import java.util.Scanner;

public class SumToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи число: ");
        int n = scanner.nextInt();

        // способ 1: цикл for
        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }

        // способ 2: цикл while
        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }

        System.out.println("Сумма (for): " + sumFor);
        System.out.println("Сумма (while): " + sumWhile);
    }
}