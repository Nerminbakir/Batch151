package nerminwork.stringmanipulations;

import java.util.Scanner;

public class StringConcatOrnek {
    public static void main(String[] args) {
        /*
        1)Kullanıcıdan bir String alın
        2)Tum rakamları * a cevirin
        3)Bas ve sondaki tum spaceleri silin
        4)Aralarındaki tum spaceleri  !  isaretine cevirin
        5)a ve z harflerini buyuk harf, digerlerini kucuk harf yapin
        6)En basa "(" ve en sona ")" ekleyin
         */

        //1. adim
        Scanner scan = new Scanner (System.in);
        System.out.println("Bir String giriniz");
        String s = scan.nextLine();

        //2. adim
       s = s.replaceAll("\\d","*");

        //3. adim
        s = s.trim();

        //4. adim
        s = s.replace(" ", "!");

        //5. adim
        s = s.toLowerCase();
        s = s.replace('a', 'A');
        s = s.replace('z', 'Z');

        //6. adim
        s = "(" + s + ")";

        System.out.println(s);


    }
}
