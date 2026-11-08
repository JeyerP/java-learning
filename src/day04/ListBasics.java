package day04;

import java.util.ArrayList;

public class ListBasics {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Steve");
        names.add("Alex");
        names.add("Notch");
        names.add("Herobrine");
        System.out.println("Игроков: " + names.size());
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("Алекс в списке: " + names.contains("Alex"));
        names.remove("Alex");
        System.out.println("После удаления: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
