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
        players.get(1).addGold(25);
        System.out.println("Самый богатый: " + findRichest(players).name);
    }
    static int countAlive(ArrayList<Player> players) {
        int alive = 0;
        for (Player player : players) {
            if (player.isAlive()) {
                alive++;
            }
        }
        return alive;
    }

    static Player findRichest(ArrayList<Player> players) {
        Player best = players.get(0);
        for (Player player : players) {
            if (player.gold > best.gold) {
                best = player;
            }
        }
        return best;
    }
}
