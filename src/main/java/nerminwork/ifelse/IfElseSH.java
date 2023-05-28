package nerminwork.ifelse;

import java.util.Scanner;

public class IfElseSH {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir gun alın. Eger gun
        Cuma ise ekrana "Muslumanlar icin kutsal gun" yazdirin.
        Cumartesi ise ekrana "Yahudiler icin kutsal gun" yazdirin.
        Pazar ise ekrana "Hristiyanlar icin kutsal gun" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun = scan.next();


        //equals () methodu iki Stringi karsılastırır.
        //Stringler aynı ise true degilse false return eder
        //Stringlerde == kullanılmaz. == primitive data typelarda kullanılır.

        if (gun.equalsIgnoreCase("Cuma")) {//Ignore
            System.out.println("Muslumanlar icin kutsal gun");

        } else if (gun.equalsIgnoreCase("Cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");

        }
        if (gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");

        }
        if (!gun.equalsIgnoreCase("Cuma") && !gun.equalsIgnoreCase("Cumartesi") && !gun.equalsIgnoreCase("Pazar")) {
            System.out.println("Öyle bir kutsal gun yoktur");
        }

        //equals() methodu iki Stringi buyuk kucuk harfe dikkat ederek karsilastırır.
        //equalsIgnoreCase () methodu iki Stringi buyuk kucuk harfe dikkat etmeden karsilastırır.

    }
}