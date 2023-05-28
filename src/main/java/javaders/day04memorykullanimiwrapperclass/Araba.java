package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class Araba {

    public String model ="v60";//variable
    public String renk= "Beyaz";//variable
    public int fiyat = 500000;//variable

    public static void main(String[] args) {

        /*Class ==> Variable (pasif ozellikler)
                ==> Method (aktif ozellikler)


         */

        // Class ismi  + Objenin ismi    =   new    +   Class ismi () + Constructor;

            Scanner         input       =    new        Scanner(System.in);

             Araba          volvo       =   new         Araba();

        hareket();
        dur ();
        yakit ();
        System.out.println(volvo.fiyat);
        System.out.println(volvo.renk);
        System.out.println(volvo.model);
        System.out.println("volvo.model = " + volvo.model);
        volvo.hareket();
        volvo.yakit();
        volvo.dur();

    }//main

    private static void yakit() {System.out.println("Volvo az yakit yakar...");
    }

    private static void dur() {

        System.out.println("Volvo guvenle durur...");
    }

    private static void hareket() { //Aktif ozellikler

        System.out.println("Volvo cok hizli gider...");
    }




    }//class



