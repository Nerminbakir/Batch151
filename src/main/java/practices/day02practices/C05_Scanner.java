package practices.day02practices;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        /*
        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner scan = new Scanner(System.in);

        System.out.println("Adinizi giriniz");
        String ad = scan.nextLine();

        System.out.println("Soyadinizi giriniz");
        String soyAd = scan.nextLine();

        System.out.println("Yasinizi giriniz");
        int yas = scan.nextInt();

        System.out.println("Boyunuzu giriniz");
        int boy = scan.nextInt();

        System.out.println("Kilonuzu giriniz");
        int kilo = scan.nextInt();

       /* System.out.println("Ad = "  + ad);
        System.out.println("Soyad = " + soyAd);
        System.out.println("Yas = " + yas);
        System.out.println("Boy = " + boy);
        System.out.println("Kilo = " + kilo);

        */

        System.out.println("Ad = "  + ad + "\n" + "Soyad = "  + soyAd + "\n" + "Yas = "  + yas + "\n" +"Boy = "  + boy + "\n" +"Kilo = "  + kilo);



    }//main
}//class
