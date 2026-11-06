package day03;

public class Main {
    public static void main(String[] args) {
        Player steve = new Player("Steve");

        steve.addGold(30);
        steve.addGold(20);
        steve.takeDamage(40);
        steve.printInfo();

        steve.takeDamage(100);
        steve.printInfo();
    }
}