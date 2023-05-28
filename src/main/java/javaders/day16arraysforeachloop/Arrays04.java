package javaders.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";

        String words[] = s.split(" "); // split methodu her zaman Array sonuc verir.

        System.out.println(Arrays.toString(words));// [Java, is, easy., Learn, Java, earn, money.]

        System.out.println(words.length);


        //Size verilen bir cumlede kac harf oldugunu harflere ayırarak gosteren kodu yaziniz.

        String letters[] = s.replaceAll("[^a-zA-Z]", "").split("");

        System.out.println(Arrays.toString(letters));//[J, a, v, a, i, s, e, a, s, y, L, e, a, r, n, J, a, v, a, e, a, r, n, m, o, n, e, y]

        System.out.println(letters.length);




    }
}
