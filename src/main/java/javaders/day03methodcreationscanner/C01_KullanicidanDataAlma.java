package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_KullanicidanDataAlma {

    public static void main(String[] args) {

        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*

          A
         A A
        A A A

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character veriniz");

        char ch = input.next().charAt(0);//nermin ==>0=n,1=e,2=r,3=m,4=i,5=n==>ama char 0 ile calisir.1,2,3... yazsakta consolda basmaz. Hata verir.

        /*
        Sadece char data type için nextChar () diye bir method olmadıgı için kullanıcıdan
        alip ch konteynir'ina yerlestimek icin next().charAt(0);methodunu kullaniriz

        */


        /*System.out.println("  A  ");
        System.out.println(" A A ");
        System.out.println("A A A");
        System.out.println("   A\n  " + "A A\n " + "A A A");
        */

        System.out.println("  "+ch+"  ");//5 karakter
        System.out.println(" "+ch+" "+ch+" ");//5 karakter
        System.out.println(ch+" "+ch+" "+ch);//5 karakter

        // Aralarında bir tab bosluk bırakarak tek sout ile ayni sekli olusturalim.

        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+"\t" +"\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);
        /*  "\t\t"+ch+"\t\t\n

             \t"+ch+"\t" +"\t"+ch+"\t\n

             "+ch+"\t\t"+ch+"\t\t"+ch
         */


    }//main



}//class
