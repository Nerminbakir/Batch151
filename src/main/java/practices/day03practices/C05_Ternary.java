package practices.day03practices;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

            /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
            */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(sayi%2==0 ? ("Cift Sayı") : (sayi+3));



    }
}
