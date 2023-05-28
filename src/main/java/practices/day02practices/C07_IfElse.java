package practices.day02practices;

import java.util.Scanner;

public class C07_IfElse {
    public static void main(String[] args) {

        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

        //1.yol

        Scanner scan = new Scanner(System.in);
        System.out.println("Ilk sayiyi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        if (sayi1>sayi2){
            System.out.println("Sayi1 sayi2'den buyuktur");

        } else {
            System.out.println("Sayi1 sayi2'den buyuk degil");
        }

        //2.yol
        String sonuc = sayi1>sayi2 ? "buyuk" : "kucuk";
        System.out.println(sonuc);










    }//main
}//class
