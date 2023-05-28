package javaders.day31collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {

    /*

    1) Set'ler tekrarsız (unique) eleman depolamak için kullanılır. örn ; TC kimlik no, üniversite no gibi
    2) 3 tane Set Class'ı vardır. (set == tekrarsız)
       a) HashSet Class :
          "Hash" benzersiz bir Id olusturma tekniğidir. Bu teknige "hashing technique" denir.
          "HashSet" elemanları rastgele (random) sıralar.
          "HashSet" elemanları sıralamadıgından cok hızlı calısır.
          "HashSet"ler tekrarsız eleman depolamak için kullanılır.
          "HashSet"ler "null"ı eleman olarak kabul eder. ve bir tane koyabiliriz.(tekrarsız old için)

       b) LinkedHashSet Class :
          "LinkedHashSet" elemanları sizin verdiğiniz sıraya göre (insertion order-yerlestirme sırası) dizdiklerinden "HashSet"lere göre yavastırlar.
          "LinkedHashSet" tekrarsız eleman depolamak için kullanılır.

       c) TreeSet Class :
          "TreeSet"ler elemanları natural order'a göre (kücükten büyüge - alfabetik sıra) dizerler.
          "TreeSet"ler elemanları natural order'a göre dizdiklerinden coooooook yavastırlar.
          En yavas set "TreeSet"lerdir. Bu yuzden tercih edilmez. Mumkun oldugu kadar TreeSet kullanmamaya calisiriz.
          "TreeSet"ler tekrarsız eleman depolamak için kullanılır.

     */

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Merve");
        hs.add("Tuba");
        hs.add("Sema");
        hs.add("Fatih");
        hs.add("Rana");
        hs.add("Sema"); // Tekrarlı eleman eklediğinizde hata vermez. Ama tekrarlı elemanı 1 kere ekler.

        System.out.println(hs); // [Fatih, Sema, Rana, Merve, Tuba]
        // "HashSet" elemanları rastgele (random) sıralar.
        // "HashSet"ler tekrarsız eleman depolamak için kullanılır.

        System.out.println(hs.hashCode()); // 149615145 ==> genelde hic kullanılmaz.

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(313);
        lhs.add(19);
        lhs.add(353);
        lhs.add(7);
        lhs.add(null);
        // lhs.add(null);  ikinciyi yazmaz
        System.out.println(lhs); // [313, 19, 353, 7, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();

        ls.add(313);
        ls.add(195);
        ls.add(353);
        ls.add(17);

        System.out.println(ls); // [313, 195, 353, 17]

        lhs.retainAll(ls);
        // İlk LinkedHashSet'deki (lhs) farklı elemanları siler. (19, 7) Ortak olanları yazdırır. ikinci LinkedHashSeti (ls) oldugu gibi yazdırır.
        System.out.println(lhs); // [313, 353]
        System.out.println(ls); // [313, 195, 353, 17]

        TreeSet <Character> ts = new TreeSet<>(); // Collections'lar primitive'ler ile calısmaz. Non primitive ve Wrapper Class ile calısır.
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null); TreeSetler'e null eklenemez. Alfabetik sıraya göre dizdiği için null'ı ne yapacagını bilemez.
        System.out.println(ts); // [A, G, R, U, Z]

        System.out.println(ts.first()); // A
        System.out.println(ts.last()); // Z

        System.out.println(ts.lower('R')); // G ==> kendinden önceki elemanı verir.

        System.out.println(ts.lower('D')); // A ==> Eger D harfi olsaydı A harfinden sonra yazılacagı için
        System.out.println(ts.lower('A')); // null

        System.out.println(ts.higher('R')); // U ==> kendinden sonraki elemanı verir.
        System.out.println(ts.higher('T')); // U ==> T harfi sette olsaydı bir sonraki harfi verecegı için U harfini verir.

        System.out.println(ts.headSet('R')); // [A, G] parantez içindeki R dahil degil.
        System.out.println(ts.headSet('R', true)); // [A, G, R] inclusive == dahil et

        System.out.println(ts.tailSet('R')); // [R, U, Z] parantez içindeki R dahildir.
        System.out.println(ts.tailSet('R', false)); // [U, Z]

        System.out.println(ts.ceiling('R')); // R  (ceiling == tavan, catı) eleman setin içinde varsa elemanın kendisi return eder.
        System.out.println(ts.ceiling('T')); // U ==> eleman setin içinde yoksa sonraki eleman return eder.

        System.out.println(ts.floor('G')); // G   (floor == taban, zemin) eleman setin içinde varsa elemanın kendisi return eder.
        System.out.println(ts.floor('T')); // R ==> eleman setin içinde yoksa önceki eleman return eder.

        System.out.println(ts.subSet('G', 'Z')); // [G, R, U] ilk eleman dahil ikinci eleman haric
        System.out.println(ts.subSet('G', 'V')); // [G, R, U] treeset'te olmayan elemanı yazarsak yine aynı sonucu verir.
        System.out.println(ts.subSet('G', false, 'Z',true)); // [R, U, Z]

    }
}
