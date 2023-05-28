package javaders.day22stringbuilder;

public class Sb01 {
    public static void main(String[] args) {

        /*
        1) StringBuilder String ureten bir class'tır.
        2) String Class kullanarak String uretiriz. Java niçin "StringBuilder" Class'ı da olusturdu ?
            String Class "immutable" (degiştirilemez) String uretir. "StringBuilder" Class "mutable" (degiştirilebilir) String uretir.
        3) "immutable" olmak demek orijinal degerin korunması, degiştirilemez olması demektir.
            "mutable" olmak demek orijinal degerin degiştirilebilir olması demektir.
         4) "capacity" Java'nın size verdiği data depolama yer sayısıdır.
            length ise size verilen data depolama yerinin kullanılan kısmıdır.
         5) Java baslangıc olarak size capacity'i 16 olarak verir.
            Siz verilen capacity'i asarsanız Java yeni capacity'i var olanın 2 katının 2 fazlası olacak sekilde degistirir.
         */

        String s ="Java";
        //s + "!";

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        // StringBuilder nasıl olusturulur?

        //1. Way
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);//Python

        // StringBuilder'lara nasıl eleman eklenir ?
        t.append("!").append("..");//obje ile methodlara ulasınca non static olur.
        System.out.println(t);//Python!..

        //2. Way
        StringBuilder r = new StringBuilder();
        System.out.println(r);//  (hicbir sey yok)
        r.append('c');
        System.out.println(r);//c

        // "capacity" ve "length" arasındaki fark nedir?
        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();//normalde capacity 16 dır.
        System.out.println(capacity);//21

        int length = sb1.length();
        System.out.println(length);//5

        sb1.append("!").append(".................");

        int c = sb1.capacity();
        System.out.println(c);//21*2+2=44

        int ln = sb1.length();
        System.out.println(ln);//23

        // Default capacity'i degistirebilir miyiz?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity()); // 2

        sb2.append("...");
        System.out.println(sb2.capacity()); // 6

    }
}
