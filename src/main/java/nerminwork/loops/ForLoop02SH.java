package nerminwork.loops;

import java.util.Scanner;

public class ForLoop02SH {
    public static void main(String[] args) {

        /*
            Kullanıcıdan baslangıc ve bitiş degerlerini alın
            Baslangıc degerinden baslayıp bitiş degerinde biten tüm cift sayıları ekrana yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangıc degerini girin");
        int bas = scan.nextInt();
        System.out.println("Bitiş degerini girin");
        int bit = scan.nextInt();

        if (bas>bit){
            System.out.println("Baslangıc degeri bitiş degerinden kucuk olmalı");
        }else{
            for (int i = bas; i <bit+1 ; i++) {
                if (i%2==0){
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();

       /* Kullanıcıdan bir sayı alın o sayıdan kucuk olan tum pozitif
        tek sayıları buyukten kucuge dogru aynı satırda bosluk bırakarak yazdırın.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir tamsayı giriniz");
        int sayi = input.nextInt();

        if (sayi<1){
            System.out.println("Pozitif bir tamsayi giriniz");
        }else{
            for (int i = sayi; i>0 ; i--) {

                if (i%2!=0){
                    System.out.print(i + " ");
                }
        }
        }









    }//main
}//class
