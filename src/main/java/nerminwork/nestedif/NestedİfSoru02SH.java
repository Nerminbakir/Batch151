package nerminwork.nestedif;

import java.util.Scanner;

public class NestedİfSoru02SH {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir harf girmesini isteyin.

        Girdigi kucuk harf ise harfin "a" olup olmadıgını kontrol edin.
        Harf "a"  ise ekrana "İlk kucuk harf" yazdırın
        "a" degil ise ekrana "İlk kucuk harf degil" yazdırın

        Girdigi buyuk harf ise harfin "Z" olup olmadıgını kontrol edin.
        Harf "Z" ise ekrana "Son buyuk harf" yazdırın
        Harf "Z" degil ise ekrana "Son buyuk harf degil" yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char h = scan.next().charAt(0);

        if (h>='a' && h<='z') {
            if (h == 'a') {
                System.out.println("İlk kucuk harf");
            } else {
                System.out.println("İlk kucuk harf degil");
            }
        } else if (h>='A' && h<='Z') {
            if (h == 'Z') {
                System.out.println("Son buyuk harf");
            } else {
                System.out.println("Son buyuk harf degil");
            }
        }else {
            System.out.println("Lutfen harf giriniz");
        }



    }//main
}//class
