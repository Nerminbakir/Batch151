package javaders.day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {
        /*
        Bir method'u ogrenirken asagidaki 3 seyi ogrenin;
        1) O method ne iş yapar?
        2) O method nasıl kullanılır?
        3) O method size neyi verir?
     */

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities); // [Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        // ArrayListte bir elemanın ilk görunumu nasıl silinir?
        // remove () methodu bir elemanın ilk görunumunu siler.

        System.out.println(cities.remove("Miami")); // true ==> remove (); içine silinecek elemanı yazarsak bize true verir.
        System.out.println(cities); // [Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        // ArrayListte bir eleman indexi kullanarak nasıl silinir?

        System.out.println(cities.remove(2)); // Barcelona ==> remove (); içine silinecek elemanın indexini yazarsak bize o elemanı verir.
        System.out.println(cities); // [Giresun, Yozgat, Miami, Giresun, Giresun, Yozgat]

        // remove () methodu eleman ile kullanılırsa ilk gorunumu siler.
        // remove () methodu eleman ile kullanılırsa size o elemanı silip silmediğini ifade eden true ya da false verir.

        // Example = Bir Integer List olusturun ve 12 elemanını siliniz.
        //Arraylist olustururken sag tarafa (constructor) Arraylist yazmak zorundasiniz
        //Ama sol tarafa ister Arraylist yazin ister List yazin ikiside calisir
        //Detaylari Collections konusunda gorecegiz

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        // ages.remove(12);
        // System.out.println(ages); hata verir. Cunku 12'yi index kabul eder.

        //1.Way
//        Integer nonPrimitive = 12;
//        ages.remove(nonPrimitive);
//        System.out.println(ages);

        // 2. Way Recommended
        ages.remove((Integer)12); // wrapper
        System.out.println(ages); // [23, 7, 4]

        // 3.Way
//
//        ages.remove(ages.indexOf(12));
//        System.out.println(ages);

        //Bir ArrayList'teki bir elemanin tum gorunumlerini nasil sileriz?
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Giresun");
        citiesToRemove.add("Yozgat");

        System.out.println(cities.removeAll(citiesToRemove));//true
        System.out.println(cities);// [Miami]

        // Kısa yoldan bir list olusturmak için List.Of () methodunu kullanabiliriz.
        // List.of () methodu degiştirilemez bir liste olusturmak için kullanılır.
        // Bu method ile olusturulan list degiştirmeye yonelik methodları desteklemez.

        List<Character> initials = List.of('a', 'b', 'a', 'c', 'd');
        System.out.println(initials); // [a, b, a, c, d]

        // initials.add('e');
        // initials.remove(0);
        //initials.set(0,'u');
        System.out.println(initials);

        // İki ArrayList'in birbirine esit olup olmadıgını nasıl anlarız?

        List<Character> letters = List.of('a', 'b', 'e', 'd', 'c');
        System.out.println(letters); // [a, b, e, d, c]

        boolean r = initials.equals(letters); // ==> equals (); aynı elemanlar aynı indexte oldugu surece true verir.
        System.out.println(r); // false

        // indexOf (aranan karakter) methodu aranan karakterin ilk görunumunun indexini verir.
        int r1 = initials.indexOf('c');
        System.out.println(r1); // 3

        // lastIndexOf () methodu aranan karakterin son gorunumunun indexini verir.

        int r2 = initials.lastIndexOf('a');
        System.out.println(r2); //2

        // Example 2 = Bir listteki tekrarsız elemanları console'a yazdırınız.
        List<Double> prices = List.of(2.5,   1.25,   2.5,   3.75,   1.25,   4.0);

        for (Double w : prices ) {
            if(prices.indexOf(w)==prices.lastIndexOf(w)){ // ilk görünümün indexi ile son görünümün indexi birbirine esitse tekrarsız demektir.
                System.out.print(w + " "); // 3.75  4.0
            }
        }
        System.out.println();


        // Example 3 = Bir listte tekrarlı eleman olup olmadıgını gösteren kodu yazınız

        List<Integer> heights = List.of(3, 13, 3);

        int counter = 0;

        for (Integer w : heights) {

            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
        }
            if (counter == 0){ // KULLANICIYA BİR MESAJ VERMEK İSTEDİĞİMİZ İÇİN COUNTER İLE YAPTIK
                System.out.print("All elements are unique in the list");
            }else{
                System.out.println("At least one element is not unique in the list");
            }


    }
}

                //  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!       CLASS İLE CAGRILAN METHODLAR STATİC TİR.
