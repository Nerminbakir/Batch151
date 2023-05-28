package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        /*
        Kullanicidan data almak icin Scanner classindan scan/input/scanner objesi olustururuz.
        Bu sekilde kullaniciyi yönlendirerek gerekli datalari elde ederiz.
         */

        // 1. Adim : Obje olusturma

        Scanner input = new Scanner(System.in); //Nermin ==input objesi

        // 2. Adim : Kullanıcıya ne yapacagini söylüyoruz.

        System.out.println("Lutfen cinsiyetinizi giriniz K/E seklinde");

        // 3. Adim : Kullanicidan alinan data yapisina, buyuklugune uygun bir Variable'a yerlestirilir.

        char cinsiyet = input.next().charAt(0);

        // 4. Adim : Ekranda görebilmek icin ve kullanicininda verdigi bilgileri teyit edebilmesi icin yazdiriyoruz.
        System.out.println("cinsiyet = " + cinsiyet);

        //Kullaniciya cinsiyetini, adini, memleketini, yasini, boyunu, ülkesini sevip sevmedigini, maasini soran bir program yaziniz.

        Scanner input2 = new Scanner(System.in);// Yaprak = input objesi
        System.out.println("Lutfen cinsiyetinizi giriniz Kadin ise K erkek ise E harfi giriniz.");
        char gender = input2.next().charAt(0);

        System.out.println("Lutfen adinizi giriniz");
        input2.nextLine(); //DUMMY ATİLDİ. CONSOLDA YAZDİRİRKEN SATİR ATLAMASİ YAPMAMASİ İCİN SORUN OLAN YERE GELİP HEMEN UST KİSMİNA BOS BİR İNPUT YAZIYORUZ.BUNA DUMMY ATMAK DENİR.
        String isim = input2.nextLine();//nextline yazmamizin sebebi birden fazla isim girilecegi zaman .(line satir demek)

        System.out.println("Lutfen nereli oldugunuzu giriniz");
        String memleket = input2.next();

        System.out.println("Lutfen yasinizi giriniz");
        byte yas = input2.nextByte();

        System.out.println("Lutfen boyunuzu giriniz");
        short boy = input2.nextShort();

        System.out.println("Lutfen yasadiginiz ulkeyi sevip sevmediginizi true false olarak giriniz");
        boolean seviyorMu = input2.nextBoolean();

        System.out.println("Lutfen maasinizi giriniz");
        long maas = input2.nextLong();

        System.out.println("********** Nermin*********");
        System.out.println("gender = " + gender + "\nisim = " + isim + "\nmemleket = " + memleket + "\nyas = " + yas + "\nboy = " + boy + "\nseviyorMu = " + seviyorMu + "\nmaas = " + maas);


    }//main
}//class
