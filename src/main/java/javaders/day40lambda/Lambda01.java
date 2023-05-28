package javaders.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {


        List<String> iller = new ArrayList<>(Arrays.asList("Van", "Gumushane", "MUS", "Kutahya", "Ankara", "MUS", "Ordu", "Gaziantep", "Hatay", "Edirne"));
        // List'lere add() methoduyla eleman eklenebildiği gibi Arrays.asList () methoduyla da daha kısa sekilde eleman eklenebilir.

        bykHrfLenghtArtanSiradaTkrsz(iller);
        System.out.println(); // console'da yan yana yazdırmaması için bos sout attık.
        bykHrfSonHrfGoreArtanSiradaTkrsz(iller);
        System.out.println();
        bykHrfUzunluklarinaGoreArtanSiradaTkrszAyniAlfabetikSira(iller);
        System.out.println();
        System.out.println(krktrSysBesFazlaOlanlariSil(iller));
        System.out.println();
        System.out.println(hIleBaslayanOruIleBitenElSil(iller));
        System.out.println();
        System.out.println(elKarakterSayilarininKareleriniAl(iller));
        System.out.println();
        System.out.println(karakterSayisiCiftOlanlariListYazdir(iller));

    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfLenghtArtanSiradaTkrsz(List<String> iller) {
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " ")); // VAN MUS ORDU HATAY ANKARA EDİRNE KUTAHYA GUMUSHANE GAZİANTEP
    }

    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfSonHrfGoreArtanSiradaTkrsz(List<String> iller) {
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//son harfine gore aldik
                forEach(t -> System.out.print(t + " ")); // KUTAHYA ANKARA GUMUSHANE EDİRNE VAN GAZİANTEP MUS ORDU HATAY (KUTAHYA ANKARA GUMUSHANE EDİRNE ==> A ve E ile biten birden fazla eleman var. Bizim list'e eklediğimiz sıraya göre console'da yazdırır.)

    }
    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void bykHrfUzunluklarinaGoreArtanSiradaTkrszAyniAlfabetikSira(List<String> iller) {
        System.out.print("Soru 3");
        iller.
                stream().
                distinct().
                map(String::toUpperCase). // :: ==> Method Referance
                sorted(Comparator.comparing(String::length).
                thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);
    }  // forEach(t-> System.out.print(t+" ")) Lambda Expression bu yapiyi sevmez Bunun yerine Method Referance yontemi kullanılır.
    // map(t->t.toUpperCase()) Lambda Expression bu yapıyı sevmez bunun yerine map(String::toUpperCase) kullanır.

    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz
    // eleman silmek için remove () methodu kullanırız. Ancak stream() methodu ile remove() methoduna ulaşamadıgımız için stream () kullanmadık.
    public static List<String> krktrSysBesFazlaOlanlariSil(List<String> iller) { // return type void degil liste halinde görmek için List<String> yaptık.
        System.out.print("Soru 4 ");
        iller.removeIf(t -> t.length() > 5);
        return iller; // [Van, MUS, MUS, Ordu, Hatay]
    }
    // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz

    public static List<String> hIleBaslayanOruIleBitenElSil(List<String> iller) {
        System.out.print("5) ");
        iller.removeIf(t -> t.startsWith("H") || t.endsWith("u"));
        return iller; // [Van, MUS, MUS]
    }
    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
    public static List<Integer> elKarakterSayilarininKareleriniAl(List<String> iller ){
        System.out.print("6) ");
        return iller.
                stream().
                map(Utils::karesiniAl).// LAMBDA EXPRESSION   map(t->t.length() * t.length()).
                collect(Collectors.toList()); // [9, 81, 9, 49, 36, 9, 16, 81, 25, 36]
    }

    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public static List<String> karakterSayisiCiftOlanlariListYazdir(List<String> iller ) {
        System.out.print("7) ");
        return  iller.
                stream().
                filter(Utils::ciftMi).//Lambda expression filter(t->t.length() %2 ==0).
                collect(Collectors.toList()); // [Ankara, Ordu, Edirne]
    }






}// class

