package javaders.day05typecastingasciivalue;

public class C01_MatematikselIslemler {

    public static void main(String[] args) {

        /*
        Javada farkli data typelari arasinda islem yapiliyorsa sonuc buyuk olan data type'nin turunde olur.
        Karsılastirma operatorlerinde sonuc hep boolean döner.
        <   kucuktur
        >   buyuktur
        ==  esittir
        !=  esit degildir
        <=  kucuk esittir
        >=  buyuk esittir
        &&  and (ve) operatoru
        ||  or (veya) operatoru

         */

        System.out.println(4*(5+2)/3);//9      int/int=int olacagi icin 9.33333.. diye devam eder.
        // yerine virgulden sonrasini siler ve tam sayi kismini alir. Biz ekranda 9 rakamini goruruz.

        System.out.println(6*16/8);//12

        double sonuc =4*(2+5)/3;
        System.out.println(sonuc);//9.0

        double sonuc2 = 4.0*(2+5)/3;//9.3333333334
        System.out.println("sonuc2 = " + sonuc2);

        System.out.println(4*(1+5)/3);//8

        int sayi1 = 5;
        int sayi2= 2;
        double sayi3= 2;//java bunu 2.0 olarak gorur.
        System.out.println(sayi1/sayi2);//2 ---- normalde 2.5 ancak int/int=int olacagi icin tam sayı alınır virgulden sonrasi atilir.
        System.out.println(sayi1/sayi3); //2.5
        System.out.println(sayi1+sayi3/sayi2);//6.0

        boolean first = 2<4;
        boolean second = 2+6 != 8;
        boolean third = 2+3*5<20;
        System.out.println("first = " + first);//t
        System.out.println("second = " + second);//f
        System.out.println("third = " + third);//t
        System.out.println(first && second);//f
        System.out.println(first || second || third);//t




    }//main


}//class
