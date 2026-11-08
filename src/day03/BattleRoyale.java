package day03;

import java.util.ArrayList;
import java.util.Random;

public class BattleRoyale {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Steve"));
        players.add(new Player("Alex"));
        players.add(new Player("Notch"));
        players.add(new Player("Herobrine"));
        players.add(new Player("Jeb"));

        Random random = new Random();

        while (Arena.countAlive(players) > 1) {
            Player attacker = players.get(random.nextInt(players.size()));
            Player target = players.get(random.nextInt(players.size()));
            int damage = random.nextInt(16) + 5;

            if (attacker.isAlive() && target.isAlive() && attacker != target) {
                attacker.attack(target, damage);
                if (!target.isAlive()) {
                    System.out.println(target.name + " погиб");
                    attacker.addGold(10);
                }
            }
        }

        for (Player player : players) {
            player.printInfo();
        }
        for (Player player : players) {
            if (player.isAlive()) {
                System.out.println("Победитель:" + player.name);
            }
        }
        System.out.println("Самый богатый: " + Arena.findRichest(players).name);
    }
}
