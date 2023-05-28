package nerminwork.loops;

import java.util.Scanner;
import java.util.SortedMap;

public class ForLoop01SH {

    public static void main(String[] args) {

        // Ekrana 10 kere "Hi!" yazdırın.

        for (int i = 1; i <11 ; i++) {
            System.out.println("Hi!");
        }

        //100 den 1 e kadar tum sayıları ekrana aralarına bosluk koyarak yazınız.

        for (int i = 100; i >0 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        /*
            Kullanıcıdan baslangıc ve bitiş degerlerini alın
            Baslangıc degerinden baslayıp bitiş degerinde biten tüm sayıları ekrana yazdırın.
            Örn= Kullanıcı 10 ve 15 verirse ===>10 11 12 13 14 15
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangıc degerini giriniz");
        int bas =scan.nextInt();
        System.out.println("Lutfen bitis degerini giriniz");
        int  bit =scan.nextInt();

        if (bas>bit){
            System.out.println("Baslangıc degeri bitiş degerinden kucuk olmalı");
        }else{

            for (int i = bas; i <bit+1 ; i++) {
                System.out.print(i + " ");
            }
        }





    }//m
}//c
