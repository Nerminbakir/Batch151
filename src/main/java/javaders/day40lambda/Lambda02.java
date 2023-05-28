package javaders.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Lambda02 {

        public static void main(String[] args) {

        /* Match
        allMatch() ==> tum elemanlar sarti saglarsa true dondurur
        anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
        noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur. En az bir eleman sartı saglarsa false döndürür.
         */

            Universite u1 = new Universite("hacettepe","fizik",1000,85);
            Universite u2 = new Universite("odtu","matematik",2000,80);
            Universite u3 = new Universite("bogazici","java",3000,85);
            Universite u4 = new Universite("marmara","sql",4000,90);
            Universite u5 = new Universite("itu","resim",5000,90);
            Universite u6 = new Universite("erciyes","api",6000,95);
            Universite u7 = new Universite("karaelmas","muzik",7000,80);
            Universite u8 = new Universite("bilkent","bilgisayar muh",8000,100);
            List<Universite> list = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5, u6,u7,u8));

            System.out.println(notOrt75tenBuyuk(list));
            System.out.println();
            System.out.println(matematikBolumuVarmi(list));
            System.out.println();
            System.out.println(ogrenciSayilarinaGoreBuyuktenKucugeListYazdir(list));
        }//main

        // Task 01 : Butun universitelerin not ortalamasinin 75'ten buyuk oldugunu gosteren bir program olusturunuz.

        public static boolean notOrt75tenBuyuk( List<Universite> list){
            System.out.print("1) ")  ;
            return list.
                    stream().
                    allMatch(t->t.getNotOrtalamasi()>75); // true
        }

        // Task 02 : Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden bir program olusturunuz.
        public static boolean matematikBolumuVarmi( List<Universite> list){
            System.out.print("2) ")  ;
            return list.
                    stream().
                    anyMatch(t->t.getBolumAdi().equalsIgnoreCase("matematik")); // true

        }

        // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayip liste halinde veren bir program olusturunuz.
        public static List<Universite> ogrenciSayilarinaGoreBuyuktenKucugeListYazdir( List<Universite> list){
            System.out.print("3) ")  ;
            return  list.
                    stream().
                    sorted(Comparator.comparing(Universite::getOgrenciSayisi).reversed()).
                    collect(Collectors.toList()); // [Universite{name='bilkent', bolumAdi='bilgisayar muh', ogrenciSayisi=8000, notOrtalamasi=100},
                                                 // Universite{name='karaelmas', bolumAdi='muzik', ogrenciSayisi=7000, notOrtalamasi=80}, Universite{name='erciyes', bolumAdi='api', ogrenciSayisi=6000, notOrtalamasi=95}, Universite{name='itu', bolumAdi='resim', ogrenciSayisi=5000, notOrtalamasi=90}, Universite{name='marmara', bolumAdi='sql', ogrenciSayisi=4000, notOrtalamasi=90}, Universite{name='bogazici', bolumAdi='java', ogrenciSayisi=3000, notOrtalamasi=85}, Universite{name='odtu', bolumAdi='matematik', ogrenciSayisi=2000, notOrtalamasi=80}, Universite{name='hacettepe', bolumAdi='fizik', ogrenciSayisi=1000, notOrtalamasi=85}]


        }

    }
