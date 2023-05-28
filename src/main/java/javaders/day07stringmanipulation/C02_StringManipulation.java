package javaders.day07stringmanipulation;

import java.util.Scanner;

public class C02_StringManipulation {

    public static void main(String[] args) {

        /*
        Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

                i) En az 8 karakterden olussun
                ii)Password space icermesin
                iii)En az 1 tane buyuk harf olsun
                iv) En az 1 tane kucuk harf olsun
                v) En az 1 tane sembol olsun
                vi) En az 1 tanede rakam olsun


            Pozitif Senaryo ==> Ac123?d.    true
            Negatif Senaryo ==>Ac123? sd
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu      " +
                "                i) En az 8 karakterden olussun\n" +
                "                ii)Password space icermesin\n" +
                "                iii)En az 1 tane buyuk harf olsun\n" +
                "                iv) En az 1 tane kucuk harf olsun\n" +
                "                v) En az 1 tane sembol olsun\n" +
                "                vi) En az 1 tanede rakam olsun " +
                "giriniz....");

        String pwd = input.nextLine();

        // i) En az 8 karakterden olussun
        boolean krktrSys = pwd.length() > 7;
        // boolean krktrSys2=pwd.length()>=8; makbul olani >7 dir.
        // Cunku javaya daha az is yaptirilir


        //ii)Password space icermesin
        boolean spaceOlmamali = !pwd.contains(" ");
        // " " ==space karakteri icer contains     !== mesin

        //iii)En az 1 tane buyuk harf olsun

        boolean bykHrfOlmali = pwd.replaceAll("[^A-Z]", "").length() > 0;

        //Methodlari ayni satirda yan yana yazabiliriz.Buna method chain(method zinciri) denir.


        //iv) En az 1 tane kucuk harf olsun
        boolean kckHarfOlmali = pwd.replaceAll("[^a-z]", "").length() > 0;

        //v) En az 1 tane sembol olsun  sembol(tum harfler ve tum rakamlar disindaki her sey)
        boolean sembolOlmali = pwd.replaceAll("[a-zA-Z0-9]", "").length() > 0;

        //  vi) En az bir tanede rakam olsun
        boolean rakamOlmali = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("Password Gecerlimi : "+(krktrSys && spaceOlmamali
                && bykHrfOlmali && kckHarfOlmali && sembolOlmali && rakamOlmali));



    }//main
}//class
