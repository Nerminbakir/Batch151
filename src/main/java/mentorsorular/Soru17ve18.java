package mentorsorular;

import java.util.Scanner;

public class Soru17ve18 {
    public static void main(String[] args) {

        /*
        Soru-17:Kullanicidan bir sayi aliniz
            Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
            10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
            Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();

        if (sayi>=0){
            if (sayi<10){
                System.out.println("RAKAM");
            }else {
                System.out.println("pozitif sayı");
            }
        }else{
            System.out.println("Negatif Sayı");
        }


            /* Soru-18:Kullanicidan bir character girmesini isteyiniz
            Character harf ise kucuk harf olup olmadigini kontrol ediniz
            Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
            Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
            Harf degilse ekrana "Harf degil" yazdiriniz
            97:a  122:z ascii değeri
            */

        System.out.println("Bir character giriniz");
        char ch = scan.next().charAt(0);

        if (ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
            if (ch>='a' && ch<='z'){
                System.out.println("Kucuk Harf");
            }else{
                System.out.println("Buyuk Harf");
            }
        }else{
            System.out.println("Harf Degil");
        }










    }
}
