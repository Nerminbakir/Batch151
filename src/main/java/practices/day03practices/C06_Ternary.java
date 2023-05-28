package practices.day03practices;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        /*
         Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar birbirine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("İlk tamsayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("İkinci tamsayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println(sayi1 == sayi2 ? "Sayılar Birbirine Esit" : sayi1>sayi2 ? "Buyuk Sayi :" + sayi1 : "Buyuk Sayi :" + sayi2);


    }
}
