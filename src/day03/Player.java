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
    void addGold(int amount) {
        gold += amount;
    }
    void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            health = 0;
        }
    }
    boolean isAlive() {
        if (health > 0) {
            return true;
        }
        else  {
            return false;
        }
    }
}
