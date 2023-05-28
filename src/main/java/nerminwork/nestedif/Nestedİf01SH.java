package nerminwork.nestedif;

import java.util.Scanner;

public class Nestedİf01SH {
    public static void main(String[] args) {

        //Nested İf = İç içe gecmiş "İf Statement" lar
        /*
        Kullanıcıdan bir sayi alın
        Eger sayi pozitif ise 10 dan buyuk olup olmadıgını kontrol edin
        Eger 10 dan buyuk ise "Buyuksun" yazdırın
        Eger 10 dan kucuk ise "Normalsin" yazdırın.

        Eger sayi pozitif degilse -10 dan buyuk olup olmadıgını kontrol edin
        Eger -10 dan buyuk ise "Negatifsin" yazdırın
        Eger -10 dan kucuk ise "Cok Negatifsin" yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir tamsayi girin");
        int sayi = scan.nextInt();

        if (sayi>0){
            if (sayi>10){
                System.out.println("Buyuksun");
            }else{
                System.out.println("Normalsin");
            }
        }else {
            if (sayi>-10){
                System.out.println("Negatifsin");
                }else{
                    System.out.println("Cok Negatifsin");
                }
        }















    }
}
