package javaders.day31collections;


import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

            Queue<String> line = new PriorityQueue<>(); // Priority;öncelik
            line.add("Milk");
            line.add("Meat");
            line.add("Egg");
            line.add("Orange");
            line.add("Tomatoes");
            System.out.println(line); // PriorityQueue (öncelik sırası) kullandıgımızda Java kendisi default olarak sıraladı.
                                     // Biz kendimizde bu sıralamayı yapabiliriz. Lambda dersinde detaylı görülecek.

            /* Queue bir interface'dir. Bu yuzden constructor'ı yoktur. Dolayısıyla object olustururken new keywordunden sonra kullanılamaz.
               Datatype "Queue" olan bir object olusturmak için new keywordden sonra
                a) LinkedList veya b) PriorityQueue classları kullanılabilir

                Queue olustururken constructor olarak PriorityQueue kullanırsanız eelmanları kendi belirleyeceginiz kurala
                göre sıralama hakkınız olur.
             */

            // Deque => Double ended Queue ==> iki uclu queue
            //Deque'daki add(), get(), peek(), poll() remove() methodlari first-last seklinde iki uclu olarak bulunur

            Deque<String> d = new LinkedList<>(); // Deque  sadece linkedlist kullanır.
            d.add("Milk");
            d.add("Meat");
            d.add("Egg");
            d.add("Orange");
            d.add("Tomatoes");
            System.out.println(d); // [Milk, Meat, Egg, Orange, Tomatoes]


    }
}
