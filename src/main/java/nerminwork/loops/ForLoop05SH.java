package nerminwork.loops;

import java.util.Scanner;

public class ForLoop05SH {
    public static void main(String[] args) {

        /*
        Kullanıcıdan baslangıc ve bitis harflerini alın ve baslangıc harfinden
        baslayıp bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Baslangıc harfini girin");
        char bas = scan.next().toUpperCase().charAt(0);
        System.out.println("Bitis harfini girin");
        char bit = scan.next().toUpperCase().charAt(0);

        if (!(bas>='A' && bas <='Z') || (bit>='A' && bit<='Z')){
            System.out.println("Lütfen bir harf giriniz");
        }else if (bas<=bit){
            for (char i= bas; i<=bit ; i++){
                System.out.print(i + " ");
        }

        }else {
            for (char i= bas; i>=bit ; i--){
                System.out.print(i + " ");
            }
        }








    }
}
