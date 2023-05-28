package nerminwork.nestedif;

import java.util.Scanner;

public class NestedİfSoru01SH {
    public static void main(String[] args) {
        /*
        Kullanıcıdan cinsiyetini girmesini isteyin.

        Erkek ise yasını kontrol edin .
        Yası 18 den kucuk ise ekrana "Erkek cocuk" yazdırın.
        Yasi 18 den buyuk esit ise ekrana "Adam" yazdırın.

        Kadın ise yasını kontrol edin .
        Yası 18 den kucuk ise ekrana "kız cocuk" yazdırın.
        Yasi 18 den buyuk esit ise ekrana "Kadın" yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz = Erkek / Kadın");
        String c = scan.next();
        System.out.println("Yasınızı giriniz");
        int y = scan.nextInt();

        if (c.equalsIgnoreCase("Erkek")) {
            if (y < 18) {
                System.out.println("Erkek Cocuk");
            } else {
                System.out.println("Adam");
            }
        } else if (c.equalsIgnoreCase("Kadın")) {
            if (y < 18){
                System.out.println("kız cocuk");
        } else {
            System.out.println("Kadın");}
        } else{
            System.out.println("Bu cinsiyet tanımlı degil");
        }


    }//main
}//class

