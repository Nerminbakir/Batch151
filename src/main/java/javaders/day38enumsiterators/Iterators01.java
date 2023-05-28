package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {
    public static void main(String[] args) {

        /*
            1) Iterator'lar loop'larla aynı işi yapar.
            2) Iterator'larda sonsuz loop olusma ihtimali yoktur.
            3) Iterator'lar ile loop'lar arasında performans farkı yoktur.
            4) Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemanı degistirme konusunda daha basarılıdır.
            5) İki tip iterator vardır : i) Iterator : Bu sadece eleman silmede kullanılır.
                                                       Eleman eklemek veya elemanı degistirmek mumkun degildir.
                                         ii) ListIterator: Bu eleman silebilir, ekleyebilir veya degistirebilir.
                                             Note:"Iterator" sadece soldan saga (ilk elemandan son elemana) calisir.
                                             "ListIterator" ise iki yonlu calisabilir.
         */

        /*
        hasNext(): Bu method, listenin sonraki öğesinin olup olmadığını kontrol eder ve sonraki eleman varsa true değerini döndürür.
        next(): Bu method, listenin bir sonraki elemanını döndürür ve imleci bir sonraki konuma taşır.
        hasPrevious(): Bu method, listenin önceki öğesinin olup olmadığını kontrol eder ve önceki eleman varsa true değerini döndürür.
        previous(): Bu method, listenin bir önceki elemanını döndürür ve imleci bir önceki konuma taşır.
         */


        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);

        // "Iterator" kullanalım
        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()){ // hasNext() pointer'a "Senden sonra eleman var mı?" diye sorar.
                                 // Eleman varsa "true" yoksa "false" return eder.
            myItr.next(); // next() pointer'ı bir sonraki elemanın önüne tasir ve üstünden atladıgı elemanı return eder.
             myItr.remove();// next() methodunun return ettigi elemanı siler.
        }
        System.out.println(myList); // [ ]

        // "ListIterator" kullanalım

        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);// [ Tom,   Jim,   Clara,   Angie,   Mark ]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){

           String el = yourListItr.next();

           yourListItr.set(el + "!");

        }
        System.out.println(yourList); // [Tom!, Jim!, Clara!, Angie!, Mark!]

        //hasPrevious() ve previous() nasil kullanilir? pointer en sonda olmalı
            while(yourListItr.hasPrevious()){

                String el = yourListItr.previous();
                System.out.println(el);
                yourListItr.set("?" + el);

            }
            System.out.println(yourList);// [ ?Tom!,   ?Jim!,   ?Clara! ]

        /*
        hasPrevious() senden önce eleman var mı true ya da false dondurur. Mutlaka imlec listenin sonunda olmalıdır.
         */
            //En sondan en basa nasil iterate edebiliriz?
            LinkedList<String> ourList = new LinkedList<>();
            ourList.add("Tom");
            ourList.add("Jim");
            ourList.add("Clara");
            ourList.add("Angie");
            ourList.add("Mark");
            System.out.println(ourList);

            Iterator<String> ourListItr = ourList.descendingIterator();// descendingIterator() ancak LinkedList ile kulanilabilir. tersten sıralar.

            while(ourListItr.hasNext()){
                String el = ourListItr.next();
                System.out.println(el);
            }
        }

        /*
        Main method icinde bir List olusturduk. Burada loop yerine Iterator kullandik.
        Once List'i Iterator'a donusturmeliyiz ki Iterator icindeki methodlari kullanabilelim.
        Listimizin ismini yazip nokta koyunca orada sirali methdolar icinde Iterator methodunu goruruz ve onu seceriz.
        Bu method bize String Iterator verir. Oyle olunce String Iterator conteynarina ihtiyacimiz olur.
        Biz de Iterator<String> myItr=myList.iterator() olarak conteynerimizi olusturduk. While loop kullandik.
        While icine myItr.hasNext() yazarak iteratordaki sonraki eleman var mi diye soracagiz, varsa onu silmesini
        isteyecegiz. Su sekilde devam ettik:
        myItr.next();
        myItr.remove();
        Sonda sout icine myList yazarak elemanlari bir list icinde ekranda gorebildik. Iterator sayesinde sonsuz loop
        tehlikesi ile karsilasmadik.
        Biz bu kodu yazinca Java ayni elemanlari iterator yapisi icine koydu. Biz liste bakinca bir de iteratora bakinca
        ayni seyi gorsek de yapi olarak farklidirlar. Fark: Ilk elemanin oncesine iterator bir pointer koyuyor.
        Biz has.Next methodu kullaninca bu methodla ilk pointer'a gelip kendisinden sonra bir eleman var mi diye
        sormus olduk. Pointer kendisinden sonra Tom olduguna isaret ediyor yani true oluyor. Daha sonra bir sonraki
        elemanin onune java tarafindan konulan pointer'a gelip senden sonra eleman var mi diye methodumuz sormaya devam eder.
        While loop condition'i true oldugu surece bir sonraki elemanin olup olmadigina bakilir.
        Remove methodu ise gelip var oldugu anlasilan ilk elemanı siler ve sonraki kisma gelir. Once has.Next sonra
        remove methodu her eleman icin calisacak.
         */
    }

