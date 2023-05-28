package nerminwork.loops;

import java.util.Scanner;

public class WhileLoop03SH {

    public static void main(String[] args) {

        /*
        Kullanıcıdan isim ve soyismini alın.
        Kullanıcının ilk isminin ilk harfinden soyisminin son harfine kadar olan
        butun harfleri buyuk harf olarak ekrana aynı satırda aralarına bosluk bırakarak yazınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı giriniz");
        char ilkHarf = scan.nextLine().toUpperCase().charAt(0);
        System.out.println("Soyadınızı giriniz");
        String soyAd = scan.nextLine().toUpperCase();
        char sonHarf = soyAd.charAt(soyAd.length()-1);

        if (ilkHarf<=sonHarf){
            while (ilkHarf<=sonHarf){
                System.out.print(ilkHarf + " ");
                ilkHarf++;
        }
        }else {
            while (sonHarf <= ilkHarf) {
                System.out.print(sonHarf + " ");
                sonHarf++;
            }

        }



    }//
}//
