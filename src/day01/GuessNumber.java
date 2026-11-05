package day01;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secret = random.nextInt(100) + 1; // число от 1 до 100
        int attempts = 0;
        int guess = 0;

        System.out.println("Угадай число от 1 до 100");

        while (guess != secret) {
            attempts++;
            System.out.print("Введи число: ");
            guess = scanner.nextInt();
            if (guess < secret) {
                System.out.println("Больше");
            } else if (guess > secret) {
                System.out.println("Меньше");
            } else {
                System.out.println("Вы угадали!");
            }
        }

        System.out.println("Угадал за " + attempts + " попыток!");
    }
}