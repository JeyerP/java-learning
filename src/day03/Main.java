package day03;

public class Main {
    public static void main(String[] args) {
        Player steve = new Player("Steve");
        Player alex = new Player("Alex");

        steve.printInfo();
        alex.printInfo();

        steve.gold = 50;
        steve.printInfo();
        alex.printInfo();
    }
}