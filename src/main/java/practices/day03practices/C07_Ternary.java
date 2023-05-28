package practices.day03practices;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {

        /*
         Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char ch = scan.next().charAt(0);

        System.out.println((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ?  (ch>='a' && ch<='z' ? "Kucuk Harf" : "Buyuk Harf" ): "Harf Degil");










    }
}
