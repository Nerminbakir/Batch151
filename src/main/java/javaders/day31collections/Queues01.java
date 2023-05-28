package javaders.day31collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        // Queue (kuyruk) ==> ilk giren ilk cıkar (first in first out)

        // Queue<String> wareHouse = new PriorityQueue<>(); constructor'ı iki sekilde secebiliriz. PriorityQueue<>(); LinkedList<>();

        Queue<String> wareHouse = new LinkedList<>();   // wareHouse = depo
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse); // [Milk, Meat, Bread, Egg, Cheese] LinkedList oldugu için insertion order'a göre sıraladı.

        wareHouse.remove();
        System.out.println(wareHouse); // [Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.peek()); // Meat (list boşsa null verir.)
        System.out.println(wareHouse); //[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.element()); // Meat  (list boşsa exception verir.)
        System.out.println(wareHouse); //[Meat, Bread, Egg, Cheese]

        System.out.println(wareHouse.poll()); // Meat
        System.out.println(wareHouse); //[Bread, Egg, Cheese]

        wareHouse.clear();
        System.out.println(wareHouse.poll()); // null
        System.out.println(wareHouse.remove()); // Exception
    }
}
