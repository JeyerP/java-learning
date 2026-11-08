package day03;

import java.util.ArrayList;

public class Arena {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Steve"));
        players.add(new Player("Alex"));
        players.add(new Player("Notch"));
        players.add(new Player("Herobrine"));
        for (Player player : players) {
            player.addGold(10);
            player.printInfo();
        }
        players.get(0).takeDamage(100);
        int alive = 0;
        for (Player player : players) {
            if (player.isAlive()) {
                alive++;
            }
        }
        System.out.println("Живых: " + alive);
        int totalGold = 0;
        for (Player player : players) {
            totalGold += player.gold;
        }
        System.out.println("Золота всего: " + totalGold);
    }
}
