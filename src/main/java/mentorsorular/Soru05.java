package mentorsorular;

import java.util.Scanner;

public class Soru05 {
    public static void main(String[] args) {

    /*
            Soru-5: Kullanicidan  yasini ve kilosunu alaliniz
		    18 yasindan kucuk ise kan bagisi yapamaz
		    18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		    18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasınızı giriniz");
        int yas = scan.nextInt();
        System.out.println("Kilonuzu giriniz");
        int kilo = scan.nextInt();

        if (yas<18) {
            System.out.println("Kan bagısı yapamaz");
        } else if (yas>18 && kilo<50) {
            System.out.println("Kan bagısı yapamaz");
        }else {
            System.out.println("Kan bagısı yapabilir");
        }

        if (yas > 0 && yas < 18) {//yas ve sartı kontrolu yapıldı
            System.out.println("yası 18'den kucuk olanlar kan bagısı yapamaz");
        } else if (yas >= 18) {
            if (kilo > 0 && kilo < 50) {//kilo sartı ve kontrolu yapıldı
                System.out.println("yasınız kan bagısı icin uygun ancak kilonuz yetriz");
            } else if (kilo >= 50) {
                System.out.println("sartlarınız uygun kan bagısı yapabilirsiniz");
            } else System.out.println("kilonuzu hatalı girdiniz");//hatalı kilo girişi kontrolu yapıldı
        } else System.out.println("hatalı veri girdiniz");//hatalı yas girişi kontrolu yapıldı
    }
}