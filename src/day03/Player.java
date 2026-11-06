package day03;

public class Player {
    String name;
    int health;
    int gold;

    Player (String name) {
        this.name = name;
        this.health = 100;
        this.gold = 0;
    }
    void printInfo() {
        System.out.println(this.name + ": здоровье " + this.health + ", золото " + this.gold);
    }

    // TODO 2: метод printInfo() без static, который печатает
    // строку вида: Steve: здоровье 100, золото 0
}
