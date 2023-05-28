package nerminwork.stringmanipulations;

import java.util.Scanner;

public class StringMn {

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
        System.out.println("lutfen sifrenizi" +
                "                ii)Password space icermesin\n" +
                "                iii)En az 1 tane buyuk harf olsun\n" +
                "                iv) En az 1 tane kucuk harf olsun\n" +
                "                v) En az 1 tane sembol olsun\n" +
                "                vi) En az 1 tanede rakam olsun giriniz");




        String pwd = input.nextLine();

        //2) space olmasın

        boolean boslukIcermemeli =!pwd.contains(" ");

        //En az 1 tane buyuk harf olsun

        boolean buyukHarfOlmali = pwd.replaceAll("[^A-Z]" ,"").length()>0;

        //En az 1 tane kucuk harf olsun

        boolean kucukHarfOlmali = pwd.replaceAll("[^a-z]" ,"").length()>0;

        //En az 1 tane sembol olsun
        boolean smblOlmali = pwd.replaceAll("[^a-zA-Z0-9]", "" ).length()>0;

        // En az 1 tanede rakam olsun

        boolean rkmOlmali = pwd.replaceAll("[^0-9]" , "").length()>0;

        System.out.println("Password Gecerli Mi = " + (boslukIcermemeli && buyukHarfOlmali && kucukHarfOlmali && smblOlmali && rkmOlmali));






    }//main
}//class