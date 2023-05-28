package practices.day04practices;

import java.util.Scanner;

public class C01_Swich {
    public static void main(String[] args) {

        /*

         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("0-4 Arası Puanınızı Giriniz");
        double not = scan.nextDouble();

        String seviye = "";

        if (not>=0 && not<1.0){
            seviye = "KALDI";
        } else if (not>=1.0 && not<2.0) {
            seviye = "GECTİ";
        } else if (not>=2.0 && not<2.5) {
            seviye = "İYİ";
        } else if (not>=2.5 && not<3.5) {
            seviye = "UST";
        }else if (not>=3.5 && not<=4.0) {
            seviye = "HARİKA";
        }

        switch (seviye){
            case "KALDI" :
                System.out.println("F");
                break;
            case "GECTİ" :
                System.out.println("D");
                break;
            case "İYİ" :
                System.out.println("C");
                break;
            case "UST" :
                System.out.println("B");
                break;
            case "HARİKA" :
                System.out.println("A");
                break;

            default:
                System.out.println("Sınav Puanınızı Dogru Giriniz");


        }












    }
}
