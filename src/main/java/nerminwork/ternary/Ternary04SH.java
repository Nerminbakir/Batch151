package nerminwork.ternary;

import java.util.Scanner;

public class Ternary04SH {
    public static void main(String[] args) {

        /*
        Kullanıcıdan alacagı ürün miktarını ve ürünün birim fiyatını alın.
        Eger ürün miktarı 1000'den fazla ise kullanıcıya %10 indirim yapın ve
        ödemesi gereken toplam parayı ekrana yazdırın.
        Diger durumlarda ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("urun miktarını yazınız.");
        int miktar = scan.nextInt();
        System.out.println("urun fiyatını yazınız.");
        double fiyat = scan.nextDouble();

        double result = miktar>1000 ? fiyat*0.9*miktar : fiyat*miktar;
        System.out.println(result);


    }//m
}//c
