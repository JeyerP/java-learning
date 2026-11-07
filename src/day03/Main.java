package day03;

public class Main {
    public static void main(String[] args) {
        Player steve = new Player("Steve");
        Player alex = new Player("Alex");

        while (steve.isAlive() && alex.isAlive()) {
            steve.attack(alex, 12);
            alex.attack(steve, 9);
            steve.printInfo();
            alex.printInfo();
        }
        if (steve.isAlive()) {
            System.out.println("Steve победил!");
        } else if (alex.isAlive()) {
            System.out.println("Alex победил!");
        } else {
            System.out.println("Ничья!");
        }
    }
}