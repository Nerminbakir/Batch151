package nerminwork.ifstatement;

import java.util.Scanner;

public class IfStatement02SH {

    public static void main(String[] args) {

        /*
        Kullancıdan pozitif bir tamsayi alın.
        Sayi 3 basamakli ise consola "3 basamaklı" yazdırın
        Sayı 2 basamaklı ise consola "2 basamaklı" yazdırın
        Sayı 3 basamaklı veya 2 basamaklı degil ise consola "ikiside degil" yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int a = scan.nextInt();


        if (a>99 && a<1000){
            System.out.println("3 Basamakli");

        }

        if (a>9 && a<100){
            System.out.println("2 Basamakli");

        }

        if (!(a>99 && a<1000) && !(a>9 && a<100)){
            System.out.println("ikiside degil");

        }













    }//main
}//class
