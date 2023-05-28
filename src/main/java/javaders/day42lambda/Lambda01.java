package javaders.day42lambda;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastCharDistinctUpperInList(names));
        System.out.println(sortWithLengthReversedSameLengthNaturalOrderLowerInList(names));
        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(noLengthLessThanThree(names));
        System.out.println(atLeastOneLengthLessThanFour(names));

    }

    // Example 1 : List elemanlarını son harflerine göre natural order'da tekrarsız olarak buyuk harfle bir List'in içinde return ediniz.
    // [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [MICHAEL, TOM, JIM, ALEXANDER, MARY]

    // 1. Way
    public static List<String> sortWithLastCharDistinctUpperInList (List<String> names){

    return names.
              stream().
              distinct().
              map(String::toUpperCase).
              sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
              collect(Collectors.toList()); // [MİCHAEL, TOM, JİM, ALEXANDER, ALEX, MARY]

    } // sonucu bir list'in ya da bir set'in içinde görmek istersek collect methodunu kullanırız.

       /*
       Normalde distinct elemanları depolamak için "Set" kullanılır. Ama Lambda'daki collect(Collectors.toSet());
       methodu elemanları rastgele sıralar. Halbuki bu soruda rastgele sıralama kabul edilmiyor.
       Bu yüzden mecburen collect(Collectors.toList()); kullandık.
        */

    // Example 2 : List elemanlarını character sayılarına göre ters sırada kucuk harfle bir List'in içinde return ediniz.
    // Aynı character sayısına sahip elemanlar kendi içinde alfabetik sırada olsun.
    // [Tom, Alex, Jim, Michael, Mary, Alexander, Alex] ==> [alexander, michael, alex, alex, mary, jim, tom]

    public static List<String> sortWithLengthReversedSameLengthNaturalOrderLowerInList(List<String> names){

    return names.
              stream().
              map(String::toLowerCase).
              sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
              collect(Collectors.toList()); // [alexander, michael, alex, alex, mary, jim, tom]
    }// thenComparing() methodu sıralama içinde sıralama yaptıgımızda kullanılır.

    // Example 3 : List elemanlarının tamamının character sayısının 2'den buyuk olup olmadığını kontrol eden method'u olusturunuz.
    public static boolean isLengthMoreThanTwo(List<String> names){
        return names.stream().allMatch(t->t.length()>2); // allMatch == hepsi örtüşüyor mu
    } //true

    //Example 4: List elemanlarinin hicbirinin character sayisinin 3 den kucuk olmadigini kontrol eden method'u olusturunuz.
    public static boolean noLengthLessThanThree(List<String> names){
        return names.stream().noneMatch(t->t.length()<3);
    } // true

    //Example 5: List elemanlarinin en az birinin character sayisinin 4 den kucuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean atLeastOneLengthLessThanFour(List<String> names){
        return names.stream().anyMatch(t->t.length()<4);
        /* Match
        allMatch() ==> tum elemanlar sarti saglarsa true dondurur
        anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
        noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
         */
    }

}
