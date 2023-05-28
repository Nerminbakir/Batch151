package javaders.day05typecastingasciivalue;

public class C02_AsciiValue {

    public static void main(String[] args) {

        /*
        Javada char data type'ini matematiksel islemlerde kullanirsaniz "Ascii table"daki sayisal degerleri alir.

        Numeric data type'lari byte, short, int, long, float, double
        char hem sayisal deger barindirir hem de resim karakteri barindirir.
        boolean numeric olmayan data type'dir.

        Javada char data type'ina int degerde atanabilir Sembol Harf vs de atanabilir
        Cunku char data type'inin Ascii'den gelen sayisal (numeric) bir degeri birde resim karakteri vardir

         */

        // 'A'karakterinin ASCII degerini yazdiran kodu yaziniz.

        int asciiA = 'A';
        System.out.println(asciiA);//65

        int asciia = 'a';
        System.out.println("asciia = " + asciia);//97

        int asciiUnlem = '!';
        System.out.println("asciiUnlem = " + asciiUnlem);//asciiUnlem 33

        int asciiSpace = ' ';
        System.out.println("asciiSpace = " + asciiSpace);//asciiSpace 32

        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);//asciiSembol 42

        String isim = "Nermin"; //resim
        char ch = 'N';//resim --- int ch = 'N' olsaydi Ascii table'a gore N harfinin degeri atanir.
        char sembol = '*';//resim   ==> Ascii table'a gore sayısal degerini almak istersek int ile yazdırırız.
        char isaret = '?';//resim
        char space = ' ';//resim
        char sayi = '5';//sayi yani numeric

        //149.99 TL  * 2
        int deger = 20;
        char smbl = '$'; //Javada char data type'ini matematiksel islemlerde kullanirsaniz
        //Ascii table'daki sayisal degerleri alir.
        System.out.println(deger + smbl);//56 ==> '$' Ascii Table'daki degeri 36 old icin toplami 56 verir.

        int deger2 = 0;
        char smbl2 = '+';
        System.out.println(deger2 + smbl2);//43
        System.out.println("deger2+smbl2 = " + deger2 + smbl2);//0+ (concatination yapar)
        System.out.println("deger2+smbl2 = " + (deger2 + smbl2));//43

        String name = "Nermin";
        int number = 998;
        System.out.println(name + number);//Nermin998  (concatination yapar)
        System.out.println("name + number = " + name + number);//name + number = Nermin998  (concatination yapar)

        String name1 = "100";
        int number1 = 998;
        System.out.println(name + number);//100998 (concatination yapar)

        String name2 = "123";
        int number2 = 45;
        System.out.println(name2 + number2);//12345 concatination (birlestirme)

        String str1 = "Java";
        String str2 = "Guzeldir";
        int sayi1 = 5;
        System.out.println(str1 + str2 + sayi1);//JavaGuzeldir5

        String str3 = "Java";
        char ch3 = 'G';
        int sayi2 = 5;
        System.out.println(str3 + ch3 + sayi2);//JavaG5 --- str3 String bir ifade old icin yanindaki ch3 te string olur .
        System.out.println(str3 + (ch3 + sayi2));//Java76
        System.out.println(ch3 + sayi2 + str3);//76Java

        int asciiG = 'G';
        System.out.println("asciiG = " + asciiG);//71  int old icin direk Ascii degerini alır.

        String sayiStr = "123";
        String sayiStr2 = "45";
        System.out.println(sayiStr + sayiStr2);//12345  concatination (birlestirme)

        char rakam1 = '1';
        System.out.println(rakam1);//1 ==> resim (int ile yazdırsaydık Ascii degerini alırdı)
        char rakam2 = '2';
        System.out.println(rakam2);//2 ==> resim                " "
        char rakam3 = '3';
        System.out.println(rakam3);//3 ==> resim                " "
        char rakam4 = '4';
        System.out.println(rakam4);//4 ==> resim                " "

        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + rakam1 + rakam2 + rakam3 + rakam4);//1234  concatination (birlestirme)
        System.out.println("rakam1+rakam2+rakam3+rakam4 = " + (rakam1 + rakam2 + rakam3 + rakam4));//202 Ascii Table'daki rakamlari toplami
        //49+50+51+52=202 Javada char data type'ni matematiksel işlemlerde kullanirsaniz, Ascii tabledaki sayisal degerleri alir.
        System.out.println(rakam1 + rakam2 + rakam3 + rakam4);//202

        // ***************  ASCII DEGERLERİNDEN FAYDANILARAK NELER YAPILABİLİR  **********

        byte b =5;
        char ch2='h';

        int asciih='h';
        System.out.println("asciih = " + asciih);//104
        int ascii5='5'; // KİYASLAMA YAPTİGİMİZ İCİN ASCII T. DAKİ DEGERİNİ ALİRİZ.
        System.out.println("ascii5 = " + ascii5);//53

        System.out.println("b > ch2 = " +( b>ch2));//false  5>104 == false

        long l= 542168784578L;
        System.out.println("ch2>l : "+(ch2>l));//false

        float f =2.45648f;
        double d =2.19658;
        System.out.println("f>d : "+(f>d));//t

        byte sayi3=5;
        byte sayi4 =6;
        System.out.println("sayi3<sayi4 : "+(sayi3<sayi4));//true

        System.out.println("b<f : "+(b<f));//false

        int sayiInt =100;
        long sayiLong =100L;

        System.out.println("sayiInt < sayiLong " + (sayiInt < sayiLong));//false
        System.out.println("sayiInt == sayiLong " + (sayiInt == sayiLong));//true

        int sayiInt1 =200;
        long sayiLong1 =100L;

        System.out.println("sayiInt1 < sayiLong1 " + (sayiInt1 < sayiLong1));//false
        System.out.println("sayiInt1 == sayiLong1 " + (sayiInt1 == sayiLong1));//false
        System.out.println("sayiInt1 > sayiLong1 " + (sayiInt1 > sayiLong1));//true

        int sayiInt3= 9;
        char sayiChar ='9';
        System.out.println("sayiInt3 >= sayiChar = " + (sayiInt3 >= sayiChar));//false
        




    }//main
}//class}

