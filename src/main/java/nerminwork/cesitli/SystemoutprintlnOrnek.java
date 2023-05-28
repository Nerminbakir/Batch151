package nerminwork.cesitli;

import java.util.Scanner;

public class SystemoutprintlnOrnek {
    public static void main(String[] args) {

        /*
        1)Kullanıcıdan ad ve soyadını ve 11 haneli kimlik numarasını alınız.
        2)Kullanıcı ad ve soyadını yazarken hatayla bas ve sona buyuk harf koyarsa siliniz.
        3)Ad ve soyadın ilk harfleri buyuk diger hrfleri kucuk olmali
        4)Kimlik numarasının son 4 rakamı hariç hepsi * yapılmalı
        Örn=Ali Can ********1234

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk adinizi giriniz");
        String ad = scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz");
        String soyAd = scan.nextLine();
        System.out.println("Lutfen kimlik numaranizi giriniz");
        String kimlikNo = scan.nextLine();

        ad = ad.trim();//1.adim
        soyAd = soyAd.trim();//2.adim
        //3.Adim
        ad = ad.substring(0,1).toUpperCase() + ad.substring(1).toLowerCase();

        soyAd = soyAd.substring(0,1).toUpperCase() + soyAd.substring(1).toLowerCase();

        //4.Adim
        kimlikNo ="********" + kimlikNo.substring(kimlikNo.length()-4);

        System.out.println(ad);
        System.out.println(soyAd);
        System.out.println(kimlikNo);



    }//main
}//class
