package javaders.day31collections;


import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

     /*
       1) Arraylistler NODE silme ve eklemede tekrar indexleme (silme ya da ekleme yaptıgında
          kendisinden sonraki tum elemanların indexleri artıp ya da azalacaktır) yapmak zorunda olduklarından
          basarısızdırlar. Bu yuzden Java LinkedList'leri olusturmustur.

          NODE ==> data + pointer(kendisinden sonraki datayı gösterir. En basta Head pointer'ı vardır. En sonda ise null vardır.)
          "eleman" kelimesi kullanılmaz. Onun yerine NODE kelimesi kullanılır.
          "eleman" kelimesi ArrayList'lerde kullanılır.

          ArrayList'ler eleman bulmada basarılıdır. Fakat LinkedList'ler eleman bulmada basarısızdır.

       2) LinkedListler index kullanmadıklarından dolayı eleman silme ve eklemede re-index yapılmasına
          gerek yoktur. Bu da LinkedListlerin eleman ekleme ve silmede cok basarılı hale getirir.
          Bu yuzden elemn ekleme ve silmenin cok yapılması gereken durumlarda LinkedList kullanmak tavsiye edilir.
       3) Arraylistlerde "search" işlemi kolay yapılır. Cunku indexler adres gibidir.
       4) LinkedListlerde "search" işlemi zor yapılır. Cunku LinkedListler index kullanmaz.
          index kullanmayınca herhangi bir elemanı bulmak için en bastan tum elemanlar kontrol edilir.
          Bu da cok fazla iş demektir.

          S.H Notları

          1)LinkedList'ler node silme ve ekleme'de cok basarili olduklari icin,
          silme ve ekleme islemlerini coklukla yapacaginiz zaman LinkedList kullaniniz.
          2)ArrayList'ler index'leri adres gibi kulanir, bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
          Note: Ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa (muze ziyaretcileri gibi) Linkedlist,
              "search" islemleri yapacaksa (Amerika eyaletleri gibi) ArrayList kullaniniz.
        */

        LinkedList <String> s = new LinkedList<>();
        s.add("Merve");
        s.add("Murat");
        s.add("Vildan");
        s.add("Fatih");
        s.add("Mustafa");
        s.add("Fatih");
        s.add(1, "Caner"); // LinkedList'ler index kullanmaz. Buradaki index aslında bildigimiz index degil. Sadece node eklemek için index gibi dusunebiliriz.
        System.out.println(s); // [Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih] VERDİĞİMİZ SIRAYA GÖRE EKLER.

        s.addFirst("Ahmet"); // İlk sıraya ekler.
        System.out.println(s); // [Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih]

        s.addLast("Enver"); // Son sıraya ekler. add() methoduyla aynı isi yapar. addLast () methodu okunurlugu arttırmak için vardır.
        System.out.println(s); // [Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]

//        s.remove(2);
//        System.out.println(s);

//        s.remove("Ahmet");
//        System.out.println(s);

//        s.removeFirstOccurrence("Fatih"); ilk görünümü siler
//        System.out.println(s);

//        s.removeLastOccurrence("Fatih"); son görünümü siler
//        System.out.println(s);

//        s.remove(); ilk elemanı siler
//        System.out.println(s);

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
        Bu listenin başını (ilk öğesini) alır, ancak kaldırmaz (silmez).
        İadeler: bu listenin başı veya bu liste boşsa boş (null verir)
         */
        String r1 = s.peek(); // copy + paste (ilk node u silmeden bize verir.)
        System.out.println(r1); // Ahmet
        System.out.println(s); // [Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]

        String r2 = s.poll(); // cut + paste ilk node u silip verir.
        System.out.println(r2); // Ahmet
        System.out.println(s); // [Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]

        /*
        Retrieves, but does not remove, the head (first element) of this list.
        Returns: the head of this list
        Throws: NoSuchElementException – if this list is empty
        NOTE : peek() ile element() ikisi de ilk elemanı silmeden bize verir.
               Ama peek() list bos oldugunda bize "null" verir, element () ise "exception (hata) verir.
         */
        String r3 = s.element(); // copy + paste ilk node u silmeden verir.
        System.out.println(r3); // Merve
        System.out.println(s); // [Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]

        // poll() ile pop() methodları ilk node u siler ve size verir.
        // poll() list bos oldugunda size null verir.
        // pop() ise hata verir.
        String r4 = s.pop();
        System.out.println(r4); // Merve
        System.out.println(s); // [Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]




    }
}
