package nerminwork.nestedif;

import java.util.Scanner;

public class NestedİfSoru03SH {
    public static void main(String[] args) {

        /*
        Kullanıcıdan password girmesini isteyin.

        Girdigi password 5'e bölünüyorsa son rakamı kontrol edin.
        Son rakamı 0 ise ekrana "5'e bölünebilen cift sayi" yazdırın.
        Son rakamı 0 degil ise "5'e bölünebilen tek sayi" yazdırın.
        Girdigi password 5'e bölünmüyorsa ekrana "Tekrar Deneyin" yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir password giriniz");
        int pwd = scan.nextInt();

        if (pwd%5==0){
            if (pwd%10==0){
                System.out.println("5'e bölünebilen cift sayi");
            }else{
                System.out.println("5'e bölünebilen tek sayi");
            }

        }else{
            System.out.println("Tekrar Deneyin");
        }


    }//main
}//class
