package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {
        
        String a = "Benim Tek Rakibim Dunku Ben";

                //****************** toUpperCase () Methodu *************
        
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper); //BENİM TEK RAKİBİM DUNKU BEN

                //****************** toLowerCase () Methodu *************

        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower); //benim tek rakibim dunku ben

                //****************** charAt () Methodu *************

        System.out.println("ilk karakter = "  + a.charAt(0)); //B
        System.out.println("a.charAt(10) = " + a.charAt(10));//R
        System.out.println("a.charAt(16) = " + a.charAt(16));//m

        // a Stringindeki bastan ikinci ve sondan ikinci karakteri aliniz ve yan yana yazdiriniz.

        char firstChar = a.charAt(1);
        char lastSecondChar = a.charAt(25);
        System.out.println("firstChar + lastSecondChar = " + firstChar + lastSecondChar); //ee
        System.out.println(" " + firstChar + lastSecondChar);//ee
        System.out.println(" " + firstChar + " " + lastSecondChar);// e e


        // **********  length () ************

        //a Stringinde bulunan karakter sayisini bulunuz.

        System.out.println(a.length()); //27 lenght olunca ilk harf 'B' 1 den baslar.

                // **********  substring () ************

        //a Stringindeki ilk dort karakteri aliniz

        String sub1 = (a.substring(0,4));//0 dahil 4 haric
        System.out.println("sub1 = " + sub1); // Beni

        //a Stringindeki 4. index dahil 7. index haric yazdiriniz.

        System.out.println(a.substring(4, 7)); //m T

        //a stringindeki Rakib kelimesini aliniz.

        System.out.println(a.substring(10,15));//Rakib

        System.out.println(a.substring(10));//Rakibim Dunku Ben


                // **********  contains () ************

        //a stringindeki "bim" kelimesinin olup olmadigini kontrol ediniz.
        
        boolean varMi = a.contains("bim");
        System.out.println("varMi = " + varMi);//true

                // **********  starsWith () ************

        //a stringinin "T" harfiyle baslayip baslamadiğini kontrol ediniz.
        //String a = "Benim Tek Rakibim Dunku Ben";
        System.out.println( a.startsWith("T"));//false
        System.out.println(a.startsWith("Tek",6));//true -- ilk 6 karakteri at sonrasi "tek" kelimesiyle basliyor mu ?
        //prefix = baslangic,    toffset =at gitsin

        // universite numaralari yil + bolum kodu + GirisSirasi olarak duzenlenen bir okulda ogrenci Nerminin
        // hukuk fakultesinde okuyup okumadigini gösteren kodu yaziniz.

        /*
        sinif   22  hukuk   33    bilgisayar 44      eczacilik   55
        maliye   66        kimya muhendisligi  77 olsun

         */

        String str = "20105501";
        System.out.println(str.startsWith("33", 4));//false
        //ilk 4 karakteri attik 2010 -- 55 false verdi


    }//main
}//class
