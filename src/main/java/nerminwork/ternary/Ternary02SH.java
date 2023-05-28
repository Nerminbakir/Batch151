package nerminwork.ternary;

import java.util.Scanner;

public class Ternary02SH {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir tamsayi alin.
        Eger tamsayi 0 dan kucuk ise ekrana "Negatif" yazdırın.
        0 dan buyuk ise "Negatif Degil" yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int sayi = scan.nextInt();

        //1.yol DATA TYPE'ları farklı ise kullanılır. String ve int gibi
        System.out.println(sayi < 0 ? "Negatif" : "Negatif Degil");
        //2.yol
        String result =sayi < 0 ? "Negatif" : "Negatif Degil";
        System.out.println(result);

    }//m
}//c
