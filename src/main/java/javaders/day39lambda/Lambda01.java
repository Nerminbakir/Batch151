package javaders.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    /*
    1) Lambda method create etme degil mevcut (hazır) methodlari library'den cagirip kullanmaktir
    2) Java 8 ile eklenmistir
    3) Functional Programming dir. Mimari yapiya onem vermez
    4) Hiz, Clean Code ve okunabilirlik acisindan onemlidir
     */

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println(); // console'da yan yana yazdırmaması için bos sout attık.
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printElLengthLessThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourWithUpper(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);
        System.out.println();
        ilkHarfBykDigerKucukYazdir(myList);
        System.out.println();
        ilkHrfTveyaCOlanlariYazdir(myList);

    }

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol:
    public static void printElements(List<String> myList) {
        for (String w : myList) {
            System.out.print(w + " "); // Tom Jim Clara Tom Clara Angelina
        }
    } // bu yapı Structured Programming

    //2.Yol: Lambda Expression ==> Dikey bir akıstadır.
    public static void printEl(List<String> myList) {
        myList.
                stream(). // stream() ile akışa sunduk. Kullanmak zorunlu degil.
                forEach(t -> System.out.print(t + " ")); // for each yazdırır.  Tom Jim Clara Tom Clara Angelina
    } // Functional Programming

    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElExceptStartsWithT(List<String> myList) {
        myList.
                stream().
                filter(t -> !t.startsWith("T")). // eleme varsa filter () methodu kullanılır.
                forEach(t -> System.out.print(t + " "));// Jim Clara Clara Angelina
    }

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.
    public static void printElLengthLessThanFour(List<String> myList) {
        myList.
                stream().
                filter(t -> t.length() < 4).
                forEach(t -> System.out.print(t + " ")); // filter == filtreleme     Tom Jim Tom
    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourWithUpper(List<String> myList) {
        myList.
                stream().
                filter(t -> t.length() > 4).
                map(t -> t.toUpperCase()). // map () methodu var olan elemanların yapısını değistirir.
                forEach(t -> System.out.print(t + " ")); // CLARA CLARA ANGELİNA
    }
    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList) {
        myList.
                stream().
                distinct(). // tekrarlı elemanları bir kere gösterir. tekrarsız yapar.
                filter(t -> t.length() > 4).
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.print(t + " ")); // clara angelina
    } // akısta hangi methodun önce kullanılır? daha az is yaptıran methodlar. Örn; distinct () methodu ile tekrarlı elemanları tek'e düsürüp sonra uzunluklarına baktık.

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void printElUniqueToUpperCaseSorted(List<String> myList) {
        myList.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(). // 2 turlu kullanımı vardır. İçerisine arguman verilmezse natural order'a göre sıralama yapar. (ascii degerlere bakarak)
                forEach(t -> System.out.print(t + " "));  // ANGELİNA CLARA JİM TOM
    }
    // dogal sıralama == natural order       tersten sıralama == reverse order

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void printElUniqueLowerCaseSortWithLength(List<String> myList) {
        myList.
                stream().
                distinct(). // unique
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())). // Parantez içine arguman verilirse bizim belirlediğimiz parametreye göre sıralama yapar.
                forEach(t -> System.out.print(t + " ")); // tom jim clara angelina
    } // Comparator.comparing == karşılastırıcı.karşılaştırma

    //Example 8: Bir List'teki tüm elemanlarin ilk harfini buyuk diğerlerini kücük yazdiran method'u olusturunuz.
    public static void ilkHarfBykDigerKucukYazdir(List<String> myList) {
        myList.
                stream().
                map(t -> t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase()).
                forEach(t -> System.out.print(t + " ")); // Tom Jim Clara Tom Clara Angelina
    }

     // Example 9: Ilk Harfi "T" veya "C" olanlari yazdiran methodu olusturunuz
    public static void ilkHrfTveyaCOlanlariYazdir(List<String> myList) {
        myList.
                stream().
                filter(t -> t.startsWith("C") || t.startsWith("T")).
                collect(Collectors.toList());// bir akisin sonuclarini bir listin icinde toparlamak icin kullanilir

    }
}

