package nerminwork.ifstatement;

import java.util.Scanner;

public class IfStatement01SH {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir karakter alın
        Bu karakter buyuk harf ise "Buyuk Harf" yazdırın
        Bu karakter kucuk harf ise "Kucuk Harf" yazdırın
        Bu karakter  harf degil ise "Harf Degil" yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz");
        char ch =scan.next().charAt(0);

        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");
        }


        if (ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf");
        }

        if (!(ch>='A' && ch<='Z') && !(ch>='a' && ch<='z')){
            System.out.println("Harf Degildir");
        }












    }//main
}//class
